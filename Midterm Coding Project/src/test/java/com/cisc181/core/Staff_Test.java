package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import base.InsufficientFundsException;

public class Staff_Test {
	ArrayList<Staff> sampleList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		
		Date date = new Date();

		sampleList.add(new Staff("Noah", "Jon", "Stevens", date.(), "100 Main Street", "(302)-747-0000",
				"noahstevens@udel.edu", "M.W.F 10-11AM", 1, 1000.0, Date(), eTitle.MR));
		sampleList.add(new Staff("Jenna", "Elizabeth", "Robins", Date().(1966-1-1), "101 Main Street", "(302)-747-0001",
				"jennarobins@udel.edu", "M.W.F 10-11AM", 1, 2000.0, Date(2015-01-01), eTitle.MRS));
		sampleList.add(new Staff("Cindy", "Anne", "Yang", Date.(1966-1-1), "102 Main Street", "(302)-747-0002",
				"cindyyang@udel.edu", "M.W.F 10-11AM", 1, 3000.0, Date.(2015-01-01), eTitle.MS));
		sampleList.add(new Staff("Oliver", "James", "Wang", date.parse("1996"), "103 Main Street", "(302)-747-0003",
				"oliverwang@udel.edu", "M.W.F 10-11AM", 1, 4000.0, Date.(2015-01-01), eTitle.MR));
		sampleList.add(new Staff("Jamie", "Joseph", "Leong", Date.(1966-1-1), "104 Main Street", "(302)-747-0004",
				"jamieleong@udel.edu", "M.W.F 10-11AM", 1, 5000.0, Date.(2015-01-01), eTitle.MR));

		double avg = (1000 + 2000 + 3000 + 4000 + 5000)/5;
		assertEquals(avg, 3000);
	}

	// Exception Test (Invalid DOB & Phone number)
	@Test(expected = PersonException.class)
	public void exceptiontest() throws PersonException {
		sampleList.add(new Staff("Jamie", "Joseph", "Leong", Date.(1900), "104 Main Street", "3027470005",
				"jamieleong@udel.edu", "M.W.F 10-11AM", 1, 6000.0, Date.(2015-01-01), eTitle.MR));


	}
}
