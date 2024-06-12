package io.muic.ooc.webapp.service;

import com.zaxxer.hikari.HikariDataSource;
import io.muic.ooc.webapp.config.ConfigProperties;
import io.muic.ooc.webapp.config.ConfigurationLoader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnectionService {

    private final HikariDataSource ds;

    //Database connection pool using hikari library
    //the secret and avriables are loaded from disk
    //the file config.properties is not commited to git repository

    public DatabaseConnectionService() {
        ds = new HikariDataSource();
        ds.setMaximumPoolSize(20);

        ConfigProperties configProperties = ConfigurationLoader.load();

        if (configProperties ==null){
            throw new RuntimeException("Unable to initialize the config.properties");
        }
        ds.setDriverClassName(configProperties.getDatabaseDriverClassName());
        ds.setJdbcUrl(configProperties.getDatabaseConnectionUrl());
        ds.addDataSourceProperty("user",configProperties.getDatabaseUsername());
        ds.addDataSourceProperty("password", configProperties.getDatabsePassword());
        ds.setAutoCommit(false);
    }


    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
