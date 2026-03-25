package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;
@Repository
public class ClassroomDao {
	
	public List<Classroom> getAllClassrooms() {
		Classroom c1 = new Classroom("JBK1");
		Classroom c2 = new Classroom("JBK2");
		ArrayList<Classroom> list = new ArrayList();
		list.add(c1); 
		list.add(c2); 
	        return list;
	    }

}
