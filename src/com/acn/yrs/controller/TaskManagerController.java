package com.acn.yrs.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acn.yrs.domain.Task;
import com.acn.yrs.service.TaskManagerService;

@RestController
public class TaskManagerController {

	@Autowired
	TaskManagerService taskManagerService;

	@RequestMapping(value = "/tasks", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Task> getAllTasks() {
		List<Task> tasks = taskManagerService.getAllTasks();
		return tasks;
	}

	@RequestMapping(value = "/tasks/archive/{taskIds}", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Task> archiveAllTasks(@PathVariable int[] taskIds)
			throws ParseException {
		for (int i = 0; i < taskIds.length; i++) {
			taskManagerService.archiveTask(taskIds[i]);

		}
		List<Task> tasks = taskManagerService.getAllTasks();
		return tasks;

	}

	@RequestMapping(value = "/tasks/{taskId}/{taskStatus}", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Task> changeTaskStatus(@PathVariable int taskId,
			@PathVariable String taskStatus) throws ParseException {
		taskManagerService.changeTaskStatus(taskId, taskStatus);
		return taskManagerService.getAllTasks();

	}

	@RequestMapping(value = "/tasks/insert/{taskName}/{taskDesc}/{taskPriority}/{taskStatus}", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Task> addTask(@PathVariable String taskName,
			@PathVariable String taskDesc, @PathVariable String taskPriority,
			@PathVariable String taskStatus) throws ParseException {
		Task task = new Task();
		task.setTaskName(taskName);
		task.setTaskDescription(taskDesc);
		task.setTaskPriority(taskPriority);
		task.setTaskStatus(taskStatus);
		task.setTaskStartTime(new Date());
		task.setTaskEndTime(new Date());
		taskManagerService.addTask(task);
		return taskManagerService.getAllTasks();

	}
}