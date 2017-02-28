package domain;
/**
 * User
 * 
 * @since 2016. 9. 25.
 * @author 진권기(kwonkijin@nextree.co.kr)
 */
public class User {
	//
	private String loginId;
	private String password;
	private String name;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
