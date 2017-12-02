package fr.adurand.poc.cloudblog.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "cloudblog";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("172.19.0.2", 27017);
    }

}
