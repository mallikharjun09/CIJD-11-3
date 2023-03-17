package com.tmf.sms.teacher.ZSpringProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tmf.sms.teacher.ZSpringProject.models.Module;

@Repository
public class ModuleDAOImpl implements ModuleDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public ModuleDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	@Override
	public Module getModule(int moduleId) {
		// TODO Auto-generated method stub
		return (Module) getSession().get(Module.class, moduleId);
	}

	@Override
	public List<Module> getAllModules() {
		
		return (List<Module>) getSession()
				.createQuery("from Module").list();
	}

	@Override
	public boolean updateModule(Module module) {
		boolean result=false;
		getSession().saveOrUpdate(module);
		result=true;
		return result;
	}

	@Override
	public boolean addModule(Module module) {
		boolean result=false;
		getSession().save(module);
		result=true;
		return result;
	}

}
