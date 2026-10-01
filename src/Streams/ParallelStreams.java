package Streams;

import java.util.Arrays;
import java.util.List;

class Student
{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getScore()
	{
		return this.score;
	}

}
public class ParallelStreams {

	public static void main(String[] args) 
	{
		List<Student> studentList = Arrays.asList(
				new Student("AB", 50),
				new Student("DC",60),
				new Student("KD", 90),
				new Student("GJ", 87),
				new Student("GJ", 83),
				new Student("GJ", 79)
				);
		
		//using stream()
		studentList.stream().filter(s->s.getScore()>=70)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+ " "+stu.getScore()));
		
		
		//parallel stream
		studentList.parallelStream().filter(s->s.getScore()>=70)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+ " "+stu.getScore()));
		
		// convert stream() to parallelStream() using parallel method
		studentList.stream().parallel().filter(s->s.getScore()>=70)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+ " "+stu.getScore()));

	}

}
