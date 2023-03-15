/*
 * package com.techno.server;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.boot.autoconfigure.domain.EntityScan; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource;
 * 
 * @Configuration
 * 
 * @EnableJpaRepositories(basePackages = "com.techno.server.repos")
 * 
 * @EntityScan("com.techno.server.entity") public class AppConfiguration {
 * 
 * @Bean public DataSource dataSource() { DriverManagerDataSource dataSource =
 * new DriverManagerDataSource(); String driverClassName =
 * "com.mysql.cj.jdbc.Driver"; String url =
 * "jdbc:mysql://localhost:3306/kuebiko_db"; String username = "root"; String
 * password = "mysql@1234"; dataSource.setDriverClassName(driverClassName);
 * dataSource.setUrl(url); dataSource.setUsername(username);
 * dataSource.setPassword(password); return dataSource; }
 * 
 * }
 */