package rs.ac.ni.pmf.oop2.generics.api_bad;

import rs.ac.ni.pmf.oop2.generics.api_bad.converter.*;
import rs.ac.ni.pmf.oop2.generics.api_bad.service.StudentServiceV1;
import rs.ac.ni.pmf.oop2.generics.api_bad.service.StudentServiceV2;

public class StudentsDemo
{
	public static void main(String[] args)
	{
		final CourseConverter courseConverter = new CourseConverter();
		final StudentLongConverter studentConverter = new StudentLongConverter();
		StudentServiceV1 studentServiceV1 = new StudentServiceV1(courseConverter, studentConverter);

		System.out.println(studentServiceV1.getGroup());

		final StudentStringConverter studentStringConverter = new StudentStringConverter();
		StudentServiceV2 studentServiceV2 = new StudentServiceV2(courseConverter, studentStringConverter);

		System.out.println(studentServiceV2.getGroup());
	}
}
