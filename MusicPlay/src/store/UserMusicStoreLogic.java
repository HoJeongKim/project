package store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Music;
import domain.User;
import store.factory.ConnectionFactory;
import store.utils.JdbcUtils;

public class UserMusicStoreLogic implements UserMusicStore {

	private ConnectionFactory factory;
	
	public UserMusicStoreLogic(){
		factory = ConnectionFactory.getInstance();
	}

	public boolean create(String userId, int musicId) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int createCount = 0;
		

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"insert into user_music_tb (user_id, music_id) values(?,?)");
			pstmt.setString(1, userId);
			pstmt.setInt(2, musicId);
			
			createCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		
		return createCount>0;
	}

	public boolean delete(String userId, int musicId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int createCount = 0;
		

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"delete from user_music_tb where user_id =? and music_id = ?");
			pstmt.setString(1, userId);
			pstmt.setInt(2, musicId);
			
			createCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		
		return createCount>0;
	}

	public boolean existUserMusic(String userId, int musicId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int createCount = 0;
		

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"select user_id, music_id from user_music_tb where user_id = ? and music_id=?");
			pstmt.setString(1, userId);
			pstmt.setInt(2, musicId);
			createCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		
		return createCount>0;
	}

	public List<Music> readMusicsByUser(String userId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Music> list = new ArrayList<>();
		

		try {
			conn = factory.createConnection();
			pstmt = conn.prepareStatement(
					"select id, name, artist_name, album_title, image, agent_name from user_music_tb u, music_tb m where u.MUSIC_ID = m.ID and u.USER_ID = ?");
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			while (rs.next()){
				Music music = new Music();
				music.setId(rs.getInt("id"));
				music.setName(rs.getString("name"));
				music.setArtist(rs.getString("artist_name"));
				music.setAlbum(rs.getString("album_title"));
				music.setImage(rs.getString("image"));
				music.setAgent(rs.getString("agent_name"));
				list.add(music);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn, pstmt);
		}
		
		return list;
	}
}
