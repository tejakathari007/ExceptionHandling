package com.tejakathari.exceptionhandling;

public class WithFinally {

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

		} finally {
			System.out.println("done with the execution");
		}
	}

}
