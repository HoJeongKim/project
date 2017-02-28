package store;

import java.util.List;

import domain.Music;

/**
 * MusicStore
 * 
 * @since 2016. 9. 25.
 * @author 진권기(kwonkijin@nextree.co.kr)
 */
public interface MusicStore {
	//
	Music read(int id);
	List<Music> readByName(String name);
	List<Music> readAll();
}
