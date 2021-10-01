package com.java.dsalgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbersPractice {

	public static void main(String[] args) {
		int num = 40;
		printJumpingNumber(num);
	}

	private static void printJumpingNumber(int x) {
		System.out.println("0 ");
		for (int i = 1; i <= 9 && i < x; i++) {
			binarySearchTree(x, i);
		}
	}

	private static void binarySearchTree(int x, int n) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);

		while (!q.isEmpty()) {
			n = q.peek();
			q.poll();

			if (n <= x) {
				System.out.println(n + " ");
				int lastNum = n % 10;

				if (lastNum == 0) {
					q.add((n * 10) + (lastNum + 1));
				} else if (lastNum == 9) {
					q.add((n * 10) + (lastNum + 1));
				} else {
					q.add((n * 10) + (lastNum + 1));
					q.add((n * 10) + (lastNum - 1));
				}

			}
		}

	}

	// private static void binarySearchTree(int x, int n) {
	//
	// Queue<Integer> q=new LinkedList<Integer>();
	// q.add(n);
	//
	// while(!q.isEmpty()) {
	// n=q.peek();
	// q.poll();
	//
	// if(n<=x) {
	// System.out.println(n+" ");
	// int lastNum=n % 10;
	// if(lastNum==0) {
	// q.add((n*10)+(lastNum+1));
	// }else if(lastNum==9) {
	// q.add((n*10)+(lastNum+1));
	// }else {
	// q.add((n*10)+(lastNum+1));
	// q.add((n*10)+(lastNum-1));
	// }
	// }
	// }
	//
	//
	// }
}
