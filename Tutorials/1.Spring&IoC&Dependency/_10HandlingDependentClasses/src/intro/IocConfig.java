package intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("intro")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
