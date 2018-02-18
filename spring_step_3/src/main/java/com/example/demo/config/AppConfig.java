package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean(name = "dataSource", destroyMethod = "shutdown")
	@Profile("test")
	public DataSource dataSourceForTest() {
		return new EmbeddedDatabaseBuilder().generateUniqueName(true).setType(EmbeddedDatabaseType.H2)
				.setScriptEncoding("UTF-8").ignoreFailedDrops(true).addScript("schema.sql").addScripts("data.sql")
				.build();
	}

	@Bean(name = "transactionManager")
	@Profile("test")
	public PlatformTransactionManager transactionManagerForTest() {
		return new DataSourceTransactionManager(dataSourceForTest());
	}
}
