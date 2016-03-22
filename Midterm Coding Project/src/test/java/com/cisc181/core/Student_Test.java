package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courseSample = new ArrayList<Course>();
	static ArrayList<Semester> semesterSample = new ArrayList<Semester>();
	static ArrayList<Section> sectionSample = new ArrayList<Section>();
	static ArrayList<Student> studentSample = new ArrayList<Student>();
	static ArrayList<Enrollment> enrollmentSample = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws ParseException {

		// Course(UUID courseID, String courseName, int gradePoints, String
		// major)
		courseSample.add(new Course("CISC", 100, eMajor.COMPSI));
		courseSample.add(new Course("ECON", 100, eMajor.COMPSI));
		courseSample.add(new Course("MATH", 100, eMajor.COMPSI));

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String startDate = "08-23-2015";
		String endDate = "12-20-2015";
		Date fallStart = sdf.parse(startDate);
		Date fallEnd = sdf.parse(endDate);

		String startDate1 = "02-08-2016";
		String endDate1 = "05-20-2016";
		Date springStart = sdf.parse(startDate1);
		Date springEnd = sdf.parse(endDate1);

		// Semester(UUID semesterID, Date startDate, Date endDate)
		// Fall
		semesterSample.add(new Semester(fallStart, fallEnd));
		// Spring
		semesterSample.add(new Semester(springStart, springEnd));

		// Section(UUID courseID, UUID semesterID, int roomID)
		sectionSample.add(new Section(courseSample.get(0).getCourseID(), semesterSample.get(0).getSemesterID(), 000));
		sectionSample.add(new Section(courseSample.get(0).getCourseID(), semesterSample.get(1).getSemesterID(), 001));
		sectionSample.add(new Section(courseSample.get(1).getCourseID(), semesterSample.get(0).getSemesterID(), 002));
		sectionSample.add(new Section(courseSample.get(1).getCourseID(), semesterSample.get(1).getSemesterID(), 003));
		sectionSample.add(new Section(courseSample.get(2).getCourseID(), semesterSample.get(0).getSemesterID(), 004));
		sectionSample.add(new Section(courseSample.get(2).getCourseID(), semesterSample.get(1).getSemesterID(), 005));

		String DOB = "09-30-1994";
		Date DOB1 = sdf.parse(DOB);

		// Student(String FirstName, String MiddleName, String LastName, Date
		// DOB, eMajor Major, String Address,
		// String Phone_number, String Email)

		studentSample.add(new Student("Le", "Qi", "Wang", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0100",
				"lewang@udel.edu"));
		studentSample.add(new Student("Sydney", "Sandra", "Smith", DOB1, eMajor.CHEM, "Newark, DE", "(302)-747-0101",
				"sydneysmith@udel.edu"));
		studentSample.add(new Student("Miao", "Chu", "Hu", DOB1, eMajor.NURSING, "Newark, DE", "(302)-747-0102",
				"miaohu@udel.edu"));
		studentSample.add(new Student("Gabby", "Rose", "Hill", DOB1, eMajor.PHYSICS, "Newark, DE", "(302)-747-0103",
				"gabbyhill@udel.edu"));
		studentSample.add(new Student("Anne", "Ross", "Rook", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0104",
				"annerook@udel.edu"));
		studentSample.add(new Student("Kelsey", "Maria", "Diaz", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0105",
				"kelseydiaz@udel.edu"));
		studentSample.add(new Student("Edward", "Robert", "Walters", DOB1, eMajor.CHEM, "Newark, DE", "(302)-747-0106",
				"edwardwalters@udel.edu"));
		studentSample.add(new Student("Sam", "Diego", "Silva", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0107",
				"samsilva@udel.edu"));
		studentSample.add(new Student("Amanda", "Lee", "Hough", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0108",
				"amandahough@udel.edu"));
		studentSample.add(new Student("Jessie", "Douglas", "Leong", DOB1, eMajor.COMPSI, "Newark, DE", "(302)-747-0109",
				"jessieleong@udel.edu"));

	}

	@Test
	public void enrollGrade() {

		// Enrollment(UUID StudentID, UUID SectionID)
		for (int i = 0; i < 6; i++) {
			for (int n = 0; n < 10; n++) {
				enrollmentSample
						.add(new Enrollment(studentSample.get(n).getStudentID(), sectionSample.get(i).getSectionID()));
			}
		}
		// Set Grade
		for (int m = 0; m < 60; m++) {
			// Enrollment enrollment = new Enrollment();
			double garde = Math.random() * 100;
			enrollmentSample.get(m).setGrade(garde);
		}
	}
	@Test
	public void replaceMajor() {
		assertEquals(studentSample.get(0).getMajor(), eMajor.COMPSI);
		//change the first student major
		studentSample.get(0).setMajor(eMajor.NURSING);
		assertEquals(studentSample.get(0).getMajor(), eMajor.NURSING);
		
	}

}
