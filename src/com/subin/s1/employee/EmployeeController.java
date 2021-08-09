package com.subin.s1.employee;

import java.util.Scanner;

public class EmployeeController {
	
	public void start() {
		
		EmployeeView employeeView = new EmployeeView();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		EmployeeDTO employeeDTO = new EmployeeDTO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
		System.out.println("1.전체사원 출력");
		System.out.println("2.특정사원 출력(번호검색)");
		System.out.println("3.Last_name으로 출력");
		System.out.println("4.First_name으로 출력");
		System.out.println("5.평균급여 정보 출력");
		System.out.println("6.부서별 평균급여 정보 출력");
		System.out.println("7.종 료");
		
		System.out.print("원하시는 작업을 선택해주세요 :");
		int select = sc.nextInt();
		System.out.println("");
		
		switch (select) {
			case 1: {
				// getlist 전체출력 메서드
				employeeView.view("all");
				break;
			}
			case 2:
				// 사원한명 아이디
				System.out.print("원하시는 사원의 번호를 입력해주세요 : ");
				int em_num = sc.nextInt();
				employeeDTO = employeeDAO.getOne(em_num);
				employeeView.view(employeeDTO);
				break;
			default:
				flag = false;
			}
		}
		
	}
}
