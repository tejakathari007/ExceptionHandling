package com.tejakathari.exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int[] i = new int[2];
			System.out.println(i[3]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
