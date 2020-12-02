package employeeDataUsingAop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public String time() {

		return LocalDateTime.now().toString();

	}

	public List<EmployeePojo> findAllEmployee() throws Exception {

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

		if (e.size() == 0)
			throw new Exception("DataBaseException");

		return e;

	}

	public List<EmployeePojo> findEmployee(int id) throws Exception {
		String SQuery = "select * from employee where id = ?";
		List<EmployeePojo> e = jdbcTemplate.query(SQuery, new Object[] { id }, new RowMapper<EmployeePojo>() {

			public EmployeePojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeePojo dao = new EmployeePojo(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});

		if (e.size() == 0) {
			throw new Exception("NoSuchEmployeeException");

		}

		return e;

	}

	public List<EmployeePojo> removeEmployee(int id, String name) throws Exception {

		String SQuery = "select * from employee where id = ?";
		List<EmployeePojo> e = jdbcTemplate.query(SQuery, new Object[] { id }, new RowMapper<EmployeePojo>() {

			public EmployeePojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeePojo dao = new EmployeePojo(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});

		if (e.size() == 0) {
			throw new Exception("NoSuchEmployeeException");

		}

		int j = 0;

		String deleteQuery = "delete from employee where id = ? and name =?";
		try {
			j = jdbcTemplate.update(deleteQuery, id, name);
		} catch (DataAccessException de) {
			System.out.println(de);
		}

		if (j == 0) {
			throw new Exception("NoEmployeeFoundException");
		}

		return findAllEmployee();

	}

	@Override
	public void addEmplpoyee(int id, String name, Double salary) throws Exception {
	
		
		
		String SQuery = "select * from employee where id = ?";
		List<EmployeePojo> e = jdbcTemplate.query(SQuery, new Object[] { id }, new RowMapper<EmployeePojo>() {

			public EmployeePojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeePojo dao = new EmployeePojo(null, null, null);
				dao.setId(rs.getInt("id"));
				dao.setName(rs.getString("name"));
				dao.setSalary(rs.getDouble("salary"));
				return dao;
			}
		});
		
		
		
		
		int i=0;
		
		if(e.size()!=0)
		{
			throw new Exception("EmployeeAlreadyPresentException");
			
		}
		
		String insertQuery = "insert into employee(id , name , salary) values (? , ? , ?) ";
	 i = jdbcTemplate.update(insertQuery,id,name,salary);
	
	if (i==0)
	{
		throw new RuntimeException("DataBaseDataEntryException");
		
	}
		
		
	}

}
