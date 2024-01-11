import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args) {
		String value; int eid; int esal;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","test1234");
			//"javaAPI:database:driver:our_own_system:port_number:oracle_service","user_name","password"
			Statement psmt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("Enter Emp id: ");
				value = br.readLine();
				eid = Integer.parseInt(value);
				
				System.out.println("Enter Emp New Salary: ");
				value = br.readLine();
				esal = Integer.parseInt(value);

				
				int count = psmt.executeUpdate("update emp set esal="+esal+" where eno="+eid);
				if(count>0) {
					System.out.println(count+ "Record Updated");
				}
				else {
					System.out.println("No Record Found");
				}			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
