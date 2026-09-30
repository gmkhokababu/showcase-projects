package com.project.realestate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UsersController {
	
	private final TenantRepo tenantRepo;
	private final NotificationRepo notificationRepo;
	
	public UsersController(TenantRepo tenantRepo,NotificationRepo notificationRepo) {
		this.tenantRepo=tenantRepo;
		this.notificationRepo=notificationRepo;
	}
	
	//---------------------------user login--------------------------
	
		@GetMapping("/{id}/{password}")
		public Users login(@PathVariable String id,@PathVariable String password) {
			UsersDA da= new UsersDA();
			Users data = da.login(id, password);
			return data;
		}

		//--------------------------create user------------------------
		
		@PostMapping("/create-user")
		public Users create(@RequestBody Users u) {
			System.out.println("User Controller");
			UsersDA da= new UsersDA();
			Users data = da.create(u);
			return data;
		}
		
		//------------------------create tenant---------------------
		
		@PostMapping("/create-tenent")
		public Tenant createtenant(@RequestBody Tenant u) {
			TenantDA da= new TenantDA();
			Tenant data = da.create(u);
			return data;
		}
		
		//-----------------------post property-------------------------
		
		@PostMapping("/postproperty")
		public Property postproperty(@RequestBody Property p) {
			
			PropertyDA da= new PropertyDA();
			Property data= da.save(p);
			return data;
		}
		
		//--------------------------all property-----------------------------
		
		@GetMapping("/getproperty")
		public List<Property> allproperty(){
			List<Property> property=new ArrayList<>();
			
			PropertyDA da=new PropertyDA();
			property = da.allproperty();
			return property;
		}
		
		//--------------------------all country----------------------
		
		@GetMapping("/country")
		public List<Country> allcountry(){
			List<Country> property=new ArrayList<>();
			
			CountryDA da=new CountryDA();
			property = da.allcountry();
			return property;
		}
		
		//--------------------------all Division----------------------
		
				@GetMapping("/division")
				public List<Division> alldivision(){
					List<Division> division=new ArrayList<>();
					
					DivisionDA da=new DivisionDA();
					division = da.alldivision();
					return division;
				}
			
				//--------------------------all Division----------------------
				
				@GetMapping("/division/{id}")
				public List<Division> divisionById(@PathVariable int id ){
					List<Division> division=new ArrayList<>();
					
					DivisionDA da=new DivisionDA();
					division = da.alldivision();
					return division;
				}
			
				//--------------------------all city----------------------
				
				@GetMapping("/city")
				public List<City> allcity(){
					List<City> city=new ArrayList<>();
					
					CityDA da=new CityDA();
					city = da.allcity();
					return city;
				}	
				
				//------------------Get tenant by Id-------------------------
				@GetMapping("/tenant/{id}")
				public Tenant getTenantById(@PathVariable int id) {
					
					System.out.println("Tenant id=> "+id);
					TenantDA da = new TenantDA();
					return da.getTenantbyId(id);
				}

				
				//------------------------Notification Save----------------------------
				
				@GetMapping("/save-notification/{phone}/{landloardId}")
				public void saveNotification(@PathVariable String phone, @PathVariable int landloardId) {
					System.out.println("Phone=> "+phone);
					System.out.println("landloardId=> "+landloardId);
					NotificationDA da = new NotificationDA();
					da.SaveNotification(phone, landloardId);
				}
				
				//==========================update Notification=======================================
				@GetMapping("/update-notification/{notificationStatus}/{notificationId}")
				public void updateNotification(@PathVariable String notificationStatus, @PathVariable int notificationId) {
					System.out.println("notificationStatus=> "+notificationStatus);
					System.out.println("notificationId=> "+notificationId);
					NotificationDA da = new NotificationDA();
					da.updteNotification(notificationStatus, notificationId);
				}
				
				List<Notification> allNotification=new ArrayList<>();
				@GetMapping("/get-notification")
				public List<Notification> notification(){
					NotificationDA da= new NotificationDA();
					allNotification=da.allNotification();
//					allNotification=(List<Notification>) notificationRepo.findAll();
					
					return allNotification;
				}	
				
				
				
//				======================create a schedule=================================
				
				@GetMapping("/save-schedule/{date}/{time}/{tourType}/{propertyId}/{visitorId}")
				public void createSchedule(@PathVariable Date date, @PathVariable String time, @PathVariable String tourType, @PathVariable int propertyId, @PathVariable int visitorId){
					ScheduleATourDA da= new ScheduleATourDA();
					da.saveShedule(date, time, tourType, propertyId, visitorId);
					
					
				}	
				
				@GetMapping("/all-schedule")
				public List<ScheduleATour> createSchedule(){
					ScheduleATourDA da= new ScheduleATourDA();
					return da.getAllData();
					
					
				}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
