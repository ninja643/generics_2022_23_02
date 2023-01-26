package rs.ac.ni.pmf.oop2.generics.api_solved.converter;

import rs.ac.ni.pmf.oop2.generics.data.entity.Course;
import rs.ac.ni.pmf.oop2.generics.api_solved.dto.CourseDTO;

public class CourseConverter
{
	public CourseDTO toDto(final Course course)
	{
		return new CourseDTO(course.getCourseName());
	}
}
