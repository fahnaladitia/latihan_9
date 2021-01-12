package net.latihan.tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password321";
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println(encodedPassword);
	}
}
