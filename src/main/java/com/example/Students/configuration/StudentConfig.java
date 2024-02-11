//package com.example.Students.configuration;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
////import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "personEntityManagerFactory",
//        transactionManagerRef = "personTransactionManager",
//        basePackages = { "com.example.Students.repository.PersonalDataRepository" })
//public class StudentConfig {
//
//	@Primary
//    @Bean(name="personalDataProperties")
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties dataSourceProperties() {
//
//        return new DataSourceProperties();
//    }
//	
//	@Primary
//	@Bean(name="personDatasource")
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource datasource(@Qualifier("personalDataProperties") DataSourceProperties properties){
//
//	    return properties.initializeDataSourceBuilder().build();
//	}
//	
//	@Primary
//	@Bean(name="personEntityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//	        (EntityManagerFactoryBuilder builder, @Qualifier("personDatasource") DataSource dataSource){
//
//	    return builder.dataSource(dataSource)
//	            .packages("com.example.Students.repository.PersonalDataRepository")
//	            .persistenceUnit("person").build();
//	}
//	
//	@Primary
//	@Bean(name = "personTransactionManager")
//	@ConfigurationProperties("spring.jpa")
//	public PlatformTransactionManager transactionManager(
//	    @Qualifier("personEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//
//	    return new JpaTransactionManager(entityManagerFactory);
//	}
//}
