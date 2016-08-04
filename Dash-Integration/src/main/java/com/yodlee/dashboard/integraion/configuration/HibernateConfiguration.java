package com.yodlee.dashboard.integraion.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.yodlee.dashboard.integraion.configuration"})
public class HibernateConfiguration {

}
