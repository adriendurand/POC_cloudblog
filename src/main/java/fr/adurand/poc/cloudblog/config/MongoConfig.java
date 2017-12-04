package fr.adurand.poc.cloudblog.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("spring.data.mongodb")
public class MongoConfig extends AbstractMongoConfiguration {

    private String ip;
    private int port;
    private String db;

    @Override
    protected String getDatabaseName() {
        return db;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(ip, port);
    }

}
