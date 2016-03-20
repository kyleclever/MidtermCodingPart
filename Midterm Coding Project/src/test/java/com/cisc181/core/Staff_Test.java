package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		int salary1 = 1000;
		int salary2 = 2000;
		int salary3 = 3000;
		int salary4 = 4000;
		int salary5 = 5000;
		
		double avg = (salary1 + salary2 + salary3 + salary4 + salary5)/5;

		ArrayList<Integer> sampleList = new ArrayList<Integer>();
		sampleList.add(salary1);
		sampleList.add(salary2);
		sampleList.add(salary3);
		sampleList.add(salary4);
		sampleList.add(salary5);
		
		}

	@Test
	public void test() {
		
		assertEquals(avg, 3000);
	}

}
