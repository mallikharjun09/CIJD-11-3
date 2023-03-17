package com.tmf.sms.teacher.ZSpringProject.dao;

import java.util.List;
import com.tmf.sms.teacher.ZSpringProject.models.Module;
public interface ModuleDAO {
	Module getModule(int moduleId);
	List<Module> getAllModules();
	boolean updateModule(Module module);
	boolean addModule(Module module);
}
