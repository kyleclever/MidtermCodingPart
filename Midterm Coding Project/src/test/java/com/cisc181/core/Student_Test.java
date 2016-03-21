package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {

		ArrayList<String> Course = new ArrayList<String>();
		Course.add("CISC181");
		Course.add("ECON303");
		Course.add("MATH350");

		ArrayList<String> Semester = new ArrayList<String>();
		Semester.add("Fall");
		Semester.add("Spring");

		ArrayList<String> Section = new ArrayList<String>();
		for (int i = 0; i < Course.size(); i++) {
			for (int n = 0; n < Semester.size(); n++)
				Section.add(Course.get(i) + ' ' + Semester.get(n));
		}

		ArrayList<Student> Sample = new ArrayList<Student>();
		Sample.add(new Student("Le", "Qi", "Wang", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"lewang@udel.edu"));		
		Sample.add(new Student("Sydney", "Sandra", "Smith", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"sydneysmith@udel.edu");
		
		Sample.add(new Student("Miao", "Chu", "Hu", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"miaohu@udel.edu");
		Student.add("" + student1);
		Sample.add(new Student("Gabby", "Rose", "Hill", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"gabbyhill@udel.edu");
		Student.add("" + student1);
		Sample.add(new Student("Anne", "Ross", "Rook", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"annerook@udel.edu");
	
		Student student1 = new Student("Kelsey", "Maria", "Diaz", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"kelseydiaz@udel.edu");
		Sample.add(student1);
		Student student1 = new Student("Edward", "Robert", "Walters", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"edwardwalters@udel.edu");
		Student.add("" + student1);
		Student student1 = new Student("Sam", "Diego", "Silva", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"samsilva@udel.edu");
		Student.add("" + student1);
		Student student1 = new Student("Amanda", "Lee", "Hough", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"amandahough@udel.edu");
		Student.add("" + student1);
		Student student1 = new Student("Jessie", "Douglas", "Leong", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
				"jessieleong@udel.edu");
		Student.add("" + student1);
		
		


	}

	private static Date Date(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test() {
		
		for (int i=0; i<6; i++){			
			for (int n = 0; i < 10; i++){
				Enrollment enrollment= new Enrollment();
				enrollment.setGrade(80);}
			
			
		
		public void replaceMajor(int index, String newMajor){
			Student.set(int [0][4], "ComputerScience");
		}
			
		}
			
		}

}