package io.muic.ooc.webapp.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationLoader {

    public static ConfigProperties load(){
        try(FileInputStream fin = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            String configFileName = "config.properties";

            prop.load(fin);

            // get the property value and print it out

            String driverClassName = prop.getProperty("database.setDriverClassName");
            String connectionUrl = prop.getProperty("database.connectionUrl");
            String username = prop.getProperty("database.username");
            String password = prop.getProperty("database.password");

            new ConfigProperties.ConfigPropertiesBuilder()
                    .databaseDriverClassName(driverClassName)
                    .databaseConnectionUrl(connectionUrl)
                    .databaseUsername(username)
                    .databsePassword(password)
                    .build();

            ConfigProperties configProperties = new ConfigProperties();

            return new ConfigProperties.ConfigPropertiesBuilder()
                    .databaseDriverClassName(driverClassName)
                    .databaseConnectionUrl(connectionUrl)
                    .databaseUsername(username)
                    .databsePassword(password)
                    .build();
        } catch (Exception e) {
            return null;
        }
    }
}
