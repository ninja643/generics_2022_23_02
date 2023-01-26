package rs.ac.ni.pmf.oop2.generics.api_solved.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.oop2.generics.api_solved.converter.CourseConverter;
import rs.ac.ni.pmf.oop2.generics.api_solved.converter.StudentConverter;
import rs.ac.ni.pmf.oop2.generics.api_solved.dto.CourseGroupDTO;
import rs.ac.ni.pmf.oop2.generics.data.repository.CourseRepository;
import rs.ac.ni.pmf.oop2.generics.data.repository.StudentRepository;

@RequiredArgsConstructor
public class StudentService<T>
{
	private final CourseConverter _courseConverter;
	private final StudentConverter<T> _studentConverter;

	public CourseGroupDTO<T> getGroup()
	{
		return new CourseGroupDTO<>(
			_courseConverter.toDto(CourseRepository.PROGRAMMING),
			List.of(
				_studentConverter.toDto(StudentRepository.PERA),
				_studentConverter.toDto(StudentRepository.MIKA)));
	}
}
