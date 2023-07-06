package com.streamapi;
import java.util.*;
import java.util.stream.*;
public class Students {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(50);
		marks.add(60);
		marks.add(34);
		marks.add(30);
		marks.add(35);
		System.out.println("Original List Of Marks: "+marks);
		System.out.println("-------------------------------------");
		List<Integer> passedStudents = marks.stream().filter(i->i>=35).collect(Collectors.toList());
		System.out.println("Passed Students Marks:"+ passedStudents);
		System.out.println("--------------------------------------");
		List<Integer> failedStudents = marks.stream().filter(i->i<35).collect(Collectors.toList());
		System.out.println("Failed Students Marks:"+ failedStudents);
		System.out.println("----------------------------------------");
		int noOfPassedStudents = (int) marks.stream().filter(i->i>=35).count();
		System.out.println("NoOfPassedStudents:  "+ noOfPassedStudents);
		System.out.println("-----------------------------------------");
		int noOfFailedStudents = (int) failedStudents.stream().count();
		System.out.println("NoOfFailedStudents: "+ noOfFailedStudents);
		System.out.println("-----------------------------------------");
		List<Integer> updatedFailed = failedStudents.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("After adding grace Marks for failed Students:" + updatedFailed);
		System.out.println("-------------------------------------------");
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Marks: " + sortedMarks);
		System.out.println("--------------------");
		System.out.println("Marks in Desceding Order:");
		
	}
}
