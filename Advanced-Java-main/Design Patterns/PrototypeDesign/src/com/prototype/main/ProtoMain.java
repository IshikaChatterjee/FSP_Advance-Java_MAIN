package com.prototype.main;

public class ProtoMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		bs.setShopName("Book Shop");
		bs.loadData();
		bs.getBooks().remove(2);
		System.out.println(bs);
		
		
		
		BookShop bs1 = (BookShop)bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("A1");
//		bs1.loadData();
		System.out.println(bs1);

	}

}
