package mx.jovannypcg.rassandra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories
public class CassandraConfiguration extends AbstractReactiveCassandraConfiguration {
    @Override
    protected String getKeyspaceName() {
        return null;
    }
}
