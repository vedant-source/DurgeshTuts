package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.dao.StudentDaoImpl;

//This class can be used instead of writing config.xml

@Configuration
public class JdbcConfig {

		@Bean("ds")
		public DataSource getDataSource() {
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?useSSL=false");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		}
		
		@Bean("jdbcTemplate")
		public JdbcTemplate getJdbcTemplate() {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
		}
		
		@Bean("studentDaoImpl")
		public StudentDaoImpl getStudentDao() {
			StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
			studentDaoImpl.setJdbcTemplate(getJdbcTemplate());
			return studentDaoImpl;
		}
		
		
}
