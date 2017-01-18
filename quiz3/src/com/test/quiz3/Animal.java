package com.test.quiz3;

public class Animal {

	int length;//몸길이
	int weight;//몸무게
	int speed;//이동속도
	int age;//나이
	int life;//수명
	int skin;//표면(1=털, 2=깃털, 3=딱딱, 4=미끈)
	int legs;//다리갯수
	int wings;//날개쌍
	int feed;//먹이(1=동물, 2=식물 , 3=잡식)
	int breathe;//숨쉬는방법(1=허파, 2=아가미)
	int habitat;//서식지(1=육지, 2=바다,3=둘다)
	int horns;//뿔
	int strength;//체력
	boolean alive;
	String action;
	//생성자, 값 초기화
	public Animal(){
		length=0; weight=0; speed=0; age=0; life=0; skin=0; legs=0;
		wings=0; feed=0; breathe=0; habitat=0; horns=0; alive=true;
	};
	

	boolean eat(Animal feed){
		if(this.feed==1||this.feed==3){
		//먹이인 동물의 무게->포만감
			if(this.alive==true){
			int satiety=feed.weight/10;
			this.weight+=satiety;
			this.strength += satiety;
			return true;
			}
		}
		return false;
	};
	//초식동물, 오버로딩
	boolean eat(Plant feed){
		//Plant class 생성
		if(this.feed==2||this.feed==3){
			return true;
		}
		return false;
	};
	
	boolean attack (Animal enemy) {
		if (this.alive==true && enemy.alive==true){
			int defence=enemy.weight;
			defence=defence/(enemy.age*100/enemy.life);
			defence+=enemy.speed*(Math.random()*10);
			if(enemy.skin==3)
				defence+=defence*0.2;
			else if(enemy.skin==4)
				defence+=defence*0.3;
			System.out.println("방어력 "+defence);//debug 코드

			int attack=this.weight;
			if(this.feed==1)
				attack+=attack*0.3;
			attack+=this.speed*(Math.random()*10);
			attack+=this.horns*(Math.random()*5);
			if (this.wings>0)
				attack*=2;
			System.out.println("공격력 "+attack);//debug 코드
			int demage=attack-defence;
			if (demage>0) {
				enemy.strength-=demage;
				if(enemy.strength<0) enemy.alive=false;
				return true;
			}
			else if (demage<0){	
				this.strength+=demage;
				if(this.strength<0)
					this.alive=false;	
			}
		}
		return false;
	};
	
	void run(){
		
	};
}