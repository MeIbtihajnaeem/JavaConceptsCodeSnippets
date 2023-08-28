package com.practice.commons.multiDimensionalArray;

public class MainClass {

	public static void main(String[] args) {

		// 2d Array
		int twoDimensionalArray[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				twoDimensionalArray[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int[] arr : twoDimensionalArray) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println();

		// jaggedArray Example
		int jaggedArray[][] = new int[3][];
		jaggedArray[0] = new int[3];
		jaggedArray[1] = new int[4];
		jaggedArray[2] = new int[2];

		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int[] arr : jaggedArray) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
