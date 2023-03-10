package prodapp_project.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import prodapp_project.dto.SignUp;

@Component
public class SignUpDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void saveCreds(SignUp saveUser) {
		hibernateTemplate.save(saveUser);
	}

	@Transactional
	public SignUp getSingleRecord(String email) {
		SignUp record = hibernateTemplate.get(SignUp.class, email);
		System.out.println("from signup  dao :  " + record);
		if (record == null) {
			return null;
		}
		return record;
	}
}
