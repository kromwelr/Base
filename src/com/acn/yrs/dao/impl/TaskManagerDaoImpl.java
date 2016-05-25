package com.acn.yrs.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.acn.yrs.base.AbstractDao;
import com.acn.yrs.dao.TaskManagerDao;
import com.acn.yrs.domain.Task;

@Repository("taskManagerDao")
public class TaskManagerDaoImpl extends AbstractDao<Task> implements TaskManagerDao {

	public Criteria createCriteria(){
		return createCriteria(Task.class);
	}

	public Task addTask(Task task) {
		save(task);
		return task;
	}

	public void archiveTask(int taskId) throws ParseException {
		Task task = getTaskById(taskId);
		task.setTaskArchived(1);
		updateTask(task);
	}

	public void updateTask(Task task) throws ParseException {
		getSession().update(task);
	}

	public void changeTaskStatus(int taskId, String status) throws ParseException {
		Task task = getTaskById(taskId);
		task.setTaskStatus(status);
		updateTask(task);
	}

	public List<Task> getAllTasks() {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("taskArchived", 0));
		return criteria.list();
	}

	public Task getTaskById(int taskId) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("taskId", taskId));
		return (Task) criteria.uniqueResult();
	}



}