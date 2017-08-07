package dbeventhandler.util;

import dbeventhandler.config.TableMappingProperties;
import dbeventhandler.domain.Column;
import dbeventhandler.domain.KafkaLog;
import dbeventhandler.domain.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class TableInfoMapper {

    @Autowired
    private TableMappingProperties tableMappingProperties;

    public void mapping(KafkaLog kafkalog){
        //1.check dml type
        //TODO change as constants...
        if("I".equals(kafkalog.getType())){
            System.out.println("Insert!");
        }
        else if("U".equals(kafkalog.getType())){
            System.out.println("Update!");
        }else{
            System.out.println("Delete!");
        }

        //2. check table scheme.
        //TODO Table과 DML Type으로 rule 명세 조회
        Table table = tableMappingProperties.getTable();
        if(table.getOrgName().equals(kafkalog.getTable())) {

            System.out.println("[TableMapper.table] : " + table.toString());
            Map columnMap = kafkalog.getBeforeLog();

            Iterator<String> keys = columnMap.keySet().iterator();
            while( keys.hasNext() ){
                String key = keys.next();
                System.out.println( String.format("column: %s,value: %s", key, columnMap.get(key)) );
            }

           tableMappingProperties.getColumns();



        }

    }
}
