package com.training.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.training.UsingAnnotations;

public class AnnotationProcessor {
	
	public static void main(String[] args) {
		
		// Create instance of class whose object has to be annotated
		UsingAnnotations secondObj = new UsingAnnotations();
		
		System.out.println(secondObj.showMessage());
		
		//Now get reference of the class
//		Class<?> clsRef = secondObj.getClass();
//		
//		try{
//			Method annotatedMethod = clsRef.getMethod("showMessage");
//			Field annotatedField = clsRef.getField("msg1");
//			
//			MyAnnotation annotationMethod = annotatedMethod.getAnnotation(MyAnnotation.class);
//			MyAnnotation annotationField = annotatedField.getAnnotation(MyAnnotation.class);
//			
//			System.out.println(annotationMethod.message());
//			System.out.println(annotationField.message());
//			
//		} catch(Exception e){
//			e.printStackTrace();
//		}		
	}
}
