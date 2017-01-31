package com.test.homework;

import java.util.Scanner;

public class GameMain extends GameInfo{

	final int exam_count = 4;	
	
	void Start() {
		GameSet();
		int sumscore = 0;
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int i;
		String type[] = { "A", "B", "C", "D" };
		
		System.out.println("남자" + type[getManchoice()] + " 탐색을 시작합니다. \n\n");

		for (i = 0; i < question.length; i++) {
			System.out.println(question[i]);
			choice = input.nextInt();
			sumscore += score[getManchoice()][(i * exam_count) + (choice - 1)];
		}
		
		System.out.println("탐색이 끝났습니다. 당신의 점수는 " + sumscore + "점 입니다.");
	}

	public static void main(String arg[]) {
		GameInfo info=new GameInfo();

		System.out.println("남자 연애 시뮬레이션(남연시) \n\n");
		System.out.println("------------------------------------\n\n");
		System.out.print("당신의 이름을 적어주세요 >>");
		Scanner username = new Scanner(System.in);
		setUsername(username.next());
		
		System.out.println("1. 남자A - 그는 순수한 외모와 편안한 미소를 같고 있지만 차가운 도시남자 이미지, \n" + "현실세계에서는 말이 없지만 키보드를 잡으면 무적이 된다. \n"
				+ "그리고 그는 물티슈를 항상 가지고 다니며 쉬는 날에는 혼자 커피를 마시고 쇼핑하기를 즐긴다. \n\n");
		System.out.println("2. 남자B - 시간이 많아 근래에 남자만 만나며 순수하고 착하지만 재미가 없다. \n"
				+ "처음 보는 여자 앞에서는 얼굴이 빨개지고 말을 더듬지만 친해지면 평생 여사친으로 연결된다. \n"
				+ "또한 요리를 잘하여 첫 만남에서 직접 만든 초콜릿을 주는 다정한 남자...\n\n");
		System.out.println("3. 남자C - 그는 그룹의 리더가 되기를 좋아하고 사람들이 자신에게 집중하는 것을 즐겨 \n"
				+ "항상 복식호흡으로 말하여 목소리가 크다. 한 여자에게 모든 사랑을 주지만 그 외 여자들의 사랑을 원하는 남자, \n"
				+ "그의 순수한 눈망울 너머로 음란한 도화살이 느껴진다... \n\n");
		System.out.println("4. 남자D - 그는 준수한 외모와 키에 도전적인 정신을 가지고 있는 차도남! \n" + "사교성이 매우 뛰어나지만 속정이 부족하여 깊은 관계로 이어지기가 힘들다. \n"
						+ "평일에는 자기개발을, 불금에는 섹시한 여성들과 시간을 보내며 연애 경험 15번의 소유자.\n\n");
		System.out.println("당신이 만나고 싶은 남자 타입은 ? \n" + "(1 ~ 4 중 하나 선택) >> ");

		int choice=0;
		while (true) {
			Scanner input = new Scanner(System.in);
			choice=input.nextInt();
			if(choice!=1||choice!=2||choice!=3||choice!=4) {
				System.out.println("※ 1, 2, 3, 4 중 하나만 선택해주세요 ※\n\n");
			} else {
				setManchoice(choice-1); Start(); break;}
		}
	}
}