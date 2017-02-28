package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;
import store.factory.ConnectionFactory;
import store.utils.JdbcUtils;

public class UserStoreLogic implements UserStore{

	private ConnectionFactory factory;
	
	public UserStoreLogic(){
		factory = ConnectionFactory.getInstance();
	}
	@Override
	public boolean create(User user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int createCount = 0;

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"insert into user_tb(loginId, password, name) values(?,?,?)");
			pstmt.setString(1, user.getLoginId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());

			createCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		return createCount>0;
	}

	@Override
	public User read(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"select loginId, password, name from user_tb where loginId = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				user = new User();
				user.setLoginId(rs.getString("loginId"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		
		return user;
		
	}
	

}
