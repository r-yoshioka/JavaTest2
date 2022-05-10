package jp.co.aforce.test;

public class PracticeTest4 {

	public static void main(String args[]) {

//		練習問題１

		String str1 = "abc";
		String str2 = "ab";

		str2 = str2 + "c";

		if(str1 == str2) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}

		if(str1.equals(str2)) {
			System.out.println("等しい");
		}else {
			System.out.println("等しくない");
		}
	}
}

/*②の“equals”でコーディングします。
   理由として、String型の場合、“==”を使用すると文字列が追加されても参照先で比較してしまう */