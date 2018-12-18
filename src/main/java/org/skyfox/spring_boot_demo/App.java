package org.skyfox.spring_boot_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("org.skyfox.spring_boot_demo.mapper")
////这行是为了避免扫描不到Druid的Servlet
@ServletComponentScan("org.skyfox.spring_boot_demo.config.druid")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    }
    
    @Bean("duridDatasource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() {
    	return new DruidDataSource();
    }

}
