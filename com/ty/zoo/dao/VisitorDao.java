package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.VisitorDto;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {
	public int saveVisitor(VisitorDto visitor) {
		String query = "insert into visitor values(?,?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,visitor.getId());
			preparedStatement.setString(2, visitor.getName());
			preparedStatement.setString(3, visitor.getEmail());
			preparedStatement.setString(4, visitor.getPhone());
			preparedStatement.setString(5, visitor.getGender());
			preparedStatement.setString(6, visitor.getAge());
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

}
