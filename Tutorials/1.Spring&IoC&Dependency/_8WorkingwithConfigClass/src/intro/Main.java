package intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		customerDal.add();
		
		System.out.println("In this program, we used config file rather than xml file!");
	}

}
