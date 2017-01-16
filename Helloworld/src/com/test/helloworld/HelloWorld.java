package com.test.helloworld;

import java.util.Scanner;

public class HelloWorld {
	
	
	public static void type_a() {
	
		int score = 0;
		System.out.println("����A Ž���� �����մϴ�. \n\n");
		
		System.out.println("Q1. �׿� �Ļ縦 �ϴ� ����, ���� �̿� �� ���Ĺ��� ���Ҵ�. ���� ��� �ؾ� �ұ�? \n");
		System.out.println("\t1. �ٷ� ����� ���� �ش�. \n");
		System.out.println("\t2. ���� ������ ���� �ش�. \n");
		System.out.println("\t3. ��������� ���� ���ش�. \n");
		System.out.println("\t4. �����Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ2. ������ �� �԰� �װ� ����� �ߴ�. �� �� ���� ��� �ൿ�� �ұ�? \n");
		System.out.println("\t1. \"Ŀ�Ǵ� ���� ��Կ�\"��� ���Ѵ�. \n");
		System.out.println("\t2. \"�� �Ծ����\"��� ���Ѵ�. \n");
		System.out.println("\t3. \"���¸� �ҷ��ּ���.\"��� ���Ѵ�. \n");
		System.out.println("\t4. �׳� ������ ��ٸ���. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ3. �Ļ縦 ���� ��, ���� �����ұ�? \n");
		System.out.println("\t1. �̾߱⸦ �� ���� �� �ִ� ī�� \n");
		System.out.println("\t2. �� �� ������� �� �ִ� ���� \n");
		System.out.println("\t3. ���� �ŷ��� ������ �� �ִ� �뷡�� \n");
		System.out.println("\t4. �׿� ��� ���� �� �� �ִ� �� ��... \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ4. ����Ʈ�� ������ ���� ������ �ð��̴�. ��ħ �� ������ ������ ���� ��� �ؾ��ұ�? \n");
		System.out.println("\t1. \"�� �� �ҷ���~?\"��� ���Ѵ�. \n");
		System.out.println("\t2. ���� ������ ����ϱ� ���� ���� �ɾ��. \n");
		System.out.println("\t3. �д��� �ϱ� ���� ����� �ִٰ� �׸� ȥ�� ������. \n");
		System.out.println("\t4. ���� ���� �� ���ٰ� �������� �Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ5. ������� �� �� �׿��� �޼����� �Դ�. ���� ��� �ұ�? \n");
		System.out.println("\t1. ��ȭ�� �Ѵ�. \n");
		System.out.println("\t2. ���� ������ �Ѵ�. \n");
		System.out.println("\t3. ������ ���� ������ ���Ѵ�. \n");
		System.out.println("\t4. �а� �ʴ´�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=20;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("Ž���� �������ϴ�. ����� ������ " + score + "�� �Դϴ�.");
	}
	
	public static void type_b() {
		
		int score = 0;
		System.out.println("����A Ž���� �����մϴ�. \n\n");
		
		System.out.println("Q1. �׿� �Ļ縦 �ϴ� ����, ���� �̿� �� ���Ĺ��� ���Ҵ�. ���� ��� �ؾ� �ұ�? \n");
		System.out.println("\t1. �ٷ� ����� ���� �ش�. \n");
		System.out.println("\t2. ���� ������ ���� �ش�. \n");
		System.out.println("\t3. ��������� ���� ���ش�. \n");
		System.out.println("\t4. �����Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=10;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=15;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ2. ������ �� �԰� �װ� ����� �ߴ�. �� �� ���� ��� �ൿ�� �ұ�? \n");
		System.out.println("\t1. \"Ŀ�Ǵ� ���� ��Կ�\"��� ���Ѵ�. \n");
		System.out.println("\t2. \"�� �Ծ����\"��� ���Ѵ�. \n");
		System.out.println("\t3. \"���¸� �ҷ��ּ���.\"��� ���Ѵ�. \n");
		System.out.println("\t4. �׳� ������ ��ٸ���. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ3. �Ļ縦 ���� ��, ���� �����ұ�? \n");
		System.out.println("\t1. �̾߱⸦ �� ���� �� �ִ� ī�� \n");
		System.out.println("\t2. �� �� ������� �� �ִ� ���� \n");
		System.out.println("\t3. ���� �ŷ��� ������ �� �ִ� �뷡�� \n");
		System.out.println("\t4. �׿� ��� ���� �� �� �ִ� �� ��... \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=10;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=20;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ4. ����Ʈ�� ������ ���� ������ �ð��̴�. ��ħ �� ������ ������ ���� ��� �ؾ��ұ�? \n");
		System.out.println("\t1. \"�� �� �ҷ���~?\"��� ���Ѵ�. \n");
		System.out.println("\t2. ���� ������ ����ϱ� ���� ���� �ɾ��. \n");
		System.out.println("\t3. �д��� �ϱ� ���� ����� �ִٰ� �׸� ȥ�� ������. \n");
		System.out.println("\t4. ���� ���� �� ���ٰ� �������� �Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ5. ������� �� �� �׿��� �޼����� �Դ�. ���� ��� �ұ�? \n");
		System.out.println("\t1. ��ȭ�� �Ѵ�. \n");
		System.out.println("\t2. ���� ������ �Ѵ�. \n");
		System.out.println("\t3. ������ ���� ������ ���Ѵ�. \n");
		System.out.println("\t4. �а� �ʴ´�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=20;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("Ž���� �������ϴ�. ����� ������ " + score + "�� �Դϴ�.");
	}
	
	public static void type_c() {
		int score = 0;
		System.out.println("����A Ž���� �����մϴ�. \n\n");
		
		System.out.println("Q1. �׿� �Ļ縦 �ϴ� ����, ���� �̿� �� ���Ĺ��� ���Ҵ�. ���� ��� �ؾ� �ұ�? \n");
		System.out.println("\t1. �ٷ� ����� ���� �ش�. \n");
		System.out.println("\t2. ���� ������ ���� �ش�. \n");
		System.out.println("\t3. ��������� ���� ���ش�. \n");
		System.out.println("\t4. �����Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=5;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=20;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ2. ������ �� �԰� �װ� ����� �ߴ�. �� �� ���� ��� �ൿ�� �ұ�? \n");
		System.out.println("\t1. \"Ŀ�Ǵ� ���� ��Կ�\"��� ���Ѵ�. \n");
		System.out.println("\t2. \"�� �Ծ����\"��� ���Ѵ�. \n");
		System.out.println("\t3. \"���¸� �ҷ��ּ���.\"��� ���Ѵ�. \n");
		System.out.println("\t4. �׳� ������ ��ٸ���. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=15;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ3. �Ļ縦 ���� ��, ���� �����ұ�? \n");
		System.out.println("\t1. �̾߱⸦ �� ���� �� �ִ� ī�� \n");
		System.out.println("\t2. �� �� ������� �� �ִ� ���� \n");
		System.out.println("\t3. ���� �ŷ��� ������ �� �ִ� �뷡�� \n");
		System.out.println("\t4. �׿� ��� ���� �� �� �ִ� �� ��... \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=15;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ4. ����Ʈ�� ������ ���� ������ �ð��̴�. ��ħ �� ������ ������ ���� ��� �ؾ��ұ�? \n");
		System.out.println("\t1. \"�� �� �ҷ���~?\"��� ���Ѵ�. \n");
		System.out.println("\t2. ���� ������ ����ϱ� ���� ���� �ɾ��. \n");
		System.out.println("\t3. �д��� �ϱ� ���� ����� �ִٰ� �׸� ȥ�� ������. \n");
		System.out.println("\t4. ���� ���� �� ���ٰ� �������� �Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ5. ������� �� �� �׿��� �޼����� �Դ�. ���� ��� �ұ�? \n");
		System.out.println("\t1. ��ȭ�� �Ѵ�. \n");
		System.out.println("\t2. ���� ������ �Ѵ�. \n");
		System.out.println("\t3. ������ ���� ������ ���Ѵ�. \n");
		System.out.println("\t4. �а� �ʴ´�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=5;
				break;
			}
			else if (choice==3) {
				score+=20;
				break;
			}
			else if (choice==4) {
				score+=10;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("Ž���� �������ϴ�. ����� ������ " + score + "�� �Դϴ�.");
	}

	public static void type_d() {
		int score = 0;
		System.out.println("����A Ž���� �����մϴ�. \n\n");
		
		System.out.println("Q1. �׿� �Ļ縦 �ϴ� ����, ���� �̿� �� ���Ĺ��� ���Ҵ�. ���� ��� �ؾ� �ұ�? \n");
		System.out.println("\t1. �ٷ� ����� ���� �ش�. \n");
		System.out.println("\t2. ���� ������ ���� �ش�. \n");
		System.out.println("\t3. ��������� ���� ���ش�. \n");
		System.out.println("\t4. �����Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=5;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=20;
				break;
			}
			else if (choice==4) {
				score+=15;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ2. ������ �� �԰� �װ� ����� �ߴ�. �� �� ���� ��� �ൿ�� �ұ�? \n");
		System.out.println("\t1. \"Ŀ�Ǵ� ���� ��Կ�\"��� ���Ѵ�. \n");
		System.out.println("\t2. \"�� �Ծ����\"��� ���Ѵ�. \n");
		System.out.println("\t3. \"���¸� �ҷ��ּ���.\"��� ���Ѵ�. \n");
		System.out.println("\t4. �׳� ������ ��ٸ���. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=20;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ3. �Ļ縦 ���� ��, ���� �����ұ�? \n");
		System.out.println("\t1. �̾߱⸦ �� ���� �� �ִ� ī�� \n");
		System.out.println("\t2. �� �� ������� �� �ִ� ���� \n");
		System.out.println("\t3. ���� �ŷ��� ������ �� �ִ� �뷡�� \n");
		System.out.println("\t4. �׿� ��� ���� �� �� �ִ� �� ��... \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=5;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=15;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ4. ����Ʈ�� ������ ���� ������ �ð��̴�. ��ħ �� ������ ������ ���� ��� �ؾ��ұ�? \n");
		System.out.println("\t1. \"�� �� �ҷ���~?\"��� ���Ѵ�. \n");
		System.out.println("\t2. ���� ������ ����ϱ� ���� ���� �ɾ��. \n");
		System.out.println("\t3. �д��� �ϱ� ���� ����� �ִٰ� �׸� ȥ�� ������. \n");
		System.out.println("\t4. ���� ���� �� ���ٰ� �������� �Ѵ�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=20;
				break;
			}
			else if (choice==2) {
				score+=10;
				break;
			}
			else if (choice==3) {
				score+=5;
				break;
			}
			else if (choice==4) {
				score+=15;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("\n\nQ5. ������� �� �� �׿��� �޼����� �Դ�. ���� ��� �ұ�? \n");
		System.out.println("\t1. ��ȭ�� �Ѵ�. \n");
		System.out.println("\t2. ���� ������ �Ѵ�. \n");
		System.out.println("\t3. ������ ���� ������ ���Ѵ�. \n");
		System.out.println("\t4. �а� �ʴ´�. \n\n");
		
		while(true) {
			System.out.println("1 ~ 4 �� �����ϼ���. >> ");
			Scanner input=new Scanner(System.in);
			
			int choice =0;
			
			choice=input.nextInt();
			if (choice==1) {
				score+=15;
				break;
			}
			else if (choice==2) {
				score+=20;
				break;
			}
			else if (choice==3) {
				score+=10;
				break;
			}
			else if (choice==4) {
				score+=5;
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}
		
		System.out.println("Ž���� �������ϴ�. ����� ������ " + score + "�� �Դϴ�.");
	}
	
	public static void main(String args[]) {
		
		int choice=0;
		
		System.out.println("���� ���� �ùķ��̼�(������) \n\n");
		
		System.out.println("------------------------------------\n\n");
		
		System.out.println("1. ����A - �״� ������ �ܸ�� ����� �̼Ҹ� ���� ������ ������ ���ó��� �̹���, \n"
				+ "���Ǽ��迡���� ���� ������ Ű���带 ������ ������ �ȴ�. \n"
				+ "�׸��� �״� ��Ƽ���� �׻� ������ �ٴϸ� ���� ������ ȥ�� Ŀ�Ǹ� ���ð� �����ϱ⸦ ����. \n\n");
		System.out.println("2. ����B - �ð��� ���� �ٷ��� ���ڸ� ������ �����ϰ� �������� ��̰� ����. \n"
				+ "ó�� ���� ���� �տ����� ���� �������� ���� �������� ģ������ ��� ����ģ���� ����ȴ�. \n"
				+ "���� �丮�� ���Ͽ� ù �������� ���� ���� ���ݸ��� �ִ� ������ ����...\n\n");
		System.out.println("3. ����C - �״� �׷��� ������ �Ǳ⸦ �����ϰ� ������� �ڽſ��� �����ϴ� ���� ��� \n"
				+ "�׻� ����ȣ������ ���Ͽ� ��Ҹ��� ũ��. �� ���ڿ��� ��� ����� ������ �� �� ���ڵ��� ����� ���ϴ� ����, \n"
				+ "���� ������ ������ �ʸӷ� ������ ��ȭ���� ��������... \n\n");
		System.out.println("4. ����D - �״� �ؼ��� �ܸ�� Ű�� �������� ������ ������ �ִ� ������! \n"
				+ "�米���� �ſ� �پ���� ������ �����Ͽ� ���� ����� �̾����Ⱑ �����. \n"
				+ "���Ͽ��� �ڱⰳ����, �ұݿ��� ������ ������� �ð��� ������ ���� ���� 15���� ������.\n\n");
		
		while(true) {
			System.out.println("����� ������ ���� ���� Ÿ���� ? \n"
					+ "(1 ~ 4 �� �ϳ� ����) >> ");
			Scanner input=new Scanner(System.in);
		
			choice=input.nextInt();
			if (choice==1) {
				type_a();
				break;
			}
			else if (choice==2) {
				type_b();
				break;
			}
			else if (choice==3) {
				type_c();
				break;
			}
			else if (choice==4) {
				type_d();
				break;
			}
			else
				System.out.println("�� 1, 2, 3, 4 �� �ϳ��� �������ּ��� ��\n\n");
		}		
	}
}
