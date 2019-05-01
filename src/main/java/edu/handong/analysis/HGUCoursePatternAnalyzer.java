package edu.handong.analysis;

import edu.handong.analysis.datamodel.Course;
import edu.handong.analysis.datamodel.Student;

public class HGUCoursePatternAnalyzer {
	
	private String[] lines = {	"1999-1, JC Nam, Java Programming",
						"1999-2, JC Nam, Programming Language Theory",
						"1999-1, JC Nam, Data Structures",
						"2001-1, JC Nam, Database Systems",
						"2018-1, SB Lim, Java Programming",
						"2018-2, SB Lim, Programming Language Theory",
						"2019-1, SB Lim, Data Structures",
						"2019-1, SB Lim, Algorithm Analysis",
						"2018-1, SJ Kim, Java Programming",
						"2018-2, SJ Kim, Programming Language Theory",
						"2019-1, SJ Kim, Logic Design",
						"2019-1, SJ Kim, Algorithm Analysis",
						};

	private int numOfStudents;
	private int numOfCourses;
	private Student[] students;
	private Course[] courses;
	
	/**
	 * This method runs our analysis logic to get the list of student and course names from lines.
	 * @param args
	 */
	public void run(String[] args) {
		
		numOfStudents = Integer.parseInt(args[0]);
		numOfCourses = Integer.parseInt(args[1]);
	
		students = initiateStudentArrayFromLines(lines);
		
		System.out.println("Number of All Students: " + numOfStudents);
		for(Student student: students) {
			System.out.println(student.getName());
		} 
		
		courses = initiateCourseArrayFromLines(lines);
		System.out.println("Number of All Courses: " + numOfCourses);
		for(Course course: courses) {
			System.out.println(course.getCourseName());
		}
		
	}

	/**
	 * This method returns a Student array to initiate the field, students, from lines.
	 * @param lines
	 * @return
	 */
	private Student[] initiateStudentArrayFromLines(String[] lines) {
		// TODO: implement this method
		String[][] totalnames = new String[12][3];
		for(int i = 0; i < 12; i++) {
			totalnames[i] = lines[i].split(",");
		}
		students = new Student[lines.length];
		for(int i=0; i<lines.length; i++) {
			//if(studentExist(students, student))
			students[i] = new Student(totalnames[i][1].trim());
			//System.out.println("학생이름: " + students[i].getName());
		}
		return students;
	}

	/**
	 * This method check if there is the same name of the second arguement in the array, students
	 * @param students
	 * @param student
	 * @return boolean
	 */
	private boolean studentExist(Student[] students, Student student) {
		student = new Student("JC Nam");
		for(int i=0; i<lines.length; i++) {
			if (student.equals(students[i])) {
			return true;
			}
			else 
				return false;
		}
			student = new Student("SB Lim");
			for(int k=0; k<lines.length; k++) {
				if (student.equals(students[k])) {
				return true;
				}
				else 
					return false;
			}
			student = new Student("SJ Kim");
			for(int j=0; j<lines.length; j++) {
				if (student.equals(students[j])) {
				return true;
				}
				else 
					return false;
			}
		
		// TODO: implement this method
		
		return false;
	} 
	
	/**
	 * This method returns a Course array to initiate the field, courses, from lines.
	 * @param lines
	 * @return\
	 */
	private Course[] initiateCourseArrayFromLines(String[] lines) {
		
		String[][] coursenames = new String[12][3];
		for(int i = 0; i < 12; i++) {
			coursenames[i] = lines[i].split(",");
		}
		courses = new Course[lines.length];
		
		for(int i=0; i<lines.length; i++) {
			courses[i] = new Course(coursenames[i][2].trim());
			//System.out.println("과목 이름: " + courses[i].getCourseName());
		}
		return courses;
	} 
	

	/**
	 * This method check if there is the same name of the second argument in the array, courses.
	 * @param courses
	 * @param course
	 * @return boolean
	 */
	private boolean courseExist(Course[] courses, Course course) {
		
		// TODO: implement this method

		return false;
	} 

} 
