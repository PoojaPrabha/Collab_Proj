package com.myproj.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.myproj.model.BlogComment;
import com.myproj.model.BlogPost;
import com.myproj.model.BlogPostLikes;
import com.myproj.model.Friend;
import com.myproj.model.Job;
import com.myproj.model.Notification;
import com.myproj.model.ProfilePicture;
import com.myproj.model.User;

@Configuration
@EnableTransactionManagement
public class DBConfiguration {
	
	public DBConfiguration() {
		System.out.println("DBConfiguration class INSTANTIATED");
	}

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder lsf = new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernateProperties);
		Class classes[] = new Class[] {User.class,Job.class,BlogPost.class,BlogPostLikes.class,Notification.class,BlogComment.class,ProfilePicture.class,Friend.class};
		return lsf.addAnnotatedClasses(classes).buildSessionFactory();
	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("MYORACLE");
		dataSource.setPassword("oracle");
		return dataSource;

	}

	@Bean
	public HibernateTransactionManager hibTransManagement() {
		return new HibernateTransactionManager(sessionFactory());
	}

}