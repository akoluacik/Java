package intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		// TODO Auto-generated method stub
		
		manager.add();
		
	}

}
