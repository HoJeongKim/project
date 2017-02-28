package service;

import java.util.List;

import domain.Music;
/**
 * MusicService
 * 
 * @since 2016. 9. 25.
 * @author 진권기(kwonkijin@nextree.co.kr)
 */
public interface MusicService {
	//
	Music find(int id);
	List<Music> findByName(String name);
	List<Music> findAll();
}
