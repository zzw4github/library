package me.zzw.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@MapperScan(basePackages = "me.zzw.library.dao")
@EnableCaching
@EnableScheduling
public class LibraryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(LibraryApplication.class, args);
		System.out.println(context.getEnvironment().getProperty("spring.redis.host"));
	}
	
	

}

