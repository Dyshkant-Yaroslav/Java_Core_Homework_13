package ua.lviv.desctop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	Scanner sc = new Scanner(System.in);
	List<Deputy> dept = new ArrayList<Deputy>();

	public void addDeputy() {
		System.out.println("Please enter deputy weight:");
		int dweight = sc.nextInt();
		System.out.println("Please enter deputy height:");
		int dheight = sc.nextInt();
		System.out.println("Please enter deputy firstname:");
		String dfirstname = sc.next();
		System.out.println("Please enter deputy secondname:");
		String dsecondname = sc.next();
		System.out.println("Please enter deputy age:");
		int dage = sc.nextInt();
		boolean disBribetaker = enterBribe();
		dept.add(new Deputy(dweight, dheight, dfirstname, dsecondname, dage, disBribetaker));
		System.out.println("You added the new deputy:" + dept);
	}

	public void removeDeputy() {
		System.out.println("Your fraction consist of: " + dept);
		System.out.println("Enter index of deputy to remove him:");
		int index = sc.nextInt();
		dept.remove(index);
		System.out.println("At now you fraction consist of: " + dept);
	}

	public boolean enterBribe() {
		System.out.println("Please enter 1 if deputy take bribes or 0 if isnt");
		boolean isBriber = false;
		int val = sc.nextInt();
		if (val == 1) {
			isBriber = true;
		} else if (val == 0) {
			isBriber = false;
		}
		return isBriber;
	}

	public void dgiveBride() {
		System.out.println("Please enter index od deputy which you want give bride: ");
		int index = sc.nextInt();
		dept.get(index).giveBribe();
	}

	public void showBrideTakers() {
		for (Deputy deputy : dept) {
			if (deputy.getBribeSum() > 0) {
				System.out.println("This deputy are bribetakers" + deputy);
			}
		}

	}

	public void showBiggestbridetaker() {
		Collections.sort(dept, new DeputyBribeSummComparator());
		System.out.println("The biggest bridetaker is: " + dept.get(0));
	}

	public void showAllDeputats() {
		for (Deputy deputy : dept) {
			System.out.println("All deputys are: " + deputy);
		}
	}

	public void clearFraction() {
		dept.clear();
		System.out.println("You clear fraction");
	}

	@Override
	public String toString() {
		return "Fraction [ dept=" + dept + "]";
	}

}
