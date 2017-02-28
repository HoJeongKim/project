package service;

import domain.User;
import store.UserStore;
import store.UserStoreLogic;

public class UserServiceLogic implements UserService{

	private UserStore store;
	
	public UserServiceLogic() {
		store = new UserStoreLogic();
	}
	@Override
	public User login(User user) {
		String id = user.getLoginId();
		return store.read(id);
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return store.create(user);
	}

	@Override
	public User find(String loginId) {
		// TODO Auto-generated method stub
		return store.read(loginId);
	}
	

}
