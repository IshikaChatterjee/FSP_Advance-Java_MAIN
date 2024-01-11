package com.obs;
import java.util.List;
import java.util.ArrayList;

public class Channel {

	private List<Subscriber> subs = new ArrayList<>();
	String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	public void unSubscriber(Subscriber sub) {
		subs.remove(sub);
	}
	public void notifySubscribers() {
		for(Subscriber sub : subs) {
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
}
