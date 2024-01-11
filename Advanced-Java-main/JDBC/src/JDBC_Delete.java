import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","test1234");
			//"javaAPI:database:driver:our_own_system:port_number:oracle_service","user_name","password"
			Statement smt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Deletion Emp id: ");
				int eno = Integer.parseInt(br.readLine());
				
				int count = smt.executeUpdate("delete from emp where eno="+eno);
				if(count==1) {
					System.out.println(count+ "Record Deleted");
				}
				else {
					System.out.println("No Record Deleted");
				}
				System.out.println("Do You Want To Delete More Records[YES/NO]");
				
				String ch = br.readLine();
				if(ch.equalsIgnoreCase("no"))
				break;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
