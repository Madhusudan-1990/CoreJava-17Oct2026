package FlatMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String sname;
	int sid;
	char grade;
	public Student(String sname, int sid, char grade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}

	
	
}
public class Demo3 
{

	public static void main(String[] args) 
	{
		
		List<Student> studentList1 = Arrays.asList(
				new Student("Antony", 101, 'A'),
				new Student("Akbhar", 102, 'C'),
				new Student("Amar", 103, 'B')
				);
		
		List<Student> studentList2 = Arrays.asList(
				new Student("Scot", 104, 'A'),
				new Student("Brad", 105, 'C'),
				new Student("Pitt", 106, 'B')
				);
		List<Student> studentList3 = Arrays.asList(
				new Student("James", 107, 'A'),
				new Student("Johnny", 108, 'C'),
				new Student("Kitty", 109, 'B')
				);
		
		List<List<Student>> listOfStudentList = Arrays.asList(studentList1,studentList2,studentList3);
		
		listOfStudentList.stream()
		.flatMap(slist->slist.stream())
		.map(s->s.sname)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
	

	}

}
