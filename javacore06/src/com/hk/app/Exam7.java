package com.hk.app;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		// 7번 문제 조편성
		// 카톡으로 학생명을 19명을 올렸는데
		
		// 한조당 인원수는? 4 (입력을 받음)
		// -> 19/4 = 5개조를 만듬
		// 각각 조는 랜덤하게 돌려서 편성
		// 1조 : 최한솔... 김학성...
		// 2조 : 문세훈... 최성수...
		//
		// 5조 : ~
		
		Scanner sc = new Scanner(System.in);
		String[] member = {"김지홍", "김진우", "김학성", "문세훈", "서민규", "송원진", "송은빈", "홍승우", "안정민", 
						   "안태영", "이창훈", "장선우", "정동섭", "최성수", "최한솔", "한세희", "송영록", "김대현"};
		
		for(int i=0; i<1000; i++) {
			String temp = member[0];
			int rand = (int)(Math.random()*member.length);
			member[0] = member[rand];
			member[rand] = temp;
		}
		
		System.out.print("한 조당의 인원수를 입력해주세요.>");
		int count = sc.nextInt();
		int teamCnt=0;
		if(!(member.length%count == 0)) {
			teamCnt = member.length/count+1;
		}else {
			teamCnt = member.length/count;
		}
		
		String[][] team = new String[teamCnt][];
		for(int i=0; i<team.length; i++) {
			if (i == team.length-1) {
				if (teamCnt == member.length/count) {
					team[i] = new String[count];
				}else {					
					team[i] = new String[member.length%count];
				}
			}else {				
				team[i] = new String[count];
			}
		}
		int memberIndex = 0;
		for(int i=0; i<team.length; i++) {
			for(int j=0; j<team[i].length; j++) {
				team[i][j] = member[memberIndex];
				if(memberIndex == 18) {
					break;
				}
				memberIndex++;
			}
		}
		
		for(int i=0; i<team.length; i++) {
			for(int j=0; j<team[i].length; j++) {
				System.out.print(team[i][j] + " ");
				if(j == team[i].length-1) {
					System.out.println();
				}
			}
		}
		
	}

}
