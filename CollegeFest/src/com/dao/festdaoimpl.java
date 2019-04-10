package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.conddb;

public class festdaoimpl implements festdao{

	public String authenticate(String username, String password) {
		String query = "select * from logintable where username = ? AND password = ?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = conddb.openCon();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
				return "authorized";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
