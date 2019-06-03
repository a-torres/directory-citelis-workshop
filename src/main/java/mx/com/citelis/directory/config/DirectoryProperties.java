package mx.com.citelis.directory.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "directory")
public class DirectoryProperties {
    private String version;
    private DirectoryDatasourceProperties datasource;
}