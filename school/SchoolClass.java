package school;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
	private String className;
	private Teacher teacher;
	private List<Student> students;
	
	public SchoolClass(String className, Teacher teacher) {
		this.className = className;
		this.teacher = teacher;
		students=new ArrayList<Student>();
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
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
}