package sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sunbeam.pojo.Book;
import sunbeam.pojo.Customer;
import sunbeam.util.DBUtil;

public class CustomerDao implements AutoCloseable {
	private Connection connection;
	public CustomerDao() throws Exception {
		this.connection = DBUtil.getConnection();
	}
	
	//Create / Insert
	public int insert( Customer cust )throws Exception {
		String sql = "INSERT INTO customer (customerName, customerAddress, contactNo, date, sareeQty, sareeRate, sareeTotal, shirtQty, shirtRate, shirtTotal, pantQty, pantRate, pantTotal, topQty , topRate , topTotal, jeansQty, jeansRate, jeansTotal, clothQty, clothRate, clothTotal, finalTotal) VALUES (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement insertStatement = connection.prepareStatement(sql)) { 
			insertStatement.setString(1, cust.getCustomerName());
			insertStatement.setString(2, cust.getCustomerAddress());
			insertStatement.setString(3, cust.getContactNo());
			insertStatement.setDate(4, cust.getDate());
			insertStatement.setString(5, cust.getSareeQty());
			insertStatement.setString(6, cust.getSareeRate());
			insertStatement.setString(7, cust.getSareeTotal());

			insertStatement.setString(8, cust.getShirtQty());
			insertStatement.setString(9, cust.getShirtRate());
			insertStatement.setString(10, cust.getShirtTotal());
	

			insertStatement.setString(11, cust.getPantQty());
			insertStatement.setString(12, cust.getPantRate());
			insertStatement.setString(13, cust.getPantTotal());

			insertStatement.setString(14, cust.getTopQty());
			insertStatement.setString(15, cust.getTopRate());
			insertStatement.setString(16, cust.getTopTotal());

			insertStatement.setString(17, cust.getJeansQty());
			insertStatement.setString(18, cust.getJeansRate());
			insertStatement.setString(19, cust.getJeansTotal());

			insertStatement.setString(20, cust.getClothQty());
			insertStatement.setString(21, cust.getClothRate());
			insertStatement.setString(22, cust.getClothTotal());

			insertStatement.setString(23, cust.getFinalTotal());
			
			return insertStatement.executeUpdate();
		}
	}
	
	public List<Customer> getCustomer( ) throws Exception{
		String sql = "SELECT id,customerName, customerAddress, contactNo, date, sareeQty, sareeRate, sareeTotal, shirtQty, shirtRate, shirtTotal, pantQty, pantRate, pantTotal, topQty , topRate , topTotal, jeansQty, jeansRate, jeansTotal, clothQty, clothRate, clothTotal, finalTotal FROM customer";
		List<Customer> customer = new ArrayList<Customer>();
		try(PreparedStatement selectStatement = connection.prepareStatement(sql)) {
			try (ResultSet rs = selectStatement.executeQuery()) {
				while (rs.next())
					customer.add(new Customer(rs.getInt("id"),rs.getString("customerName"), rs.getString("customerAddress"),  rs.getString("contactNo"),rs.getDate("date"),  rs.getString("sareeQty"), rs.getString("sareeRate"), rs.getString("sareeTotal"), rs.getString("shirtQty"), rs.getString("shirtRate"), rs.getString("shirtTotal"), rs.getString("pantQty"), rs.getString("pantRate"), rs.getString("pantTotal"), rs.getString("topQty"), rs.getString("topRate"), rs.getString("topTotal"), rs.getString("jeansQty"), rs.getString("jeansRate"), rs.getString("jeansTotal"), rs.getString("clothQty"), rs.getString("clothRate"), rs.getString("clothTotal"), rs.getString("finalTotal")));

					
			}
		}
		return customer;
	}
	//Update
//	public int update( Customer cust )throws Exception {
//		String sql = "UPDATE customers SET name=?, password=?, mobile=?, address=?, email=?, birth=? WHERE id=?";
//		try(PreparedStatement updateStatement = connection.prepareStatement(sql)) { 
//			updateStatement.setString(1, cust.getName());
//			updateStatement.setString(2, cust.getPassword());
//			updateStatement.setString(3, cust.getMobile());
//			updateStatement.setString(4, cust.getAddress());
//			updateStatement.setString(5, cust.getEmail());
//			updateStatement.setDate(6, cust.getBirth());
//			updateStatement.setInt(7, cust.getId());
//			return updateStatement.executeUpdate();
//		}
//	}

	//Delete
//	public int delete( int id ) throws Exception {
//		String sql = "DELETE FROM customers WHERE id=?";
//		try(PreparedStatement deleteStatement = connection.prepareStatement(sql)) { 
//			deleteStatement.setInt(1, id);
//			return deleteStatement.executeUpdate();
//		}
//	}

	//Retrieve / Select
//	public Customer getCustomer( int id ) throws Exception{
//		String sql = "SELECT id, name, password, mobile, address, email, birth FROM customers WHERE id=?";
//		try(PreparedStatement selectStatement = connection.prepareStatement(sql)) { 
//			selectStatement.setInt(1, id);
//			ResultSet resultSet = selectStatement.executeQuery();
//			if(resultSet.next()) {
//				Customer cust = new Customer(
//						resultSet.getInt("id"), 
//						resultSet.getString("name"),
//						resultSet.getString("password"),
//						resultSet.getString("email"),
//						resultSet.getString("mobile"),
//						resultSet.getString("address"),
//						resultSet.getDate("birth"));
//				return cust;
//			}
//		}
//		return null;
//	}
	
//	public Customer getCustomer( String email ) throws Exception{
//		String sql = "SELECT id, name, password, mobile, address, email, birth FROM customers WHERE email=?";
//		try(PreparedStatement selectStatement = connection.prepareStatement(sql)) { 
//			selectStatement.setString(1, email);
//			ResultSet resultSet = selectStatement.executeQuery();
//			if(resultSet.next()) {
//				Customer cust = new Customer(
//						resultSet.getInt("id"), 
//						resultSet.getString("name"),
//						resultSet.getString("password"),
//						resultSet.getString("email"),
//						resultSet.getString("mobile"),
//						resultSet.getString("address"),
//						resultSet.getDate("birth"));
//				return cust;
//			}
//		}
//		return null;
//	}

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
