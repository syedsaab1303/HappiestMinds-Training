package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user); // this will call the saveUser method of UserDao class and HibernateTemplate save the user
	
	
	}
	
/* 
 1) @Autowired ko ya to xml me declare krna hoga ya fir annotation lgana hoga tbhi spring container pehchaan payega.
 2) UserService me @Service lgayege taki spring container ko pta chale ye service class hai,we have to inject object of this class to the existing variables
 3) for database layer we use @Repository then spring container understand is class ka object bnakr isko inject krna hai jha bhi autowiring hui hogi through this we have to save database and get database. so that we don't declare it in .xml
   	
*/
	
}








