package Ders5Odev1;

import java.util.ArrayList;
import java.util.List;

import Ders5Odev1.business.abstracts.UserService;
import Ders5Odev1.business.concretes.UserManager;
import Ders5Odev1.dataAccess.concretes.DefaultUserDao;
import Ders5Odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User();
		List<User> users = new ArrayList<User>();
		UserService userService = new UserManager(new DefaultUserDao(),users);

		userService.signIn(user1, "zafer", "konyar", "siarkonyar@gmail.com", "1234567");
		userService.confirmMail(user1);
		
		User user2 = new User();
		userService.signIn(user2, "siar", "konyar", "siarkonyar@gmail.com", "1234567");
		
	}

}
