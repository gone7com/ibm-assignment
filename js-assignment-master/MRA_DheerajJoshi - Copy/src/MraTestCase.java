import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.AccountDaoImpl;
import com.ibm.mra.ui.MainUi;


class MraTestCase {

	@Test
	void rechargeAcoount() {
		
	
	AccountDaoImpl dao= new AccountDaoImpl();
	
	assertEquals(0,dao.rechargeAccount("9010210131",200) );
	assertEquals(0,dao.rechargeAccount("9010212222",200) );
}
	@Test
	void validateNumber() {
		
		
		MainUi ui= new MainUi();
		
		assertEquals(false,ui.validateMobileNumber("9010210131") );
		assertEquals(true,ui.validateMobileNumber("901021qwe2") );
	}
	
	@Test
	void accountDetails() {
		AccountDaoImpl dao= new AccountDaoImpl();
		assertEquals("Vaishali",dao.getAccountDetails("9010210131").getCustomerName() );
			
	}
}
