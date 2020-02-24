package com.training;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.training.utils.MyAnnotation;

public class UsingAnnotations {

	@MyAnnotation(message = "Hello fieldMessage", nextMessage = "aa")
	public String msg1;

	@MyAnnotation(message = "Hello methodMessage", nextMessage = "ab")
	public String showMessage() {

		String message1 = "Show Message Hello World";

		Class<?> clsRef = this.getClass();

		try {
			Method annotatedMethod = clsRef.getMethod("showMessage");
			Field annotatedField = clsRef.getField("msg1");

			MyAnnotation annotationMethod = annotatedMethod.getAnnotation(MyAnnotation.class);
			MyAnnotation annotationField = annotatedField.getAnnotation(MyAnnotation.class);

			message1 = annotationMethod.message();
			// message1 = annotationField.message();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return message1;
	}
}
