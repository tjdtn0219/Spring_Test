package com.topcom.intime.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // DB넘버링 전략 따라감
	private int id;
	
	@Column(nullable = false, length = 30)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault(" 'user' ")
	private String role; //Enum사용 예정
	
	@CreationTimestamp //시간 자동 입력
	private Timestamp createDate;
	
	
//	@Builder // Builder하면 arguments를 모두 안넣어도 되고 원하는 알규만 너흥ㄹ 수 있음
//	public User(int id, String username, String password, String email) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.email = email;
//	}	
}
