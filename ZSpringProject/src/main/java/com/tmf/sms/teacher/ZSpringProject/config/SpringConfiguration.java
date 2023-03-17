package com.tmf.sms.teacher.ZSpringProject.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tmf.sms.teacher.ZSpringProject.dao.ModuleDAO;
import com.tmf.sms.teacher.ZSpringProject.dao.ModuleDAOImpl;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.tmf")
public class SpringConfiguration {
	
	@Bean
	public DataSource getDataSource() {
		System.out.println("DataSource");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/test");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}
	
	public Properties getHibernateProperties() {
		System.out.println("Hibernate Properties");
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", "true");
		return props;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("Session Factory");
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		sf.setHibernateProperties(getHibernateProperties());
		sf.setPackagesToScan(new String[] {"com.tmf.sms.teacher.ZSpringProject.models"});
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(sessionFactory().getObject());
		return tx;
	}
}
