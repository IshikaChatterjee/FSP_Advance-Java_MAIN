import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","test1234");
			//"javaAPI:database:driver:our_own_system:port_number:oracle_service","user_name","password"
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Emp id: ");
				int eno = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Emp Name: ");
				String ename = br.readLine();
				
				System.out.println("Enter Emp Salary: ");
				int esal = Integer.parseInt(br.readLine());
				
				psmt.setInt(1, eno);
				psmt.setString(2, ename);
				psmt.setInt(3, esal);
				
				int count = psmt.executeUpdate();
				if(count>0) {
					System.out.println(count+ "Record Inserted");
				}
				else {
					System.out.println("No Record Inserted");
				}
				System.out.println("Do You Want To Insert More Records[YES/NO]");
				
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
