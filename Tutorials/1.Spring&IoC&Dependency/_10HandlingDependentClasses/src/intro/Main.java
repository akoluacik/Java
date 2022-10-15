package intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
		
		/*System.out.println("We need to remove @Component annotation in the database class which we don't want to use,"
				+  " \nand add @Component to another file which isn't useful."
				+  "\nTo handle this, we can define a bean in a java class and return it from a class.");*/
	}

}
