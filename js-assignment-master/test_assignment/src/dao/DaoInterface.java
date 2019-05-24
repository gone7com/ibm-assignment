package dao;


import java.util.Map;


	public interface DaoInterface {
		
		
		void storeIntoMap(int id,Employee employee);
		Map<Integer,Employee> displayEmployee();
		boolean checkId(int id);
	}



