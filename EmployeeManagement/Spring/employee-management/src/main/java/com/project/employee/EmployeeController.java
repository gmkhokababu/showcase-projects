package com.project.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

//	@Autowired
//	private EmployeesRepo employeeRepo;
//	@Autowired
//	private UserRepo userRepo;
//	@Autowired
//	private AttendanceRepo attendanceRepo;
//	@Autowired
//	private DepartmentRepo departmentRepo;
//	@Autowired
//	private RoleRepo roleRepo;
	
	
	//___________________________All Employee Data_______________________________________
	
	public List<Employees> employees=new ArrayList<>();
	
	@GetMapping("/all-employee")
    public List<Employees> getAllEmployees() {
//       this.employees=employeeRepo.findAll();
		EmployeeDA da=new EmployeeDA();
		employees=da.allemployees();
        
        return employees;
        
        
    }
	
	
	
	//_________________________________Login ___________________________________________
	
	@GetMapping("/{userName}/{password}")
	public User login(@PathVariable String userName, @PathVariable String password) {
		UserDA da=new UserDA();
		return da.loginUser(userName, password);
	}
	
	
	//-------------------------------------All Department---------------------------------
	
	@GetMapping("/departments")
	public List<Department> allDepartments() {
		DepartmentDA da = new DepartmentDA();
       
       return da.alldepartment();
   }
	
	//--------------------------------All Role---------------------------------------------
	@GetMapping("/roles")
	public List<Role> allRole() {
		RoleDA da = new RoleDA();
       
       return da.allrole();
   }
	
	
	//------------------------------Create Departments--------------------------------------
	@PostMapping("/departments/{departmentName}")
	public void login(@PathVariable String departmentName) {
		DepartmentDA da = new DepartmentDA();
		da.createDepartment(departmentName);
	}
}
