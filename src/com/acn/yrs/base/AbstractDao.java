package com.acn.yrs.base;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.acn.yrs.domain.BaseDomain;

public abstract class AbstractDao<T extends BaseDomain>{

	@Autowired
	private SessionFactory sessionFactory;

	public abstract Criteria createCriteria();

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public T save(T t) {
		return (T) getSession().save(t);
	}

	public void delete(T t) {
		getSession().delete(t);
	}

	public T update(T t){
		getSession().update(t);
		return t;
	}

	public Criteria createCriteria(Class clazz){
		return getSession().createCriteria(clazz);
	}
}

