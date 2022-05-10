package jp.co.aforce.test;

public class PracticeTest1 {

	static final double TAX = 0.1;

	public static void main(String args[]) {

//		練習問題１
		System.out.println(TAX);

//		練習問題２
		int x = 480;
		int price = (int)(x * (1 + TAX));

		System.out.println("この商品の値段は" + price + "円です。");

//		練習問題３
		String name = "吉岡里彩";
		System.out.println(name);

	}
}

//      練習問題４
//      変数やメソッド、クラスにつけることで、他の場所から見える範囲を制限するもの

//      練習問題5
//      public, protected, デフォルト