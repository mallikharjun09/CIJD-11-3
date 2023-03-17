package com.tmf.sms.teacher.ZSpringProject.services;

import java.util.List;
import com.tmf.sms.teacher.ZSpringProject.models.Module;
public interface ModuleService {
	Module getModule(int moduleId);
	List<Module> getAllModules();
	boolean updateModule(Module module);
	boolean addModule(Module module);
}
