package edu.rj.test;

public  class Dog extends TerrestrialElse {
	//构造函数
	Dog(){
		
	}
	Dog(String myName,String myAddress, int myAge){
		name = myName;
		address = myAddress;
		age = myAge;
	}
	//叫
	public void Shout() {
		
		System.out.println("汪汪汪");
	}
	//跑
	public void Run() {
		
		System.out.println("四条腿跑");
	}
	//设置与获取姓名
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//设置与获取地址
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	//设置与获取年龄
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
