package com.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.interview.filter.Gender;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student1=new Student(1, "Salman", "Pune", 92, "male");
		Student student2=new Student(2, "Dhananjay", "Nagar", 91, "male");
		Student student3=new Student(3, "Vaibhav", "Mumbai", 85, "male");
		Student student4=new Student(4, "Ashvini", "Pune", 87, "female");
		Student student5=new Student(5, "Asmita", "Pune", 95, "female");
		Student student6=new Student(6, "LOkesh", "Kolhapur", 80, "male");
		
		List<Student> list=new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		
		list.stream().map(Student::getName).forEach(System.out::println);
		
		Long list1=list.stream().filter(a->a.getGender().equals("male")).collect(Collectors.counting());
		System.out.println(list1);
		
		Map<String, Long> list2=list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(list2);
		
		list.stream().filter(b->b.getMarks()<90).forEach(System.out::println);
		
		double list3=list.stream().collect(Collectors.averagingDouble(Student::getMarks));
		System.out.println(list3);
		
		Double list4=list.stream().filter(c->c.getCity().equals("Pune")).collect(Collectors.averagingDouble(Student::getMarks));
		System.out.println(list4);
		
		double list5=list.stream().filter(d->d.getGender().equals("male")).collect(Collectors.averagingDouble(Student::getMarks));
		System.out.println(list5);
		
		Map<String, Double> list6=list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getMarks)));
		System.out.println(list6);
		
		
		
	}

}
