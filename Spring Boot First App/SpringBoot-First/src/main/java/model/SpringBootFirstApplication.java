package model;


import model.Services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

		Laptop laptop = context.getBean(Laptop.class);

		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(laptop);


//		Alien alien = context.getBean(Alien.class);
//		alien.code();
	}
}
