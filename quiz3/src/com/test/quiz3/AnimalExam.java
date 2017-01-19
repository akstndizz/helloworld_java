package com.test.quiz3;

public class AnimalExam {
	public static void main(String []args){
		
		//170118 12시 수업
		Animal monkey1=new Animal();
		monkey1.feed=1;
		monkey1.strength=monkey1.weight=310;
		monkey1.skin=1;
		monkey1.speed=65;
		monkey1.life=26; monkey1.age=2;
		
		Monkey monkey2=new Monkey(2);
		
		//170119 11시 수업
		//monkey1.smoking(); 정상
		monkey2.smoking();
		
		Animal monkey3=monkey2;
		//monkey3.smoking(); 정상	
		Monkey monkey4=(Monkey)monkey3;
		monkey4.smoking();

		System.out.println(monkey1 instanceof Animal);
		System.out.println(monkey1 instanceof Monkey);
		System.out.println(monkey2 instanceof Animal);
		System.out.println(monkey2 instanceof Monkey);
		System.out.println(monkey3 instanceof Animal);
		System.out.println(monkey3 instanceof Monkey);
		System.out.println(monkey4 instanceof Animal);
		System.out.println(monkey4 instanceof Monkey);
		System.out.println("-----------------------");
		
		//170118 12시 수업
		System.out.println(monkey1.eat(monkey2));
		System.out.println(monkey2.strength);
		System.out.println(monkey2.eat(monkey1));
		System.out.println(monkey1.strength);
		System.out.println("-----------------------");

		System.out.println(monkey2.eat(monkey1));
		System.out.println(monkey1.strength);
		System.out.println(monkey1.eat(monkey2));
		System.out.println(monkey2.strength);
		System.out.println("-----------------------");
		///////////////////////////////////////
		Animal monkey=new Animal();
		Animal tiger=new Animal();
		monkey.feed=2; tiger.feed=1;
		
		Plant carret=new Plant();
		

		System.out.println(tiger.eat(monkey));
		System.out.println(monkey.eat(tiger));
		System.out.println(tiger.eat(carret));
		System.out.println(monkey.eat(carret));
		//////////////////////////////////////////////////
		Animal dog=new Animal();
		dog.strength=dog.weight=27;
		dog.skin=1;
		dog.speed=35;
		dog.life=15; dog.age=8;
		dog.feed=3;
		
		tiger.strength=tiger.weight=310;
		tiger.skin=1;
		tiger.speed=65;
		tiger.life=26; tiger.age=2;
		
		System.out.println(dog.attack(tiger));
		System.out.println(dog.strength);
		
		Animal bear=new Animal();
		bear.strength=bear.weight=600;
		bear.skin=1;
		bear.speed=40;
		bear.life=20; bear.age=3;
		bear.feed=3;
		
		System.out.println(tiger.attack(bear));
		System.out.println(bear.strength);
		System.out.println(bear.attack(tiger));
		System.out.println(tiger.strength);
	}
}
