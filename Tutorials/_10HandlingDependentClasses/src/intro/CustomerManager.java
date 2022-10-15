package intro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;

	// ctor injection
	// using constructor-arg in xml
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	// setter injection
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}
	
	public void add() {
		//do something
		customerDal.add();
	}
	
}
