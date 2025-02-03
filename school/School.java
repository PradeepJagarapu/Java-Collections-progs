package school;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Student> students;
	private List<Teacher> teachers;
	private List<SchoolClass> classes;
	
	public School(){
		students=new ArrayList<Student>();
		teachers=new ArrayList<Teacher>();
		classes=new ArrayList<SchoolClass>();
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<SchoolClass> getClasses() {
		return classes;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(String name) {
		for(Student s:students) {
			if(s.getName()==name) {
				students.remove(s);
			}
		}
	}
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	
	public void removeTeacher(String name) {
		for(Teacher t:teachers) {
			if(t.getName()==name){
				students.remove(t);
			}
		}
	}

	public void addClass(SchoolClass c) {
		classes.add(c);
	}
	
	public void removeClass(String className) {
		for(SchoolClass c:classes) {
			if(c.getClassName()==className){
				students.remove(c);
			}
		}
	}
}
