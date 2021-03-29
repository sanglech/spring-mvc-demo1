package com.christian.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //What classare we basing validation by
@Target({ElementType.METHOD,ElementType.FIELD}) //What can we apply this annotation to
@Retention(RetentionPolicy.RUNTIME) //How long will this exist in the JVM
public @interface CourseCode {

	//define default course code
	public String[] value() default {"LUV","ABC"};
	
	//define default error message
	public String message() default "must start with LUV or ABC";
	
	//define default groups
	public Class<?>[] groups () default {};
	
	//default default payloads
	public Class <? extends Payload>[] payload() default {};
}
