import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","test1234");
			//"javaAPI:database:driver:our_own_system:port_number:oracle_service","user_name","password"
			
			Statement smt = con.createStatement();
			smt.executeUpdate("create table emp(eno number, ename varchar(12), esal number)");
			
			System.out.print("Table Created Successfully...");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		

	}

}
