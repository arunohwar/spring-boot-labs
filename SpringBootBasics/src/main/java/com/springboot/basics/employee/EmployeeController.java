package com.springboot.basics.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public Map greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		List<EmployeeV1> lstEmployees = new ArrayList<>();		
		lstEmployees.add(new EmployeeV1(1, "ABC"));
		lstEmployees.add(new EmployeeV1(1, "LMN"));
		lstEmployees.add(new EmployeeV1(1, "PQR"));
		
		
		Map<String , EmployeeV1 > mapEmployees = new HashMap<>();
		mapEmployees.put("1", new EmployeeV1(1, "A1"));
		mapEmployees.put("2", new EmployeeV1(1, "B2"));
		mapEmployees.put("3", new EmployeeV1(1, "C3"));
		
		return  mapEmployees;
	}

}
