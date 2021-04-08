package com.example.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.Demo;
import com.example.demo.dao.mapper.DemoMapper;

@Repository
public class DemoDao {

	@Autowired
	private DemoMapper dm;
	
	public List<Demo> getAll(){
		return dm.getAll();
	}
}
