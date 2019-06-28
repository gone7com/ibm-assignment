package com.ibm.training.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;


@Repository
public class Dao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public String getUser(int id) {
	
		String sqlquery="Select user_name from user_table where user_id=?";
			
		return jdbcTemplate.queryForObject(sqlquery, new Object[] {id},String.class);
	}


	public int addUSer(User user) {
		String sqlquery="insert into user_table Values (?,?,?,?,?,?,?,?,?,?,?)";
		
		return jdbcTemplate.update(sqlquery, new Object[] {user.getUser_id(),user.getFirst_name(),user.getLast_name(),user.getMobile_num(),user.getGovt_id_type(),user.getGovt_id_num(),user.getDriving_lic(),user.getUsername(),user.getPass(),user.getEmail(),user.getWallet()});
	
		
	}


	public int updateUser(String id, String field, String value) {
		String sqlquery=String.format("update user_table set %s=? where user_id=?", field);
		
		return jdbcTemplate.update(sqlquery, new Object[] {value, id});
	}


	public int deleteUser(String id) {
		
String sqlquery="delete from user_table where user_id=?";
		
		return jdbcTemplate.update(sqlquery, new Object[] {id});
	}

}



//class userMapper implements RowMapper<User> {
//
//	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//		User user = new User(rowNum, null);
//		user.setFirst_name(rs.getString("first_name"));
//		user.setUser_id(rs.getInt("user_id"));
//
//		return user;
//	}

//}









