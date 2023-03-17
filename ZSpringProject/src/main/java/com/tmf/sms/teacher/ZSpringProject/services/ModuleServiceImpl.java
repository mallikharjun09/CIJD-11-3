package com.tmf.sms.teacher.ZSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tmf.sms.teacher.ZSpringProject.models.Module;
import com.tmf.sms.teacher.ZSpringProject.dao.ModuleDAO;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleDAO moduleDAO;
	
	@Override
	public Module getModule(int moduleId) {
		// TODO Auto-generated method stub
		return moduleDAO.getModule(moduleId);
	}

	@Override
	public List<Module> getAllModules() {
		// TODO Auto-generated method stub
		return moduleDAO.getAllModules();
	}

	@Override
	public boolean updateModule(Module module) {
		// TODO Auto-generated method stub
		return moduleDAO.updateModule(module);
	}

	@Override
	public boolean addModule(Module module) {
		// TODO Auto-generated method stub
		return moduleDAO.addModule(module);
	}

}
