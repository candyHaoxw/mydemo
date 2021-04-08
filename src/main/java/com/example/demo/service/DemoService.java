package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.bean.Demo;
import com.example.demo.dao.DemoDao;

@Service
public class DemoService implements DemoInterface {

	@Autowired
	private DemoDao dd;

	@Override
	public String getAll() {
		List<Demo> demoList = dd.getAll();
		JSONArray array = JSONArray.parseArray(JSON.toJSONString(demoList));
		return array.toJSONString();
	}
	
	

}
