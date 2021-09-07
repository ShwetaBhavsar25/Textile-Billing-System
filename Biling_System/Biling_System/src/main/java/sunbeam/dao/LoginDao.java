package sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sunbeam.pojo.Login;
import sunbeam.util.DBUtil;

public class LoginDao implements AutoCloseable {
	private Connection connection;
	public LoginDao() throws Exception {
		this.connection = DBUtil.getConnection();
	}
	
	
	
	public Login getLogin( String username ) throws Exception{
		String sql = "SELECT username, password FROM login WHERE username=?";
		try(PreparedStatement selectStatement = connection.prepareStatement(sql)) { 
			selectStatement.setString(1, username);
			ResultSet resultSet = selectStatement.executeQuery();
			if(resultSet.next()) {
				Login cust = new Login(
					 
						resultSet.getString("username"),
						resultSet.getString("password"));
				return cust;
			}
		}
		return null;
	}

	@Override
	public void close() {
		try {
			if(connection != null)
				connection.close();
		} catch (SQLException cause) {
			throw new RuntimeException(cause);
		}
	}
}
