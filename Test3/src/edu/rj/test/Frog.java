package edu.rj.test;

public class Frog extends Amphibian {
	//构造函数
	Frog(){
		
	}
	Frog(String myName,String myAddress, int myAge){
		name = myName;
		address = myAddress;
		age = myAge;
	}
	//跑
	public void Run() {
		
		System.out.println("用后腿眺");
	}
	//游
	public void Swim() {

		System.out.println("蛙泳");
	}
	//叫
	public void Shout() {
		
		System.out.println("呱呱呱");
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
