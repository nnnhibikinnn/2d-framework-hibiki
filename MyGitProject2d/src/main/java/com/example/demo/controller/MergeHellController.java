package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiB();

	}

	private static void kadaiB() {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("「" + randomNumber + "が出ました」");
	}

}