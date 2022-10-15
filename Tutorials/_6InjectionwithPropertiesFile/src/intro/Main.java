package intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		//manager.add();
		customerService.add();
		
		// TODO Auto-generated method stub
		System.out.println("We used a file to assign a value in xml file");
		
	}

}
