package jp.co.aforce.test;

public class PracticeTest8 {

//		練習問題１
	public void printHello() {

		System.out.println("Hello");
	}

//		練習問題２
	void printRandomMessage() {

		int n = (int)(3 * Math.random());

		if(n == 0) {
			System.out.println("こんばんは");
		}else if(n == 1) {
			System.out.println("こんにちは");
		}else
			System.out.println("おはよう");
	}

//		練習問題３
	void printMessage(String message) {

		    System.out.println(message);
	}

//	    練習問題４
	void printMessage(String message, int count) {

		for(int i = 0; i < count; i++) {

		    System.out.println(message);
		}
	}

//	    練習問題５
	void printRectangleArea(double height, double width) {

		System.out.println("長方形の面積は" + height * width);
	}

//	    練習問題６
	String getWeatherForecast() {

		int a = (int)(3 * Math.random());
		int b = (int)(4 * Math.random());

		String day;
		String weather;

		if(a == 0) {
			day = "今日";
		}else if(a == 1) {
			day = "明日";
		}else
			day = "明後日";

		if(b == 0) {
			weather = "晴れ";
		}else if(b == 1) {
			weather = "曇り";
		}else if(b == 2) {
			weather = "雨";
		}else
			weather = "雷";

		String message = day +"の天気は"+ weather +"でしょう。";
		return message;
	}

//	    練習問題７
	boolean isEvenNumber(int value) {

		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

//	    練習問題８
	String getMessage(String name, boolean isKid) {

		String message;

		if(isKid ==true) {
			message = "こんにちは。"+ name +"ちゃん。";
		}else {
			message = "こんにちは。"+ name +"さん。";
		}
		return message;
	}

//	    練習問題９




//	    練習問題１０
	boolean isAdult(Person person) {
		if(person.getAge() >= 20) {
			return true;
		}else {
			return false;
		}

	}
}
