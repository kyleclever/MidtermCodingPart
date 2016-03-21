package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {

		ArrayList<Course> courseSample = new ArrayList<Course>();
		//Course(UUID courseID, String courseName, int gradePoints, String major)
		courseSample.add(new Course(UUID.randomUUID(),"CISC", 100, eMajor.COMPSI);
		courseSample.add(new Course(UUID.randomUUID(),"ECON", 100, eMajor.COMPSI);
		courseSample.add(new Course(UUID.randomUUID(),"MATH", 100, eMajor.COMPSI);


		ArrayList<Semester> semesterSample = new ArrayList<Semester>();
		//Semester(UUID semesterID, Date startDate, Date endDate)
		//Fall
		semesterSample.add(new Semester(UUID.randomUUID(),Date(2015-08-23), Date.(2015-12-20));
		//Spring
		semesterSample.add(new Semester(UUID.randomUUID(),Date(2016-02-08), Date.(2016-05-20));

		
		ArrayList<Section> sectionSample = new ArrayList<Section>();
		for (int i = 0; i < courseSample.size(); i++) {
			for (int n = 0; n < semesterSample.size(); n++)
				Section.add(courseSample.get(i) + ' ' + semesterSample.get(n));
		}

		ArrayList<Student> studentSample = new ArrayList<Student>();
		
		studentSample.add(new Student("Le", "Qi", "Wang", Date(1994-9-1), eMajor.COMPSI, "Newark, DE", "(302)-747-0193",
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
