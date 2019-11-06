package LinkPool;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class LinkPool {
	
	public static void main(String[] args) {
		
	}
   
	 public void getConnection() throws Exception{
	    	Properties pros = new Properties();
	    	
	    	InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
	    	
	    	pros.load(is);
	    	
	    	DataSource source = DruidDataSourceFactory.createDataSource(pros);
	    	Connection conn = source.getConnection();
	    	System.out.println(conn);
	    }
}
