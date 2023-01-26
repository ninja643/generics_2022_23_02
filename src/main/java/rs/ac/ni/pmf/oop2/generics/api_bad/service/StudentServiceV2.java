package rs.ac.ni.pmf.oop2.generics.api_bad.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.oop2.generics.api_bad.converter.CourseConverter;
import rs.ac.ni.pmf.oop2.generics.api_bad.converter.StudentStringConverter;
import rs.ac.ni.pmf.oop2.generics.api_bad.dto.CourseGroupV2DTO;
import rs.ac.ni.pmf.oop2.generics.data.repository.CourseRepository;
import rs.ac.ni.pmf.oop2.generics.data.repository.StudentRepository;

@RequiredArgsConstructor
public class StudentServiceV2
{
	private final CourseConverter _courseConverter;
	private final StudentStringConverter _studentConverter;

	public CourseGroupV2DTO getGroup()
	{
		return new CourseGroupV2DTO(
			_courseConverter.toDto(CourseRepository.PROGRAMMING),
			List.of(
				_studentConverter.toDto(StudentRepository.PERA),
				_studentConverter.toDto(StudentRepository.MIKA)));
	}
}
