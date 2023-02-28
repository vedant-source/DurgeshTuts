package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dto.User;

@Repository
public class UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		int id = (Integer)hibernateTemplate.save(user);
		return id;
			}
}
