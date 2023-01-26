package rs.ac.ni.pmf.oop2.generics.api_solved.converter;

import java.util.function.Function;
import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.oop2.generics.api_solved.dto.StudentDTO;
import rs.ac.ni.pmf.oop2.generics.data.entity.Student;

@RequiredArgsConstructor
public class LambdaStudentConverter<T> implements StudentConverter<T>
{
	private final Function<Student, T> _idResolver;

	@Override
	public StudentDTO<T> toDto(final Student student)
	{
		return new StudentDTO<>(_idResolver.apply(student), student.getName());
	}
}
