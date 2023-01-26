package rs.ac.ni.pmf.oop2.generics.api_solved;

import rs.ac.ni.pmf.oop2.generics.api_solved.converter.*;
import rs.ac.ni.pmf.oop2.generics.api_solved.service.StudentService;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

public class StudentsDemo
{
	public static void main(String[] args)
	{
		final CourseConverter courseConverter = new CourseConverter();

		StudentService<Long> studentService1 = new StudentService<>(
			courseConverter,
			new AbstractStudentConverter<>()
			{
				@Override
				protected Long resolveId(Student student)
				{
					return student.getId();
				}
			}
		);
		System.out.println(studentService1.getGroup());

		StudentService<String> studentService2 = new StudentService<>(
			courseConverter,
			new LambdaStudentConverter<>(Student::getExternalId));
		System.out.println(studentService2.getGroup());

		StudentService<Long> studentService3 = new StudentService<>(
			courseConverter,
			new LambdaStudentConverter<>(Student::getId));
		System.out.println(studentService3.getGroup());
	}
}
