package com.fullstack.springboot.maven.crud.springbootfullstackcrudwithmaven.course;

import java.util.List;
import java.util.ArrayList;
import com.fullstack.springboot.maven.crud.springbootfullstackcrudwithmaven.course.*;

import org.springframework.stereotype.Service;

@Service
public class CourseHardcodedService {

	private static List<Course> courses = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		courses.add(new Course(++idCounter, "CourseSeries", "SpringBoot and Angular"));
		courses.add(new Course(++idCounter, "CourseSeries", "SpringBoot and React"));
		courses.add(new Course(++idCounter, "CourseSeries", "Microservices with Spring"));
		courses.add(new Course(++idCounter, "CourseSeries", "SpringBoot with Docker and Kubernates"));
	}
	
	public List<Course> findAll(){
		return courses;
	}
	
}
