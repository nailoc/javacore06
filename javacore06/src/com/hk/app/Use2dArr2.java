package com.hk.app;

public class Use2dArr2 {

	public static void main(String[] args) {
		
		// 1차원 배열 
		String[] name1 = {"김학성","최한솔","정동섭", // 0 1 2
				          "문세훈","최성수","송원진", // 3 4 5
				          "안태영","김지홍","장선우", // 
				          "김진우","김대현","서민규"}; // 9 10 11
		// 2차원 3x3 
		String[][] name2 = { {"김학성","최한솔","정동섭"}, // 1
						     {"문세훈","최성수","송원진"}, // 2
						     {"안태영","김지홍","장선우"}, // 3
						     {"김진우","김대현","서민규"} }; // 4
		
		// 각배열 출력하시오
		for(int i=0; i<name1.length; i++) {
			System.out.print(name1[i]+" ");
			if(i%3==2) { // 3열씩 다음 라인으로 출력하려면
				System.out.println();
			}
		}
		System.out.println();
		
		// 2차원 출력
		for(int r=0; r<name2.length; r++) { // 4
			for(int c=0; c<name2[0].length; c++) { // 3
				System.out.print(name2[r][c] + " ");
			}
			System.out.println();
		}
		
		// 2차원배열의 행의 길이는 배열변수명.length 이고
		// 2차원배열의 열의 길이는 배열변수명[0].length 이다 (단 열의 길이 같을때)

	}

}
