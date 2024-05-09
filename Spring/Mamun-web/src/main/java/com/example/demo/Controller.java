package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class Controller {
	private final BlogRepo blogRepo;
	
	@Autowired
	public Controller(BlogRepo blogRepo) {
		this.blogRepo=blogRepo;
	}
	
	List<Blog> bloglist=new ArrayList<>();
	
	@GetMapping("/allblogs")
	public List<Blog> allblog(){
		bloglist=(List<Blog>) blogRepo.findAll();
		
		return bloglist;
	}
	
	
	@PostMapping("/createblog")
	public Blog postBlog(@RequestBody Blog blog) {
		
		Blog data = blogRepo.save(blog);
		
		return blog;
	}
	
	

}
