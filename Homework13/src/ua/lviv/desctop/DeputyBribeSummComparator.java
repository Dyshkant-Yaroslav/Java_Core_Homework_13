package ua.lviv.desctop;

import java.util.Comparator;

public class DeputyBribeSummComparator implements Comparator<Deputy> {

	@Override
	public int compare(Deputy o1, Deputy o2) {

		return (-1) * (o1.getBribeSum() > o2.getBribeSum() ? 1 : -1);
	}

}
