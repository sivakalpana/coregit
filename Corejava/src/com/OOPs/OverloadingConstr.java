package com.OOPs;
class Shop{
	int itemid;
	int price;
	String name;
	Shop(int a , int b){
		itemid = a;
		price = b;
		name = "XYZ";
		System.out.println(itemid+ " " +price+ " " +name);
	}
	Shop(int i , int p, String n){
		itemid =i;
		price =p;
		name = n;
		System.out.println(itemid+ " " +price+ " " +name);
	}
}


public class OverloadingConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shop s1 = new Shop(1 , 100);
      Shop s2 = new Shop(10, 1500, "mary");
      
	}

}
