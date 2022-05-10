package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeTest3 {

	public static void main(String args[]) {

//		練習問題１
		String[] info = new String[4];

		info[0] = "1";
		info[1] = "田中太郎";
		info[2] = "男性";
		info[3] = "27";

//		練習問題２
		System.out.println(info[1]);


//		練習問題４
		Employee Data1 = new Employee();
		Employee Data2 = new Employee();
		Employee Data3 = new Employee();

		Data1.setNo(1);
		Data1.setName("田中太郎");
		Data1.setGender("男性");
		Data1.setAge(27);

		Data2.setNo(2);
		Data2.setName("佐藤花子");
		Data2.setGender("女性");
		Data2.setAge(22);

		Data3.setNo(3);
		Data3.setName("鈴木次郎");
		Data3.setGender("男性");
		Data3.setAge(31);

		ArrayList<Employee> Data = new ArrayList<>();
		Data.add(Data1);
		Data.add(Data2);
		Data.add(Data3);

        for(Employee employee : Data) {
        	System.out.println("番号は"+ employee.getNo() +"、名前は"+ employee.getName() +"、年齢は"+ employee.getAge() +"です。");
        }


//		練習問題５
		HashMap<String, Integer> Subject = new HashMap<>();

		Subject.put("国語：", 90);
		Subject.put("数学：", 80);
		Subject.put("英語：", 65);



	}

}
