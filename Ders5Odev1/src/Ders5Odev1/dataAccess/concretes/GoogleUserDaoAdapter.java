package Ders5Odev1.dataAccess.concretes;

import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.User;
import Ders5Odev1.google.GoogleUserDao;

public class GoogleUserDaoAdapter implements UserDao {

	GoogleUserDao userDao = new GoogleUserDao();
	
	@Override
	public void signIn(User user, String firstName, String lastName, String email, String password) {

		userDao.signIn(user, firstName, lastName, email, password);
		
	}

	@Override
	public void login(User user, String email, String password) {

		userDao.login(user, email, password);
		
	}

	@Override
	public void saveToDb(User user) {

		userDao.saveToDb(user);
		
	}

}
