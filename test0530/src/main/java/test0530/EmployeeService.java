package test0530;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	public void register(Employee emp) {
		empDao.insert(emp);		
	}
}
