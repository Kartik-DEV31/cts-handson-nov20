package demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class DaoDemo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public String time() {
	
		return LocalDateTime.now().toString();
		
	}
	
	public List<EmployeePojo> findAllEmployee() {
		
		
		String SQuery = "select * from employee";
		List<EmployeePojo> e = jdbcTemplate.query(SQuery, new RowMapper<EmployeePojo>() {

			public EmployeePojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeePojo dao = new EmployeePojo(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});

		return e;

	}

}
