package com.tka.iostream.practice3;
import java.io.Serializable;

	public class Student implements Serializable {
		int id;
		String name;
		 String Course;
		
		public Student() {
			
		}
		
		public Student(int id, String name, String course) {
			super();
			this.id = id;
			this.name = name;
			this.Course = course;
		}
}
