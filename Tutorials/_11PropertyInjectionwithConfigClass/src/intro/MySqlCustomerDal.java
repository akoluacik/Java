package intro;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal{

	@Value("${database.mySqlConnectionString}")
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
		System.out.println("Connection String:" + this.connectionString);
	}
	
}
