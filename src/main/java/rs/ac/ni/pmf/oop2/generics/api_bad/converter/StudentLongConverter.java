package rs.ac.ni.pmf.oop2.generics.api_bad.converter;

import rs.ac.ni.pmf.oop2.generics.api_bad.dto.StudentLongDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

public class StudentLongConverter
{
	public StudentLongDTO toDto(final Student student)
	{
		return new StudentLongDTO(student.getId(), student.getName());
	}
}
