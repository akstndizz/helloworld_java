package com.test.quiz4;

public class ThreadExam {
	public static void main(String args[]) {

		
		
		
		
		//멀티쓰레드
		/*
		Thread[] multiThread=new Thread[1000];
		for (int i=0;i<100;i++){
			multiThread[i]=new Thread(new Runnable(){
				@Override
				public void run(){
					for(int i=0;i<10;i++){
						System.out.println(i+"-----"+
						Thread.currentThread().getName());
						try {
							Thread.sleep(500);
						} catch(Exception e){}
					}
				}
			});
			multiThread[i].start();
		}
		*/
		
		
		
		
		
		
		
		
		
		
		//일반스레드
		/*		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(i + "*****");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		});
		thread1.start();

		for (int i=0; i<100000;i++){
			System.out.println(i);
		try{
			Thread.sleep(500);
		} catch(Exception e){}
		
		}*/
	}
}