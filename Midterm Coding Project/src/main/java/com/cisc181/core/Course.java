package com.cisc181.core;

import java.util.UUID;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private String Major;

	public Course() {
	}
	public Course(UUID courseID, String courseName, int gradePoints, String major) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
		this.Major = major;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

}
