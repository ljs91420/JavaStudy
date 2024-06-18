package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Employee;

public class J05_DataModelClass {
	
	/*
		# 데이터 모델 클래스
		
			- 주로 DB에서 꺼낸 데이터를 담아놓은 용도의 클래스를 의미한다.(DTO, VO)
			- 꺼내온 데이터를 클래스 형태로 담아두면 컬렉션이나 매개변수에 활용하기 편해진다.
			- 조회하는 데이터의 형태대로 만들어 두고 활용한다.
	 */
	public static void main(String[] args) {
		DBConnector connector = new DBConnector("HR", "1234");
		
		// 데이터 모델 클래스를 활용하면 SELECT로 여러 행을 조회할 때 조회한 데이터를 리스트에 담아둘 수 있다.
		List<Employee> employees = new ArrayList<>();
		
		try (Connection conn = connector.getConnection()) {
			String sql = "SELECT * FROM employees";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					// DB에서 꺼낸 하나의 레코드가 하나의 인스턴스가 된다. 
					Employee emp = new Employee(rs);
					// 행으로 생성한 인스턴스를 리스트에 추가
					employees.add(emp);
					
					// 컬럼 이름 대신 컬럼의 순서를 넣는 오버로딩도 있다.
//					Integer employee_id = rs.getInt(1);
//					String first_name = rs.getString(2);
//					String last_name = rs.getString(3);
//					String email = rs.getString(4);
//					String phone_number = rs.getString(5);
//					Date hire_date = rs.getDate(6);
//					String job_id = rs.getString(7);
					// not null이 아닌 컬럼은 null값이 나올 수도 있으므로 Wrapper 클래스로 받아주는 것이 좋다.
//					Float salary = rs.getFloat(8);
//					Float commission_pct = rs.getFloat(9);
//					Integer manager_id = rs.getInt(10);
//					Integer department_id = rs.getInt(11);
					
//					System.out.printf("%s\t%s\n", first_name, salary);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
