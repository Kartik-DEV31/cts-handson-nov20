package com.org_25_11_4_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void store(EmployeeDao dao) {
		String Query = "insert into employee values (? , ?  , ?)";
		String DQuery = "delete from employee where salary > '20000'";

		try {
			jdbcTemplate.update(Query, dao.getId(), dao.getName(), dao.getSalary());
		} catch (org.springframework.dao.DuplicateKeyException DE) {
			jdbcTemplate.update(DQuery);
			jdbcTemplate.update(Query, dao.getId(), dao.getName(), dao.getSalary());

		}

	}

	@SuppressWarnings("deprecation")
	public EmployeeDao findEmployeeById(Integer id) {
		String SQuery = "select * from employee where id = ?";
		System.out.println(id);
		EmployeeDao e = new EmployeeDao(null, null, null);

		e = jdbcTemplate.queryForObject(SQuery, new Object[] { id }, new RowMapper<EmployeeDao>() {

			public EmployeeDao mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeDao dao = new EmployeeDao(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});

		return e;

	}

	public List<EmployeeDao> displayAllEmployees() {
		String SQuery = "select * from employee";
		List<EmployeeDao> e = jdbcTemplate.query(SQuery, new RowMapper<EmployeeDao>() {

			public EmployeeDao mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeDao dao = new EmployeeDao(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});

		return e;

	}

}
