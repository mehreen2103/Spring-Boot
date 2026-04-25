package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;
import com.rays.dto.TestDTO;

@RestController
@RequestMapping(value="Demo")
public class DemoCtl {
	
//	@GetMapping
//	public String display() {
//		return "dispaly method";
//	}
//
//	@GetMapping("display1")
//	public TestDTO display1() {
//
//		TestDTO dto = new TestDTO();
//		dto.setId(1L);
//		dto.setFirstName("abc");
//		dto.setLastName("xyz");
//		dto.setLoginId("abc@gmail.com");
//		dto.setPassword("123");
//		dto.setDob("01-06-2025");
//
//		return dto;
//	}
	
	@GetMapping("test")
	public ORSResponse testORSResponse(){
		
		ORSResponse res  = new ORSResponse();
		
		TestDTO dto = new TestDTO();
		
		List list = new ArrayList();
		
		dto.setId(1l);
		dto.setFirstName("Mehreen");
		dto.setLastName("Ansari");
		dto.setLogin("meh@gmail.com");
		dto.setPassword("1234");
		dto.setDob("12:12:2003");
		
//		res.addData(dto);
		
		res.addMesaage("User added successfully");
		
		res.addInputError(dto);
		
		res.addData(list);
		
		return res;	
		
	}

}
