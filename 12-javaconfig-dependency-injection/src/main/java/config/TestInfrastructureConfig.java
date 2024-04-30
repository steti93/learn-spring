package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
public class TestInfrastructureConfig {
    @Bean
    public DataSource dataSource() {
        return
                (new EmbeddedDatabaseBuilder())
                        .addScript("classpath:rewards/testdb/schema.sql")
                        .addScript("classpath:rewards/testdb/data.sql")
                        .build();
    }
}
