package rs.ac.ni.pmf.oop2.generics.api_solved.converter;

import rs.ac.ni.pmf.oop2.generics.api_solved.dto.StudentDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

public interface StudentConverter<T>
{
	StudentDTO<T> toDto(final Student student);
}
