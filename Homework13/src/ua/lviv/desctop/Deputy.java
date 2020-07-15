package ua.lviv.desctop;

import java.util.Scanner;

public class Deputy extends Human {

	Scanner sc = new Scanner(System.in);
	private String firstname;
	private String secondname;
	private int age;
	private boolean isBribetaker;
	private int bribeSum;

	public Deputy(int weight, int height, String firstname, String secondname, int age, boolean isBribetaker) {
		super(weight, height);
		this.firstname = firstname;
		this.secondname = secondname;
		this.age = age;
		this.isBribetaker = isBribetaker;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribetaker() {
		return isBribetaker;
	}

	public void setBribetaker(boolean isBribetaker) {
		this.isBribetaker = isBribetaker;
	}

	public int getBribeSum() {
		return bribeSum;
	}

	public void setBribeSum(int bribeSum) {
		this.bribeSum = bribeSum;
	}

	@Override
	public String toString() {
		return "Deputy [firstname=" + firstname + ", secondname=" + secondname + ", age=" + age + ", isBribetaker="
				+ isBribetaker + ", bribeSum=" + bribeSum + ", toString()=" + super.toString() + "]";
	}

	public void giveBribe() {
		if (!isBribetaker) {
			System.out.println("This deputy isnt take bribes!");
		} else if (isBribetaker) {
			System.out.println("Enter summ of bribe:");
			int bribeGiven = sc.nextInt();
			if (bribeGiven >= 5000) {
				System.out.println("Police will arrested deputy");
			} else if (bribeGiven < 5000) {
				this.bribeSum = bribeGiven;
			}
		}

	}

}
