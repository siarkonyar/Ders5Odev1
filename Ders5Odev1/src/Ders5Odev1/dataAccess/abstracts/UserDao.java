package Ders5Odev1.dataAccess.abstracts;

import Ders5Odev1.entities.concretes.User;

public interface UserDao {

	void signIn(User user, String firstName,String lastName ,String email,String password);
	void login(User user , String email , String password);
	void saveToDb(User user);
	
}
