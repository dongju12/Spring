package com.smhrd.myapp.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.myapp.entity.MemberEntity;

// @Mapper // Bean으로 등록하기 위한 annotation
@Repository
public interface MemberMapper extends JpaRepository<MemberEntity, Long>{
	
	// JPA에서 제공해주는 기본 CRUD 메소드
	// 1. findAll()
	// --> SELECT * FROM MEMBER_ENTITY
	// 2. findById(pk값)
	// --> SELECT * FROM MEMBER_ENTITY WHERE PK컬럼명 = 매개변수
	// 3. save(받아올 매개변수 순서대로 or Entity형태)
	// --> INSERT INTO MEMBER_ENTITY VALUES(?,?,?,?)
	// 4. delete()
	// --> DELETE FROM MEMBER_ENTITY WHERE PK컬럼명 = 매개변수
	
	// 프로젝트에서 간단한 SQL구문만 사용한다 --> JPA 사용
	// 복잡한 SQL구문 사용한다 --> Mybatis Mapper 사용
	
	// 메소드명을 기준으로 sql구문을 생성
	// SELECT구문 규칙
	// find + 테이블명(생략가능) + By + 컬럼명 + And(Or) + 컬럼명...
	// * 주의할 점 : 반드시 카멜식으로 작성해야 한다.
	
	// SELETE * FROM MEMBER_ENTITY
	// WHERE ID = ?
	// AND PW = ?
	
	public MemberEntity findByIdAndPw(String id, String pw);
	// ** 주의할 점 ! SELETE구문의 조건절 데이터를 채울때는, 매개변수의 순서대로 채워진다
	
	// Spring MVC
	// SqlSessionFactoryBean 구현체를 만들어서 사용
	// Springboot
	// Hibernate 구현체를 만들어서 사용
	// ---> SpringbootContainer안쪽에 해당 클래스가 등록되어있어야함
	
}
