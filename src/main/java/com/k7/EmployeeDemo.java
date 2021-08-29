package com.k7;

import com.k7.vo.EmployeeOld;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeOld e = new EmployeeOld("HS001","Ramkanth");
		System.out.println(e.getId()+" : "+e.getName());
		String json = "{\"name\": \"Tesing\"}";
		//language=JSON
		String json2 = "{ \"id\":  1000,\n" +
				"\"name\" : \"english\"\n " +
				"}";
		System.out.println(json2);

		String regx1 = "^[a]*$";
		//language=MYSQL-SQL
		String query =
				"select * from expsubtype";
		try {
			System.out.println(5/0);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}

		if (regx1 == null) {

		}
		List<String> names = new ArrayList<>();
		names.add(regx1);
		System.out.println(names);

	}

}
