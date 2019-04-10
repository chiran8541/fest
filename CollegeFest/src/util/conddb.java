package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class conddb {
	 static  String username ="root";
     static String password="root";
     static String url="jdbc:mysql://localhost/logindb";
      static String drivername="com.mysql.jdbc.Driver";
      
      
      public static final Connection openCon()
      {
          try{
                  Class.forName(drivername);
                  
                  Connection connection= null;
                  connection=DriverManager.getConnection(url,username,password);   
                  System.out.println("checkpoint 1");
                  return connection;
          }
          catch(Exception e){
              e.printStackTrace();
          }
          return null;
        
      }
      
       public static final void closeCon(Connection connection)
       {
           try{
               connection.close();
           }
            catch(Exception e){
              e.printStackTrace();
          }
       }
}
