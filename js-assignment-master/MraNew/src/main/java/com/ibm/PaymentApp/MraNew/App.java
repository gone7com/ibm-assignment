package com.ibm.PaymentApp.MraNew;

import com.ibm.mra.service.AccountServiceImpl;
import com.ibm.mra.ui.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.ibm.mra.ui.MainUi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
		MainUi payment = (MainUi) context.getBean("MainUi");
		AccountServiceImpl service= (AccountServiceImpl)context.getBean("Service");
		payment.play(service);

    }
}
