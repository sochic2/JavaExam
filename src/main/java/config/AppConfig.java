package config;

import db.MysqlRepository;
import db.OracleRepository;
import db.Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.UserService;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService(oracleRepository());
    }

    @Bean
    public Repository oracleRepository() {
        return new OracleRepository();
    }

    @Bean
    public Repository mysqlRepository() {
        return new MysqlRepository();
    }
}
