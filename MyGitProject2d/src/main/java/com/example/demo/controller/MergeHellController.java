package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiA();
		kadaiB();

	}

	static void kadaiA() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}
	}

	private static void kadaiB() {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("「" + randomNumber + "が出ました」");
	}

}