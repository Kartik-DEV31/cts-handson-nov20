package com.org_25_11_4_JDBC;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.protocol.Resultset;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void store(EmployeeDao dao) {
	String Query = "insert into employee values (? , ?  , ?)";
	String DQuery = "delete from employee where salary = '22000'";
	String SQuery = "select name from employee where salary = ? ";
	
	try {
	jdbcTemplate.update(Query,dao.getId() , dao.getName() , dao.getSalary());
	}
	catch( org.springframework.dao.DuplicateKeyException DE){
		jdbcTemplate.update(DQuery);
		jdbcTemplate.update(Query,dao.getId() , dao.getName() , dao.getSalary());
	
	}



	}
	

}
