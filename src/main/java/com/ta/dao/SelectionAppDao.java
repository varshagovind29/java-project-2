package com.ta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ta.dto.SelectionAppDto;


@Repository

public class SelectionAppDao 
{
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public void saveSelectionAppDto(SelectionAppDto selectionApp) 
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(selectionApp);
		entityTransaction.commit();
	}

	public SelectionAppDto getSelectionAppDtoById(int id) 
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(SelectionAppDto.class, id);
	}

	

	public boolean deleteSelectionAppDto(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		SelectionAppDao SelectionApp = entityManager.find(SelectionAppDao.class, id);
		if (SelectionApp != null) {
			entityTransaction.begin();
			entityManager.remove(SelectionApp);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<SelectionAppDto> getAllSelectionAppDto() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT b FROM SelectionAppDao  b");
		return query.getResultList();
	}

	public void updateSelectionAppDto(SelectionAppDto selectionApp) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(selectionApp);
		entityTransaction.commit();
		
	}
	
	

}
