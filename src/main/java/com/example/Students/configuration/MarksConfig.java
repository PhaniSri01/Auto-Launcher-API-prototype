//package com.example.Students.configuration;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
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
//        entityManagerFactoryRef = "marksEntityManagerFactory",
//        transactionManagerRef = "marksTransactionManager",
//        basePackages = { "com.example.Students.repository.MarksDataRepository" })
//public class MarksConfig {
//
//    @Bean(name="marksDataProperties")
//    @ConfigurationProperties("spring-second.datasource")
//    public DataSourceProperties dataSourceProperties() {
//
//        return new DataSourceProperties();
//    }
//	
//	@Bean(name="marksDatasource")
//	@ConfigurationProperties(prefix = "spring-second.datasource")
//	public DataSource datasource(@Qualifier("marksDataProperties") DataSourceProperties properties){
//
//	    return properties.initializeDataSourceBuilder().build();
//	}
//	
//	@Bean(name="marksEntityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//	        (EntityManagerFactoryBuilder builder,  @Qualifier("marksDatasource") DataSource dataSource){
//
//	    return builder.dataSource(dataSource)
//	            .packages("com.example.Students.repository.MarksDataRepository")
//	            .persistenceUnit("marks").build();
//	}
//	
//	@Bean(name = "marksTransactionManager")
//	@ConfigurationProperties("spring.jpa")
//	public PlatformTransactionManager transactionManager(
//	        @Qualifier("marksEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//
//	    return new JpaTransactionManager(entityManagerFactory);
//	}
//}
