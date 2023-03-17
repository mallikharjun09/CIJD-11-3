package com.tmf.sms.teacher.ZSpringProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int moduleId;
	private String moduleName;
	private String moduleDescription;
	private String moduleDuration;
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	public String getModuleDuration() {
		return moduleDuration;
	}
	public void setModuleDuration(String moduleDuration) {
		this.moduleDuration = moduleDuration;
	}
	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName + ", moduleDescription="
				+ moduleDescription + ", moduleDuration=" + moduleDuration + "]";
	}
	
}
