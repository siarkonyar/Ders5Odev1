package Ders5Odev1.business.concretes;

import java.util.List;

import Ders5Odev1.business.abstracts.UserService;
import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	List<User> users;

	public UserManager(UserDao userDao, List<User> users) {
		super();
		this.userDao = userDao;
		this.users = users;
	}

	@Override
	public void signIn(User user, String firstName, String lastName, String email, String password) {

		for (User _user : this.users) {
			if (_user.getEmail() == email) {
				System.out.println("bu maile kayýtlý mevcut bir hesap var");
				return;
			}
		}

		if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
			System.out.println("lütfen boþ alanlarý doldurunuz");
			return;
		} else if (email.length() < 11) {
			System.out.println("lütfen geçerli email giriniz");
			return;
		} else if (password.length() < 5) {
			System.out.println("parola en az 6 harf olmalýdýr");
			return;
		} else {
			this.userDao.signIn(user, firstName, lastName, email, password);
			this.users.add(user);
			System.out.println("kayýt tamamlanmasý için mailinizi onaylayýnýz");
		}

	}

	@Override
	public void login(User user, String email, String password) {

		if(user.getEmail()==email && user.getPassword()==password) {
			System.out.println("giriþ baþarýlý");
			return;
		}else {
			System.out.println("kullanýcý ya da þifre hatalý");
		}
		
	}
	
	@Override
	public void confirmMail(User user) {
		this.userDao.saveToDb(user);
		
	}

}
