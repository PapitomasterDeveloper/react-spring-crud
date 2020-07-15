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

	public Course deletebyId(long id){
		Course course = findById(id);

		if(course == null){
			return null;
		}

		if(courses.remove(course)){
			return course;
		}

		return null;
	}

	public Course findById(long id){
		for(Course course: courses){
			if(course.getId() == id){
				return course;
			}
		}
		return null;
	}

	public Course save(Course course){
		if(course.getId() == -1 || course.getId() == 0){
			course.setId(++idCounter);
			courses.add(course);
		} else {
			deleteById(course.getId());
			courses.add(course);
		}
		return course;
	}
}

