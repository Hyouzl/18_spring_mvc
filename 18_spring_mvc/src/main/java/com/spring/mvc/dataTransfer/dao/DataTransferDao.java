package com.spring.mvc.dataTransfer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dataTransfer.dto.MemberDto;
import com.spring.mvc.dataTransfer.dto.OrderDto;
import com.spring.mvc.dataTransfer.dto.ProductDto;

@Repository
public class DataTransferDao {

	@Autowired
	private SqlSession sqlSession;
	
	/*
	 * 
	 * # Mapper To DAO
	 * 
	 *  - 한개의 데이터를 조회할 경우       .selectOne() 메서드를 사용한다. (primary key 조건 , sum() , avg() , count())
	 *  - 한개 이상의 데이터를 조회할 경우  .selectList() 메서드를 사용하며 반환데이터는 List로 처리할 수 있다.
	 *      
	 *      주의) Mapper 파일에서 반환타입(resultType)이 List가 아니고 selectList() 메서드로 List를 처리한다.
	 *  
	 *  - insert쿼리를 사용할 경우 .insert() 메서드를 사용한다.
	 *  - update쿼리를 사용할 경우 .update() 메서드를 사용한다.
	 *  - delete쿼리를 사용할 경우 .delete() 메서드를 사용한다.
	 *  
	 * */
	
	
	public void selectData1() {
		System.out.println("\n selectData1 \n");
		int memberCnt = sqlSession.selectOne("dataTransfer.select1");
		System.out.println("memberCnt : " + memberCnt);
	}
	
	
	public void selectData2() {
		System.out.println("\n selectData2 \n");
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.select2");
		for (ProductDto productDto : productList) {
			System.out.println(productDto);
		}
		
	}
	
	
	public void selectData3() {
		System.out.println("\n selectData3 \n");
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.select3");
		for (ProductDto productDto : productList) {
			System.out.println(productDto);
		}
	}
	
	
	public void selectData4() {
		System.out.println("\n selectData4 \n");
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.select4");
		for (ProductDto productDto : productList) {
			System.out.println(productDto);
		}
	}
	
	
	public void selectData5() {
		System.out.println("\n selectData5 \n");
		List<Map<String,Object>> productList = sqlSession.selectList("dataTransfer.select5");
		for (Map<String, Object> map : productList) {
			System.out.println(map);
		}
		
	}
	
	/*
	 * 
	 * # DAO To Mapper
	 * 
	 *  - 2개 이상의 파라미터를 Mapper로 전달할 수 없고 오직 1개의 파라미터만 전송이 가능하다.
	 *  - 2개 이상의 데이터는 DTO , Map형식으로 전송한다.
	 *  - 전송되는 복수의 데이터가 DTO의 멤버로 포함되어 있으면 일반적으로 DTO 전송 방식을 사용하고
	 *    전송되는 복수의 데이터가 DTO의 멤버에 포함되어 있지 않은 경우 Map 전송 방식을 사용한다.
	 * 
	 * */
	
	// 1) DAO To Mapper 단일 데이터 전송 예시
	public void getData1(String memberId) {
		System.out.println("\n getData1 \n");
		MemberDto memberDto = sqlSession.selectOne("dataTransfer.getData1" , memberId);
		System.out.println(memberDto);
	}
	
	// 2) DAO To Mapper DTO 전송 예시
	public void getData2(ProductDto productDto) {
		System.out.println("\n getData2 \n");
		List<ProductDto> productList = sqlSession.selectList("dataTransfer.getData2" , productDto);
		for (ProductDto pDto : productList) {
			System.out.println(pDto);
		}
	
	}
	
	// 3) DAO To Mapper Map 전송 예시
	public void getData3(Map<String, Object> orderMap) {
		System.out.println("\n getData3 \n");
		List<Map<String,Object>> orderList = sqlSession.selectList("dataTransfer.getData3" , orderMap);
		for (Map<String, Object> map : orderList) {
			System.out.println(map);
		}
	}
	
	public void getData4(Map<String, String> orderMap) {
		System.out.println("\n getData4 \n");
		List<OrderDto> orderList = sqlSession.selectList("dataTransfer.getData4" , orderMap);
		for (OrderDto orderDto : orderList) {
			System.out.println(orderDto);
		}
	}
	
	
}
