package store;

import java.util.List;

import domain.Music;

/**
 * UserMusicStore
 * 
 * @since 2016. 9. 25.
 * @author 진권기(kwonkijin@nextree.co.kr)
 */
public interface UserMusicStore {
	//
	boolean create(String userId, int musicId);
	boolean delete(String userId, int musicId);
	boolean existUserMusic(String userId, int musicId);
	List<Music> readMusicsByUser(String userId);
}
