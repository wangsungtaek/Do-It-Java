package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 333);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
				
	}

}
