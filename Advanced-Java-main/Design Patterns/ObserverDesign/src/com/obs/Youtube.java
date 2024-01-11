package com.obs;

public class Youtube {

	public static void main(String[] args) {
		
		Channel dbz = new Channel();
		Subscriber s1 = new Subscriber("Suvra");
		Subscriber s2 = new Subscriber("Soumodip");
		Subscriber s3 = new Subscriber("Souvik");
		Subscriber s4 = new Subscriber("Tanvir");
		Subscriber s5 = new Subscriber("Chirag");
		
		dbz.subscribe(s1);
		dbz.subscribe(s2);
		dbz.subscribe(s3);
		dbz.subscribe(s4);
		dbz.subscribe(s5);
		
		dbz.unSubscriber(s3);
		
		s1.subscribeChannel(dbz);
		s2.subscribeChannel(dbz);
		s3.subscribeChannel(dbz);
		s4.subscribeChannel(dbz);
		s5.subscribeChannel(dbz);
		
		dbz.upload("Jiren vs Goku Final Battle");

	}

}
