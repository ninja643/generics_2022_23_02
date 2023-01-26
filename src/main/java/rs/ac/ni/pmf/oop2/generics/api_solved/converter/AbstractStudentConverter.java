package rs.ac.ni.pmf.oop2.generics.api_solved.converter;

import rs.ac.ni.pmf.oop2.generics.api_solved.dto.StudentDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

public abstract class AbstractStudentConverter<T> implements StudentConverter<T>
{
	protected abstract T resolveId(Student student);

	@Override
	public StudentDTO<T> toDto(final Student student)
	{
		return new StudentDTO<>(resolveId(student), student.getName());
	}
}
