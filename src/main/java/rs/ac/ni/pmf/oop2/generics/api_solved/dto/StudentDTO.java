package rs.ac.ni.pmf.oop2.generics.api_solved.dto;

import lombok.Value;

@Value
public class StudentDTO<T>
{
	T id;
	String name;
}
