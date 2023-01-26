package rs.ac.ni.pmf.oop2.generics.api_bad.converter;

import rs.ac.ni.pmf.oop2.generics.api_bad.dto.StudentStringDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

public class StudentStringConverter
{
	public StudentStringDTO toDto(final Student student)
	{
		return new StudentStringDTO(student.getExternalId(), student.getName());
	}
}
