import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import payment.ibm.bean.AccountUser;
import payment.ibm.dao.daoClass;
import payment.ibm.ui.MainUi;

class paymenttestcase {
	AccountUser user = new AccountUser();

	@BeforeEach()
	void beforeeach() {
		System.out.println("before run");
	}

	@Test
	void userattributetest() {
		MainUi mu = new MainUi();
		
		user.setUser_name("ankit agnihotri");
		user.setAccount_no(975822464);
		user.setUser_phone(639585740);
		user.setUser_Add("M p");

		
		assertEquals("ankit agnihotri", user.getUser_name());

	}

	@Test
	void validatePhone() {
		MainUi mainui= new MainUi();
		assertAll(
		()->assertEquals(true,mainui.validatephonenumber("9758224547")),
		()->assertEquals(false,mainui.validatephonenumber("asdsa"))
				);
	}

	
	@Test
	void validateUsername() {
		MainUi mainui= new MainUi();
		assertAll(
		()->assertEquals(true,mainui.validateusername("dheeraj jo")),
		()->assertEquals(false,mainui.validatephonenumber("")),
		()->assertEquals(false,mainui.validateusername("dheeraj_joshi")),
		()->assertEquals(false,mainui.validateusername("913723"))
				);
	}
	
	@Test
	void validateFundTransfer() {
		daoClass dao= new daoClass();
		assertAll(
		()->assertEquals(false,dao.fundTransfer(201617961,1234567890, 7000)),
		()->assertEquals(false,dao.fundTransfer(1234567890,201617961, 7000))		);
	}
	
	

}
