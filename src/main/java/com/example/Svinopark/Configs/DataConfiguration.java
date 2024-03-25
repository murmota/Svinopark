package com.example.Svinopark.Configs;

import com.example.Svinopark.dal.DataAccessLayer;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DataConfiguration {
    private final SessionFactory sessionFactory;
    @Autowired
    public DataConfiguration(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Bean
    public DataAccessLayer dataAccessLayer(){
        return new DataAccessLayer(sessionFactory);
    }

}

