package rs.ac.ni.pmf.oop2.generics.api_bad.converter;

import rs.ac.ni.pmf.oop2.generics.api_bad.dto.CourseDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Course;

public class CourseConverter
{
	public CourseDTO toDto(final Course course)
	{
		return new CourseDTO(course.getCourseName());
	}
}
