package com.ty.zoo.Controller;

import com.ty.zoo.dto.VisitorDto;
import com.ty.zoo.service.VisitorService;

public class TestSaveVisitor {
	public static void main(String[] args) {
		VisitorDto visitotDto=new VisitorDto();
		visitotDto.setId(5);
		visitotDto.setName("deepthi");
		visitotDto.setEmail("deepthi@gmail.com");
		visitotDto.setPhone("66325588522");
		visitotDto.setGender("female");
		visitotDto.setAge("20");
		VisitorService visitorService=new VisitorService(); 
		visitorService.saveVisitor(visitotDto);
		
		if(visitotDto!=null) {
			System.out.println("inserten");
		}
		else {
			System.out.println("not inserted");
		}
	}

}
