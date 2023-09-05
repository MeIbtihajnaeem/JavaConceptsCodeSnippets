package com.practice.commons.exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) {
		int num = 0;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			num = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Exception is ");
		}
		System.out.print("Number is " + num);

	}

}
