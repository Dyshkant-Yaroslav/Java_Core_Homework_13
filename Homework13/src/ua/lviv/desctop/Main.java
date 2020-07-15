package ua.lviv.desctop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SupremeCouncil s = new SupremeCouncil();

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				s.addFraction();
			}
				break;
			case "2": {
				s.removeFraction();
			}
				break;
			case "3": {
				s.showAllFractions();
			}
				break;
			case "4": {
				s.removeFraction();
			}
				break;
			case "5": {
				s.showFraction();
			}
				break;
			case "6": {
				s.addDeputyToFraction();
			}
				break;
			case "7": {
				s.removeDeputy();
			}
				break;
			case "8": {
				s.showAllBridetakers();
			}
				break;
			case "9": {
				s.showBiggestBridetaker();
			}
				break;
			case "10": {
				s.giveBride();
				;
			}
				break;
			}
		}

	}

	static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.out.println("Введіть 10 щоб дати депутату хабар");
	}

}
