package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.dao.ClassroomDao;

public class ClassroomService {
	@Autowired
	ClassroomDao classroomDao;
	
	public ArrayList<String> allSubjects(){
		ArrayList<String> allClassroom = new ArrayList<String>();
		for (String string : allClassroom) {
			allClassroom.addAll(allClassroom);
			
		}
		return allClassroom;
			
		}
		
	

}
