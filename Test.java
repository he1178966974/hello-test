package com.yzu;

public class Test {
	public static void main(String[] args) {
		People people = new People("泽西岛",'Ů',18);  //people��һ����ַ
//		people.setName("泽西岛");
//		people.setAge(18);
//		people.setSex('女');
//		System.out.println(people);
		
		people.eat();
		people.sleep("hotel");
		people.playGame();
	}
}
