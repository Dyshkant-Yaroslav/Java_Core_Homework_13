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
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		System.out.println("������ 10 ��� ���� �������� �����");
	}

}
