package com.phone;
public class Shop {
   public static void main(String args[]) {
//	   Phone p = new Phone("Android",6,"Snapdragon",6.7,5000);
	   Phone p = new PhoneBuilder().setOs("Android").setRam(6).setBattery(5000).getPhone();
	   System.out.println(p);
   }
}
