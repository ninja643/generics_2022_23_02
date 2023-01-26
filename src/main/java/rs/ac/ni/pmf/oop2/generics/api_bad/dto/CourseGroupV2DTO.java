package rs.ac.ni.pmf.oop2.generics.api_bad.dto;

import java.util.List;
import lombok.Value;

@Value
public class CourseGroupV2DTO
{
	CourseDTO course;
	List<StudentStringDTO> students;
}
