package Ders5Odev1.google;

import Ders5Odev1.entities.concretes.User;

public class GoogleUserDao {

	
	public void signIn(User user, String firstName, String lastName, String email, String password) {

		System.out.println("google ile kayýt yapýldý");
		
	}

	
	public void login(User user, String email, String password) {

		System.out.println("google ile giriþ yapýldý");
		
	}

	
	public void saveToDb(User user) {

		System.out.println("kayýt tamamlandý");
		
	}
	
}
