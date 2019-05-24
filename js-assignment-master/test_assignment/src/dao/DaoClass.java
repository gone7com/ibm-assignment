package dao;
import java.util.HashMap;
import java.util.Map;

public class DaoClass implements DaoInterface{

	private HashMap<Integer,Employee> employees=new HashMap<Integer,Employee>();
	
	@Override
	public void storeIntoMap(int id,Employee employee) {
	
		employees.put(id, employee);
		
	}
	
	
	@Override
	public Map<Integer,Employee>displayEmployee(){
		return employees;
		
		
	
	}
	@Override
	public boolean checkId(int id) {
		boolean bl=employees.containsKey(id);
		
		return bl;
		
	}
	

}
