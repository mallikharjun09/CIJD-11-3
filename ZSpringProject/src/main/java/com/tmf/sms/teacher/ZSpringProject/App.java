package com.tmf.sms.teacher.ZSpringProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.tmf.sms.teacher.ZSpringProject.config.SpringConfiguration;
import com.tmf.sms.teacher.ZSpringProject.models.Module;
import com.tmf.sms.teacher.ZSpringProject.services.ModuleService;
import com.tmf.sms.teacher.ZSpringProject.services.ModuleServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main(String[] args )
    {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        //SessionFactory sf = context.getBean(SessionFactory.class);
         
        ModuleService service = new ModuleServiceImpl();
        //Session session = sf.openSession();
        Module mod = new Module();
        mod.setModuleDescription("Explaining different collections List, Set, Map and Generics");
        mod.setModuleDuration("4 Hours");
        mod.setModuleName("Collection Framework");
        
       service.addModule(mod);
       System.out.println("Module added successfully");
    }
}
