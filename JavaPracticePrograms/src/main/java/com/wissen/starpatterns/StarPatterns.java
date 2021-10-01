package com.wissen.starpatterns;

public class StarPatterns {

	public static void main(String[] args) {

		// rightTriangularPattern();
		leftTriangularPattern();
		// pyramidPattern();
		// diamondPattern();
	}

	private static void leftTriangularPattern() {

		int row = 5;
		for (int i = 0; i < row; i++) {

			for (int j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	private static void pyramidPattern() {
		int row = 6;
		for (int i = 0; i < row; i++) {
			for (int j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	private static void rightTriangularPattern() {
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
