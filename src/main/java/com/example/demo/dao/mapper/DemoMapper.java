package com.example.demo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Demo;

@Mapper
public interface DemoMapper {

	List<Demo> getAll();
}
