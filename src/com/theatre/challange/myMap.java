package com.theatre.challange;

import java.util.*;

public class myMap {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a complied high leve, objec-oriented, platform independant language");
		languages.put("Python", "an interpreted, objec oriented, high level language with dynamic semantics");
		languages.put("Algol", "an algorithmic languages");
		languages.put("BASIC", "Beginners ALL purposes symbolic instruction code");
		languages.put("Lisp", "Therein lies madness");
		
		System.out.println(languages.get("Java"));
		
//		if(languages.containsKey("Java")) {
//			System.out.println("Java is already in the map");
//		} else {
//			languages.put("Java", "this course is about java");
//		}
		
		if (languages.replace("Lisp", "Therein lies madness" , "functional prog languages with imperative ftrs")){
			System.out.println("LISP REPLACED");
		} else {
			System.out.println("LISP NOT REPLACED");
		}
		System.out.println(languages.replace("CYKA", "blyat"));
		
		for(String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}
		
	}

}
