package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staffSample = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String DOB = "03-01-1980";
		Date DOB1 = sdf.parse(DOB);

		String hireDate = "12-31-2015";
		Date hireDate1 = sdf.parse(hireDate);

		// Staff(String FirstName, String MiddleName, String LastName,Date DOB,
		// String Address, String Phone_number,
		// String Email,String officeHours, int rank, double salary, Date
		// hireDate,eTitle Title)

		staffSample.add(new Staff("Noah", "Jon", "Stevens", DOB1, "100 Main Street", "(302)-747-0000",
				"noahstevens@udel.edu", "M.W.F 10-11AM", 1, 1000.0, hireDate1, eTitle.MR));
		staffSample.add(new Staff("Jenna", "Elizabeth", "Robins", DOB1, "101 Main Street", "(302)-747-0001",
				"jennarobins@udel.edu", "M.W.F 10-11AM", 1, 2000.0, hireDate1, eTitle.MRS));
		staffSample.add(new Staff("Cindy", "Anne", "Yang", DOB1, "102 Main Street", "(302)-747-0002",
				"cindyyang@udel.edu", "M.W.F 10-11AM", 1, 3000.0, hireDate1, eTitle.MS));
		staffSample.add(new Staff("Oliver", "James", "Wang", DOB1, "103 Main Street", "(302)-747-0003",
				"oliverwang@udel.edu", "M.W.F 10-11AM", 1, 4000.0, hireDate1, eTitle.MR));
		staffSample.add(new Staff("Jamie", "Joseph", "Leong", DOB1, "104 Main Street", "(302)-747-0004",
				"jamieleong@udel.edu", "M.W.F 10-11AM", 1, 5000.0, hireDate1, eTitle.MR));

	}

	@Test
	public void avgSalary() {
		double sum = 0;
		sum = staffSample.get(0).getSalary() + staffSample.get(1).getSalary() + staffSample.get(2).getSalary()
				+ staffSample.get(3).getSalary() + staffSample.get(0).getSalary();
		assertEquals(2200, (sum / 5), 0);
	}

	// Exception Test (Invalid DOB & Phone number)
	@Test(expected = PersonException.class)
	public void exceptiontest() throws PersonException {
		
		Calendar InvaidDOB = Calendar.getInstance();
		Calendar hireDate1 = Calendar.getInstance();
		InvaidDOB.set(1890, 1, 1);
		Date DOB = InvaidDOB.getTime();
		hireDate1.set(2015,9,1);
		Date hireDate = hireDate1.getTime();		
				
		staffSample.add(new Staff("Jamie", "Joseph", "Leong", DOB, "104 Main Street", "3027470005",
				"jamieleong@udel.edu", "M.W.F 10-11AM", 1, 6000.0, hireDate, eTitle.MR));
	}
}
