package dbeventhandler.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import dbeventhandler.domain.KafkaLog;
import org.springframework.stereotype.Component;

@Component
public class LogParser {

    public KafkaLog parse(String contents){

        KafkaLog kafkaLog = null;

        //TODO: Exception for..json format
        try {
            ObjectMapper mapper = new ObjectMapper();
            kafkaLog = mapper.readValue(contents, KafkaLog.class);
            System.out.println("LogParser.parse.result: " + kafkaLog.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return kafkaLog;
    }

}
