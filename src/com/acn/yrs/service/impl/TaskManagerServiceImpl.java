package com.acn.yrs.service.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.yrs.dao.TaskManagerDao;
import com.acn.yrs.domain.Task;
import com.acn.yrs.service.TaskManagerService;

@Service("taskManagerService")
@Transactional
public class TaskManagerServiceImpl implements TaskManagerService {

	@Autowired
	private TaskManagerDao taskManagerDao;

	@Override
	public void addTask(Task task) {

		taskManagerDao.addTask(task);
	}

	@Override
	public void archiveTask(int taskId) throws ParseException {

		taskManagerDao.archiveTask(taskId);

	}

	@Override
	public void updateTask(Task task) throws ParseException {

		taskManagerDao.updateTask(task);

	}

	@Override
	public void changeTaskStatus(int taskId, String status)
			throws ParseException {

		taskManagerDao.changeTaskStatus(taskId, status);

	}

	@Override
	public List<Task> getAllTasks() {

		return taskManagerDao.getAllTasks();

	}

	@Override
	public Task getTaskById(int taskId) {

		return taskManagerDao.getTaskById(taskId);
	}

	/**
	 * @return the taskManagerDao
	 */
	public TaskManagerDao getTaskManagerDao() {
		return taskManagerDao;
	}

	/**
	 * @param taskManagerDao
	 *            the taskManagerDao to set
	 */
	public void setTaskManagerDao(TaskManagerDao taskManagerDao) {
		this.taskManagerDao = taskManagerDao;
	}

}
