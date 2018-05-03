package com.study.dao;

import java.util.List;

import com.study.model.Logcount;
import com.study.utils.DataSource;
@DataSource(value="dataSource_first")
public interface LogcountMapper {
	
    public List<Logcount>selectAllLogCount();
}