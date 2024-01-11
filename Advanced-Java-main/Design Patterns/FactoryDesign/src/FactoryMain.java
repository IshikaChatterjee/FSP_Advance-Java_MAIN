import com.phone.OS;
import com.phone.Android;
import com.phone.Windows;
import com.phone.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
//		OS obj = new Windows();
//		obj.spec();
		  
		OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("fafadv");
        obj.spec();
	}

}
