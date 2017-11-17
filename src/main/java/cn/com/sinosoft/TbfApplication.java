package cn.com.sinosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class TbfApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbfApplication.class, args);
	}
}
