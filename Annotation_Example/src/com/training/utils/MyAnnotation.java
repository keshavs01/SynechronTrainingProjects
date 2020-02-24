package com.training.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD}) // To use this in field and method both
@Retention(RetentionPolicy.RUNTIME) // To be retent at the runtime 
public @interface MyAnnotation {
	
	String message();
	
	String nextMessage();

}
