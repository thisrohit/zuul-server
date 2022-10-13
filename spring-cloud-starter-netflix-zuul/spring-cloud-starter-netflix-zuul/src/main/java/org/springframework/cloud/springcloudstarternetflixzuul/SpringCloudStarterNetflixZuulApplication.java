package org.springframework.cloud.springcloudstarternetflixzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudStarterNetflixZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStarterNetflixZuulApplication.class, args);
	}

}
