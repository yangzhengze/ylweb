package cn.edu.asu.ylweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.edu.asu.ylweb.*.dao")
public class YlwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(YlwebApplication.class, args);
	}
}
