import Entities.Concretes.Customer;
import Business.Concretes.CustomerManager;
import Business.Concretes.MailVerificationManager;
import Business.Concretes.CustomerCheckManager;
import DataAccess.Concretes.HibernateCustomerDao;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Ünal Hami");
		customer1.setLastName("Demir");
		customer1.seteMail("unalhamidemir@outlook.com.tr");
		customer1.setPassword("0123456789");
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Ogün Abdullah");
		customer2.setLastName("Demir");
		customer2.seteMail("ogunabdullahdemir@outlook.com.tr");
		customer2.setPassword("6161616161");
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setFirstName("Ümit Okan");
		customer3.setLastName("Demir");
		customer3.seteMail("umitokandemir@outlook.com.tr");
		customer3.setPassword("613461346134");
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new MailVerificationManager(),new HibernateCustomerDao() );
		customerManager.signIn(customer3);
		customerManager.signUp(customer2);
		customerManager.signIn(customer1);
	}

}
