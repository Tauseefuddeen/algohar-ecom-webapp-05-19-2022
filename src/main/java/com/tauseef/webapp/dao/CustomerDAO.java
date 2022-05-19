package com.tauseef.webapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tauseef.webapp.model.Customer;

public class CustomerDAO {

	JdbcTemplate template;
	private Customer customer;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	// 1. list all customer

	public List<Customer> getProducts() {
		return template.query("select * from product_data", new RowMapper<Customer>() {
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer.setId(rs.getLong(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customer.setAddress(rs.getString(4));
				return customer;
			}
		});
	}

	// 2. add Customer
	public int addCustomer(Customer customer) {
		String ADD_Customer = "INSERT into product_data(name, balance, address) values ( ? , ?, ?)";
		return template.update(ADD_Customer, customer.getName(), customer.getBalance(), customer.getAddress());

	}

	// 3. update Customer
	public int updateCustomer(Customer customer) {
		String UPDATE_Customer = "UPDATE customer_data set name=?, balance=?, address=? where id=?";
		return template.update(UPDATE_Customer, customer.getName(), customer.getBalance(),customer.getAddress(),
				customer.getId());
	}

	// 4. delete Customer
	public int deleteCustomer(Customer product) {
		String DELETE_Customer = "DELETE from customer_data where id=?";
		return template.update(DELETE_Customer, customer.getId());
	}
}
