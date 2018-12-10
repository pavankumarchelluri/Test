package com.Employee.Spring.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:resources/application.properties" })
@ComponentScan(basePackages="com.Employee.hibernateConfiguration")
public class HibernateConfiguration {

	@Autowired
	private Environment environment;
	
	
	@Bean
	public DataSource dataSource() {
		System.out.println("came insidegetDataSource()");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver_class"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dataSource;

	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean lFactoryBean = new LocalSessionFactoryBean();
		lFactoryBean.setDataSource(dataSource());
		lFactoryBean.setHibernateProperties(getProperties());
		lFactoryBean.setPackagesToScan(new String[] { "com.Employee" });
		return lFactoryBean;

	}

	private Properties getProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		return properties;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s){
		HibernateTransactionManager ht =new HibernateTransactionManager();
		ht.setSessionFactory(s);
		return ht;
	}

}
