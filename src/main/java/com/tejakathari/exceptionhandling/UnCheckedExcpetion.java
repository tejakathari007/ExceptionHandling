package com.tejakathari.exceptionhandling;

public class UnCheckedExcpetion {

	public static void main(String[] args) {
		try {
			int i = 100 / 0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
