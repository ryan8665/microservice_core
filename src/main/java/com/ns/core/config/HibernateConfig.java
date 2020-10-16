package com.ns.core.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
public class HibernateConfig {
//    private static HikariConfig config = new HikariConfig();
//    private static HikariDataSource ds;
//    private LocalSessionFactoryBean sessionFactory;
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        try {
//            sessionFactory = new LocalSessionFactoryBean();
//            sessionFactory.setDataSource(dataSource());
//            sessionFactory.setHibernateProperties(hibernateProperties());
//            sessionFactory.setAnnotatedPackages("com.entity");
//            sessionFactory.setPackagesToScan("com.entity");
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//        return sessionFactory;
//    }
//
//    @Bean
//    public HikariDataSource dataSource() {
//        config.setJdbcUrl("");
//        config.setUsername("");
//        config.setPassword("");
//        config.setDriverClassName("");
//        config.addDataSourceProperty("cachePrepStmts", "true");
//        config.addDataSourceProperty("prepStmtCacheSize", "250");
//        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//        try {
//            ds = new HikariDataSource(config);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ds;
//    }
//
//    Properties hibernateProperties() {
//        Properties props = new Properties();
//        props.put("hibernate.dialect", "");
//        return props;
//    }

}
