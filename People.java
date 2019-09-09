package com.yzu;

public class People {
	//name
	private String name;
	//sex
	private char sex;
	//age
	private int age;
	
	
	//右击 source -> generate setting and getting
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//tostring   右击 source -> generate tostring
	@Override
	public String toString() {
		return "People [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	

	public People() {
		
	}
	public People(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//eating
	public void eat() {
		System.out.println("I want to eat food");
		//syso   alt+?
	}
	public void sleep(String where) {
		System.out.println("tonight I will sleep in "+ where );
	}
	public int playGame() {
		int count = (int)(Math.random()*10);
		System.out.println("��һ���"+count+"��������ҫ");
		return count;
	}

	// main  alt+?  + enter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		//System.out.println(human);
		people.name = "苍井空";
		people.age = 20;
		people.sex = '女';
		people.eat();
		people.sleep("宾馆");
		people.playGame();
	}

}
