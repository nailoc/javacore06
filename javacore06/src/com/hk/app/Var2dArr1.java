package com.hk.app;

public class Var2dArr1 {

	public static void main(String[] args) {
		
		// 2차원배열 선언
		int[][] score1 = new int[5][3]; // 5행3열
		
		int[][] score2 = new int[5][];
		score2[0] = new int[3]; 
		// 1번째 행 - 여러개의 열로 이루어짐 - 3개열을 선언함
		score2[1] = new int[3]; 
		score2[2] = new int[3]; 
		score2[3] = new int[3]; 
		score2[4] = new int[3]; 
		// 열의 길이가 score2[0].length;
		
		// 가변배열
		int[][] score3 = new int[5][]; // 가변열
		score3[0] = new int[2]; // 2열
		score3[1] = new int[3]; // 3열
		score3[2] = new int[1]; // 1열
		score3[3] = new int[3];
		score3[4] = new int[2];

	}

}
