package edu.rj.test;

public class Fish extends Aquatic {
	//构造函数
	Fish(){
		
	}
	Fish(String myName,String myAddress, int myAge){
		name = myName;
		address = myAddress;
		age = myAge;
	}
	
	//游
	public void Swim() {

		System.out.println("游动");
	}
	//叫
	public void Shout() {

		System.out.println("沙沙沙");
	}

	// 设置与获取姓名
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 设置与获取地址
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 设置与获取年龄
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
