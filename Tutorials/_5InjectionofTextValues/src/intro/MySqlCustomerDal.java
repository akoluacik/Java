package intro;

public class MySqlCustomerDal implements ICustomerDal{

	String connectionString; // jdbc:mysql:...
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Added to MySQL!");
	}
	
}
