package com.annotation.domains;

import java.lang.reflect.Method;

import com.annotation.utils.Query;
import com.annotation.utils.Table;

public class UsingAnnotations {

	@Table(name = "newTable")
	public String getTable() {
		String tableName = "oldTable";
		Class<?> clsRef = this.getClass();

		try {
			Method annotatedMethod = clsRef.getMethod("getTable");
			Table annotationMethod = annotatedMethod.getAnnotation(Table.class);
			tableName = annotationMethod.name();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tableName;
	}

	@Query(sql = "select * from ")
	public String selectQuery() {
		String query = "Select count(*) from ";
		Class<?> clsRef = this.getClass();

		try {
			Method annotatedMethod = clsRef.getMethod("selectQuery");
			Query annotationMethod = annotatedMethod.getAnnotation(Query.class);
			query = annotationMethod.sql();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query;
	}

}
