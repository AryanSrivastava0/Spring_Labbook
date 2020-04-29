package com.labbook.lab2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.labbook.lab2.entity.Trainee;

@Repository
public class TraineeDAOImpl implements TraineeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Trainee> getTrainees() {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Trainee> theQuery=currentSession.createQuery("from Trainee",Trainee.class);
		List<Trainee> trainees=theQuery.getResultList();
		return trainees;
	}

	@Override
	public void saveTrainee(Trainee theTrainee) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.save(theTrainee);
		
	}

	@Override
	public Trainee getTrainee(int id) {
		Session currentSession=sessionFactory.getCurrentSession();
		Trainee theTrainee=currentSession.get(Trainee.class, id);
		return theTrainee;
	}

	@Override
	public void updateTrainee(Trainee theTrainee) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.update(theTrainee);		
	}

	@Override
	public void deleteTrainee(int id) {
		Session currentSession=sessionFactory.getCurrentSession();
		Trainee t=currentSession.get(Trainee.class, id);
		currentSession.delete(t);	
		
	}
}
