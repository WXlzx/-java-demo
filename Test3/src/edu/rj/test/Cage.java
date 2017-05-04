package edu.rj.test;

public class Cage {

	public static void main(String[] args) {
		Dog dog = new Dog("旺财","陆生",3);
		Fish fish = new Fish ("Nemo","水生",1);
		Frog forg = new Frog("呱呱蛙","两栖",1);
		
		dog.Run();
		dog.Shout();
		fish.Swim();
		fish.Shout();
		forg.Run();
		forg.Swim();
		forg.Shout();
	}

}
