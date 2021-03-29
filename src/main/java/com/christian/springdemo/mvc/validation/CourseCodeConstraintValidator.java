package com.christian.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{
	
	
	private String[] prefixes;

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result=true;
		
		if(theCode==null) {
			return result;
		}
		else {
			for(String s : prefixes) {
				result =theCode.startsWith(s);
				if(result) {
					break;
				}
			}
			
		}
		return result;
	}
	
	public void initialize(CourseCode theCourseCode) {
		prefixes=theCourseCode.value();
	}
	
	
}
