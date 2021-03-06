package com.acn.yrs.service;

import java.text.ParseException;
import java.util.List;

import com.acn.yrs.domain.Task;

public interface TaskManagerService {

	public Task addTask(Task task);

	public void archiveTask(int taskId) throws ParseException;

	public void updateTask(Task task) throws ParseException;

	public void changeTaskStatus(int taskId, String status)
			throws ParseException;

	public List<Task> getAllTasks();

	public Task getTaskById(int taskId);
}
