package dao;


import java.util.Map;

import com.ibm.eis.bean.Employee;


	public interface DaoInterface {
		
		
		void storeIntoMap(int id,Employee employee);
		Map<Integer,Employee> displayEmployee();
		boolean checkId(int id);
	}



