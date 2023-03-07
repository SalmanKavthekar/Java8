package com.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.naming.CommunicationException;
import javax.sound.sampled.LineListener;

//how many female here
//how many male and female
//print all emp name
//salary less than 50000
//average salary of male candidate
public class EmployeeTest {
	
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<Employee>();
		list.add(new Employee(101, "Salman", "Male", 40000));
		list.add(new Employee(102, "Aarti", "Female", 55000));
		list.add(new Employee(103, "Samir", "Male", 60000));
		list.add(new Employee(104, "Damini", "Female", 35000));
		
		Long list3=list.stream().filter(q->q.getGender().equals("Female")).collect(Collectors.counting());
		System.out.println(list3);
		
		Map<String, Long> map1=list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println(map1);
		
		list.stream().map(Employee :: getName).forEach(System.out::println);
		
		list.stream().filter(k->k.getSalary()<50000).forEach(System.out::println);
		
		double list4=list.stream().filter(d->d.getGender().equals("Male")).collect(Collectors.averagingDouble(Employee :: getSalary));
		System.out.println("Avrage salary of male employee = "+list4);
		
		double list5=list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(list5);
		
		list.stream().filter(e->e.getSalary()>50000).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		








		
		
		
	}

}
