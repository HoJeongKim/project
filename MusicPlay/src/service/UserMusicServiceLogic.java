package service;

import java.util.List;

import domain.Music;
import store.UserMusicStore;
import store.UserMusicStoreLogic;

public class UserMusicServiceLogic implements UserMusicService{

	private UserMusicStore store;
	
	public UserMusicServiceLogic(){
		store = new UserMusicStoreLogic();
	}
	
	@Override
	public boolean register(String userId, int musicId) {
		if(store.existUserMusic(userId, musicId) == false){
			return store.create(userId, musicId);
		}else{
			return false;
		}
	}

	@Override
	public boolean remove(String userId, int musicId) {
		// TODO Auto-generated method stub
		return store.delete(userId, musicId);
	}

	@Override
	public List<Music> findMusicsByUser(String userId) {
		// TODO Auto-generated method stub
		return store.readMusicsByUser(userId);
	}
	

}
