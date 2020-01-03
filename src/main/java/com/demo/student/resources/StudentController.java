package com.demo.student.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.student.entity.Address;
import com.demo.student.entity.College;
import com.demo.student.entity.Department;
import com.demo.student.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo repo;

	@Autowired
	RestTemplate restTempalte;

	@GetMapping("/{sid}")
	public Student getStudent(@PathVariable("sid") int sid) {
		Department d = new Department(1, "mech", "sub1");
		Student s = repo.findById(sid).get();
		Address a = restTempalte.getForObject("http://addressmicroservices/address/" + s.getAid(), Address.class);
		College c = restTempalte.getForObject("http://collegemicroservices/college/" + s.getCid(), College.class);
		s.setAdd(a);
		s.setCollege(c);
		s.setDep(d);
		return s;

	}

	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
