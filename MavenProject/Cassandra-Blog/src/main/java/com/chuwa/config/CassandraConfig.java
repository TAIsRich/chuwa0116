package com.chuwa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableCassandraRepositories("com.chuwa.dao")
@EntityScan(basePackages = "com.chuwa.entity")
@EnableTransactionManagement
public class CassandraConfig extends AbstractCassandraConfiguration {
	@Override
	protected String getKeyspaceName() {
		return "springdata";
	}
	@Override
	public String getContactPoints(){
		return "192.168.1.100";
	}
}
