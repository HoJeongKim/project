package service;
import java.util.List;

import domain.Music;

/**
 * UserMusicService
 * 
 * @since 2016. 9. 25.
 * @author 진권기(kwonkijin@nextree.co.kr)
 */
public interface UserMusicService {
	//
	boolean register(String userId, int musicId);
	boolean remove(String userId, int musicId);
	List<Music> findMusicsByUser(String userId);
}
