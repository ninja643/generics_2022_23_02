package rs.ac.ni.pmf.oop2.generics.api_solved.dto;

import java.util.List;
import lombok.Value;

@Value
public class CourseGroupDTO<T>
{
	CourseDTO course;
	List<StudentDTO<T>> students;
}
