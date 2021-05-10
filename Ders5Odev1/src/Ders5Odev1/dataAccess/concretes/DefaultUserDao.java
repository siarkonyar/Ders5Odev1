package Ders5Odev1.dataAccess.concretes;

import java.util.List;

import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.User;

public class DefaultUserDao implements UserDao {

	List<User> users;
	
	@Override
	public void signIn(User user, String firstName, String lastName, String email, String password) {

		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		System.out.println("kay�t olundu");
		
	}

	@Override
	public void login(User user, String email, String password) {

		System.out.println("ba�ar�yla giri� yap�ld�");
		
	}
	
	@Override
	public void saveToDb(User user) {
		System.out.println("kay�t tamamland�");
	}

}
