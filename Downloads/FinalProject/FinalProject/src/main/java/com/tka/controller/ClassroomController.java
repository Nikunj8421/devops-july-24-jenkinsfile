package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;

public class ClassroomController {
	
	@Autowired
  private ClassroomService classroomService;

	public List<String> classroomnaList(){
		return classroomService.allSubjects();
	}
    


}
