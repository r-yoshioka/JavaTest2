package jp.co.aforce.test;

public class Employee {

//	練習問題３

	private int no;
	private String name;
	private String gender;
	private int age;

	void setNo(int no) {
		this.no = no;
	}

	void setName(String name) {
		this.name = name;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getNo() {
		return this.no;
	}

	String getName() {
		return this.name;
	}

	String getGender() {
		return this.gender;
	}

	int getAge() {
		return this.age;
	}

}
