package school;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school=new School();

		 Student[] s = new Student[15];

	        s[0] = new Student("Alice", 20);
	        s[1] = new Student("Bob", 21);
	        s[2] = new Student("Charlie", 22);
	        s[3] = new Student("David", 23);
	        s[4] = new Student("Eve", 24);
	        s[5] = new Student("Frank", 25);
	        s[6] = new Student("Grace", 26);
	        s[7] = new Student("Hannah", 27);
	        s[8] = new Student("Ivy", 28);
	        s[9] = new Student("Jack", 29);
	        s[10] = new Student("Kate", 30);
	        s[11] = new Student("Leo", 31);
	        s[12] = new Student("Mia", 32);
	        s[13] = new Student("Nina", 33);
	        s[14] = new Student("Oscar", 34);

	        // Printing the details of the students
	        for (int i = 0; i < s.length; i++) {
	           school.addStudent(s[i]);
	        }
	        
	        System.out.println(school.getStudents());
	        
	        Teacher[] t = new Teacher[5];

	        t[0] = new Teacher("Mr. Sharma", "Biology");
	        t[1] = new Teacher("Ms. Gupta", "Mathematics");
	        t[2] = new Teacher("Dr. Patel", "Chemistry");
	        t[3] = new Teacher("Mrs. Rao", "Physics");
	        t[4] = new Teacher("Mr. Singh", "Economics");

	        // Printing the details of the teachers
	        for (int i = 0; i < t.length; i++) {
	           school.addTeacher(t[i]);
	        }
	        
	        System.out.println(school.getTeachers());
}
}
