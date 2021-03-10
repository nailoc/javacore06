package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
	
		int[] no = new int[10];
		
		for(int i=0; i<no.length; i++) {
			no[i] = i+1;
			System.out.print(no[i] + " ");
		}
		
		int mux=1; // 초기값이 0이면 안됨
		for(int i=0; i<no.length; i++) {
			mux = mux * no[i];
		}
		System.out.println("mux="+mux);
		

	}

}
