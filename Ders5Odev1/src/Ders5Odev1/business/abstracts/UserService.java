package Ders5Odev1.business.abstracts;

import Ders5Odev1.entities.concretes.User;

public interface UserService {

	void signIn(User user, String firstName,String lastName ,String email,String password);
	void login(User user , String email , String password);
	void confirmMail(User user);

}
