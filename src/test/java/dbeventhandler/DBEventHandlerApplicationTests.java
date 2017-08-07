package dbeventhandler;

import dbeventhandler.domain.Column;
import dbeventhandler.domain.Table;
import dbeventhandler.config.TableMappingProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DBEventHandlerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private TableMappingProperties tableMappingProperties;

	@Test
	public void testGetArticles() {

		Table table = tableMappingProperties.getTable();
		System.out.println(table.getOrgName());
		System.out.println(table.getTargetName());

		List<Column> columns = tableMappingProperties.getColumns();

		Column col = new Column();
		for(int i=0; i<columns.size(); i++){
			col = columns.get(i);
			System.out.println(col.getOrgName());
			System.out.println(col.getTargetName());
		}
		assertThat(columns.size(), is(2));
	}


}
