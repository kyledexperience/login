package co.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager em;

	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}

	public void create(User user) {
		em.persist(user);
	}

	public void update(User user) {
		em.merge(user);
	}

	public void delete(Long id) {
		em.remove(em.getReference(User.class, id));
	}

}
