package com.hk.app;

public class CopyArr2 {
	
	// CopyArr2 aaa bbb ccc -> 
	// String[] args={"aaa","bbb","ccc"};
	public static void main(String[] args) {
		
		int[] src = {1,2,3,4,5};
		int[] des = new int[10];
		
		// 소스
		for(int i=0; i<src.length; i++) 
			System.out.print(src[i]+ " ");
		
		// 목적지
		System.out.println();
		for(int j=0; j<des.length; j++) {
			System.out.print(des[j]+" ");
		}
		
		// System.arraycopy() 설명
		System.arraycopy(src, 0, des, 5, 5);
		
		// 목적지
		System.out.println();
		for(int j=0; j<des.length; j++) {
			System.out.print(des[j]+" ");
		}

	}

}
