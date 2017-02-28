package service;

import java.util.List;

import domain.Music;
import store.MusicStore;
import store.MusicStoreLogic;

public class MusicServiceLogic implements MusicService{

	private MusicStore store;
	
	public MusicServiceLogic(){
		store = new MusicStoreLogic();
	}
	@Override
	public Music find(int id) {
		
		return store.read(id);
	}

	@Override
	public List<Music> findByName(String name) {
		// TODO Auto-generated method stub
		return store.readByName(name);
	}

	@Override
	public List<Music> findAll() {
		
		return store.readAll();
	}

}
