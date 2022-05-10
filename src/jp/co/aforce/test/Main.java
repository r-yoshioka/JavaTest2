package jp.co.aforce.test;

public class Main {

	public static void main(String args[]) {

		PracticeTest8 practice = new PracticeTest8();

//		練習問題１
		practice.printHello();

//		練習問題２
		practice.printRandomMessage();

//		練習問題３
		practice.printMessage("Hello");

//		練習問題４
		practice.printMessage("Hello", 5);

//		練習問題５
		practice.printRectangleArea(727, 1015);

//		練習問題６
		System.out.println(practice.getWeatherForecast());

//		練習問題７
		System.out.println(practice.isEvenNumber(7));

//		練習問題８
		System.out.println(practice.getMessage("吉岡", false));

//		練習問題９


//		練習問題１０
		System.out.println(practice.isAdult(new Person("自分", 22)));

	}

}
