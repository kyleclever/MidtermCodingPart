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

		ArrayList<String> Student = new ArrayList<String>();
		Student student1 = new Student("Kyle", null, "Wang", null, null, "Newark, DE", "(302)-747-0193",
				"kylewang@udel.edu");
		Student.add("" + student1);
		Student student2 = new Student("John", null, "Smith", null, null, "Newark, DE", "(302)-747-0194",
				"johnsmith@udel.edu");
		Student.add("" + student2);
		Student student3 = new Student("Jake", null, "Wang", null, null, "Newark, DE", "(302)-747-0195",
				"jakewang@udel.edu");
		Student.add("" + student3);
		Student student4 = new Student("Kyle", null, "Wang", null, null, "Newark, DE", "(302)-747-0193",
				"kylewang@udel.edu");
		Student.add("" + student4);
		Student student5 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student5);
		Student student6 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student6);
		Student student7 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student7);
		Student student8 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student8);
		Student student9 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student9);
		Student student10 = new Student(null, null, null, null, null, null, null, null);
		Student.add("" + student10);

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