package springmvc.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {

	// HibernateTemplate is ORM class which is the way to reach database.
	@Autowired   // object inserted by spring container
	private HibernateTemplate hibernateTemplate;
	
	@Transactional // for writing in db
	public int saveUser(User user)
	{
	int id=(Integer) this.hibernateTemplate.save(user);
	return id;
	}
	
	
	
	

}


