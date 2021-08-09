package com.subin.s1.employee;

import java.util.ArrayList;

public class EmployeeView {
	
	public void view(String all) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		ArrayList<EmployeeDTO> ar = employeeDAO.getlist();
		
		for(int i=0; i<ar.size();i++) {
			this.view(ar.get(i));
		}
		
	}
	
	public void view(EmployeeDTO employeeDTO) {
		
		System.out.println("============================================");
		System.out.println("사원번호 : " + employeeDTO.getEmployee_id());
		System.out.println("이름 : " + employeeDTO.getFirst_name());
		System.out.println("성 : " + employeeDTO.getLast_name());
		System.out.println("이메일 : " + employeeDTO.getEmail());
		System.out.println("휴대폰번호 : " + employeeDTO.getPhone_number());
		System.out.println("날짜 : " + employeeDTO.getHire_date());
		System.out.println("직업아이디 : " + employeeDTO.getJob_id());
		System.out.println("급여 : " + employeeDTO.getSalary());
		System.out.println("커미션 : " + employeeDTO.getCommission_pct());
		System.out.println("매니저아이디 : " + employeeDTO.getManager_id());
		System.out.println("부서번호 : " + employeeDTO.getDepartment_id());
		System.out.println("============================================");
	}
}
