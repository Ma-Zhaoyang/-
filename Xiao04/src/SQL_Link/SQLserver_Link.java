package SQL_Link;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLserver_Link {
	 public static void main(String[] args) throws SQLException {
		 String str = "";
		 try{  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("连接成功1");
         }
         catch(Exception e) {
         		System.out.println("连接失败1");
         }
        String connectionUrl =
                "jdbc:sqlserver://127.0.0.1:1433;"
                        + "databaseName=test;"
                        + "user=sa;"
                        + "password=123456789";
        Connection con = null;//处理与特定数据库的连接

        try {
        		 con = DriverManager.getConnection(connectionUrl);
				System.out.println("连接成功2");
				Statement stmt = con.createStatement(
		        		ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		        String sql = "select * from link ";
		        ResultSet rs = stmt.executeQuery(sql);
		        if(rs.next())
		          str = rs.getString("password");
		        rs.close();
		        stmt.close();
		        con.close();
		        System.out.println(str);
}
		catch(SQLException e) {
				System.out.println("请输入正确的表名"+e);
				System.out.println("连接失败2");
       }  
   }
}