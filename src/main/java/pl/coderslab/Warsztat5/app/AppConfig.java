package pl.coderslab.Warsztat5.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"pl.coderslab.Warsztat5.controller, pl.coderslab.Warsztat5.model"})
public class AppConfig extends WebMvcConfigurerAdapter{

	
}
