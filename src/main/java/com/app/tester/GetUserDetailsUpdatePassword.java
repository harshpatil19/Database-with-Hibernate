package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;
import static java.time.LocalDate.parse;
import static com.app.entities.Role.valueOf;

public class GetUserDetailsUpdatePassword {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)) {
			UserDao userDao = new UserDaoImpl();
			System.out.println("Enter User email and oldPwd and new Pwd");
System.out.println(userDao.UpdatePassword(sc.next(), sc.next(), sc.next()));
			

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
