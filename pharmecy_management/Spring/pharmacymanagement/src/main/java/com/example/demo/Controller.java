package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.CustomerDAO;
import com.example.demo.DAO.DamageDAO;
import com.example.demo.DAO.OrderDAO;
import com.example.demo.DAO.OrderDetailsDAO;
import com.example.demo.DAO.PurchaseDAO;
import com.example.demo.DAO.PurchaseReportDAO;
import com.example.demo.DAO.Return_PurchaseDAO;
import com.example.demo.DAO.SaleDAO;
import com.example.demo.DAO.SaleReportDAO;
import com.example.demo.DAO.StockDAO;
import com.example.demo.DAO.SupplierDAO;
import com.example.demo.DAO.TransactionDAO;
import com.example.demo.DAO.UserDAO;
import com.example.demo.DAO.UserOrderDAO;
import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Damage;
import com.example.demo.Entity.DamageList;
import com.example.demo.Entity.Order;
import com.example.demo.Entity.OrderDetails;
import com.example.demo.Entity.Purchase;
import com.example.demo.Entity.PurchaseReport;
import com.example.demo.Entity.ReturnPurchase;
import com.example.demo.Entity.Sale;
import com.example.demo.Entity.SaleReport;
import com.example.demo.Entity.Stock;
import com.example.demo.Entity.Supplier;
import com.example.demo.Entity.Transaction;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserOrder;

@RestController

//@RequestMapping("/api/employees")
@CrossOrigin("*")

public class Controller {

//	save user 
	@PostMapping("/save-user")
	public void saveUser(@RequestBody User u) {
		UserDAO dao = new UserDAO();
		System.out.println("User => " + u);
		dao.createUser(u);

	}

//	save customer 
	@PostMapping("/save-customer")
	public void saveUser(@RequestBody Customer u) {
		CustomerDAO dao = new CustomerDAO();
		System.out.println("Customer => " + u);
		dao.createCustomer(u);

	}

	// ==============================Supplier=================================
//	save Supplier 
	@PostMapping("/save-supplier")
	public void saveSupplier(@RequestBody Supplier u) {
		SupplierDAO dao = new SupplierDAO();
		System.out.println("Supplier => " + u);
		dao.createSupplier(u);

	}

	// get all supplier
	@GetMapping("/get-all-suppliar")
	public List<Supplier> allSuppliarList() {
		SupplierDAO dao = new SupplierDAO();
		return dao.getAllSupplier();
	}

	// ============================================================================

	// ==========================Sale Purchase and
	// Stock===================================

	// new purchase
	@PostMapping("/save-purchase")
	public void savePurchase(@RequestBody List<Purchase> u) {
		PurchaseDAO dao = new PurchaseDAO();
		System.out.println("Purchase => " + u);
		dao.createPurchase(u);

	}

	// purchase return
	@PostMapping("/purchase-return")
	public void purchaseReturn(@RequestBody List<ReturnPurchase> rp) {
		Return_PurchaseDAO dao = new Return_PurchaseDAO();
		System.out.println("Purchase => " + rp);
		dao.returnPurchase(rp);
	}

	// purchase return
	@PostMapping("/save-damage")
	public void savedamage(@RequestBody List<Damage> d) {
		DamageDAO dao = new DamageDAO();
		System.out.println("Purchase => " + d);
		dao.saveDamage(d);
	}
	
	//  get Damage-List 
		@GetMapping("/get-damage")
		public List<DamageList> getDamageList () {
			DamageDAO dao = new DamageDAO();
//			System.out.println("Purchase => " + d);
			return dao.getdamageList();
		}
		
		
	//  get Damage-List 
			@GetMapping("/get-damage/{s}")
			public List<Damage> getDamageList (@PathVariable String s) {
				DamageDAO dao = new DamageDAO();
//				System.out.println("Purchase => " + d);
				return dao.getDamageList(s);
			}
	

	// new Add Stock
	@PostMapping("/add-new-stock")
	public void addNewStock(@RequestBody List<Stock> s) {
		StockDAO dao = new StockDAO();
		System.out.println("Purchase => " + s);
		dao.addNewStock(s);

	}

	// get all Stock Data
	@GetMapping("/get-all-stock-data")
	public List<Stock> allStockData() {
		StockDAO dao = new StockDAO();
		return dao.getAllStockData();
	}
	// =stock data by category==========================

	@GetMapping("/get-all-stock-data/{s}")
	public List<Stock> allStockData(@PathVariable String s) {
		StockDAO dao = new StockDAO();
		System.out.println(s);
		return dao.getAllStockDataByCatagory(s);
	}

	// =========Sale==

	@PostMapping("/save-sale")
	public String saveSale(@RequestBody List<Sale> s) {
		SaleDAO dao = new SaleDAO();
		String invoice = dao.createSale(s);
		StockDAO stock = new StockDAO();
		stock.updateSaleData(s);
		return invoice;
	}

	// ========================new Order==================
	@PostMapping("/save-order")
	public void saveOrder(@RequestBody List<Order> s) {
		OrderDAO dao = new OrderDAO();
		dao.saveOrder(s);
	}

	// ========================new Order==================
	@GetMapping("/get-order/{s}")
	public List<UserOrder> getOrder(@PathVariable String s) {
		System.out.println("get orders status => " + s);
		UserOrderDAO dao = new UserOrderDAO();
		List<UserOrder> userOrder = dao.getUserOrder(s);
		return userOrder;
	}
	
	

	// ======================== Order Details==================
	@GetMapping("/get-order-details/{invoice}/{status}")
	public List<OrderDetails> getOrderDetails(@PathVariable String invoice, @PathVariable String status) {
		System.out.println("get orders details invoice => " + invoice);
		System.out.println("get orders details status => " + status);
		OrderDetailsDAO dao = new OrderDetailsDAO();
		List<OrderDetails> userOrder = dao.getAllOrderDetails(invoice, status);
		return userOrder;
	}

	// ======================== Order Details==================
	@GetMapping("/update-order/{id}/{status}")
	public void updateOrders(@PathVariable int id, @PathVariable String status) {
		System.out.println("get orders  id => " + id);
		UserOrderDAO dao = new UserOrderDAO();
		dao.updateOrderStatus(id, status);

	}

	// ================Purchase report
	@GetMapping("/purchase-report/{startDate}/{endDate}/{type}/{invoice}")
	public List<PurchaseReport> getallSaleReport(@PathVariable Date startDate, @PathVariable Date endDate,
			@PathVariable String type, @PathVariable String invoice) {
		PurchaseReportDAO dao = new PurchaseReportDAO();
		List<PurchaseReport> report = dao.purchaseReport(startDate, endDate, type, invoice);
		System.out.println("Report => " + report);
		System.out.println("start => " + startDate);
		System.out.println("end => " + endDate);
		System.out.println("type => " + type);
		System.out.println("invoice => " + invoice);
		return report;
	}

	// ================Purchase report for return
	@GetMapping("/purchase-report/{invoiceOrBatchId}")
	public List<PurchaseReport> getallSaleReport(@PathVariable String invoiceOrBatchId) {
		PurchaseReportDAO dao = new PurchaseReportDAO();
		List<PurchaseReport> report = dao.purchaseReportforReturn(invoiceOrBatchId);

		return report;
	}

	// ================sale report
	@GetMapping("/sale-report/{startDate}/{endDate}/{type}")
	public List<SaleReport> purchaseReport(@PathVariable Date startDate, @PathVariable Date endDate,
			@PathVariable String type) {
		SaleReportDAO dao = new SaleReportDAO();
		List<SaleReport> report = dao.saleReport(startDate, endDate, type);
		System.out.println("Report => " + report);
		return report;
	}

	// ================================Save or update
	// customer============================
	Customer customer;

	@PostMapping("/add-customer")
	public Customer addNewStock(@RequestBody Customer c) {
		customer = null;
		CustomerDAO dao = new CustomerDAO();
//			System.out.println("Purchase => "+s);
		customer = dao.getCustomerByPhoneNo(c.getPhone());
		if (customer == null) {
			dao.createCustomer(c);
			customer = dao.getCustomerByPhoneNo(c.getPhone());

		}
		System.out.println("Customer is => " + customer);
		return customer;

	}

	// =========================================Transaction===================================================
	// ========================Save Transaction==================
	@PostMapping("/save-transaction")
	public void saveTransaction(@RequestBody Transaction t) {
		TransactionDAO dao = new TransactionDAO();
		dao.saveTrnsaction(t);
	}

}
