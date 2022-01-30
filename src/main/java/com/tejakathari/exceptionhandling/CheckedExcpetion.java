package com.tejakathari.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExcpetion {

	public static void main(String[] args) {
		// without try catch we will get compile time error
		try {
			FileReader file = new FileReader("C:\\test\\test.txt");
			BufferedReader fileInput = new BufferedReader(file);
			// print 3 lines of file
			for (int counter = 0; counter < 3; counter++)
				System.out.println(fileInput.readLine());
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
