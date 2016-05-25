package com.acn.yrs.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK_LIST")
public class Task extends BaseDomain{

	@Id
	@Column(name = "task_id", nullable = false)
	private int taskId;
	@Column(name = "task_name", nullable = false)
	private String taskName;
	@Column(name = "task_description", nullable = false)
	private String taskDescription;
	@Column(name = "task_priority")
	private String taskPriority;
	@Column(name = "task_status")
	private String taskStatus;

	@Column(name = "task_start_time")
	private Date taskStartTime;
	@Column(name = "task_end_time")
	private Date taskEndTime;

	@Column(name = "task_archived")
	private int taskArchived;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Override
	public String toString() {
		return "Task [task_id=" + taskId + ", task_name=" + taskName
				+ ", task_description=" + taskDescription + ", task_priority="
				+ taskPriority + ",task_status=" + taskStatus + "]";
	}

	/**
	 * @return the taskStartTime
	 */
	public Date getTaskStartTime() {
		return taskStartTime;
	}

	/**
	 * @param taskStartTime
	 *            the taskStartTime to set
	 */
	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	/**
	 * @return the taskEndTime
	 */
	public Date getTaskEndTime() {
		return taskEndTime;
	}

	/**
	 * @param taskEndTime
	 *            the taskEndTime to set
	 */
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	/**
	 * @return the taskArchived
	 */
	public int getTaskArchived() {
		return taskArchived;
	}

	/**
	 * @param taskArchived
	 *            the taskArchived to set
	 */
	public void setTaskArchived(int taskArchived) {
		this.taskArchived = taskArchived;
	}

}
