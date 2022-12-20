package com.spring.mvc.dataTransfer.dto;

import org.springframework.stereotype.Component;

@Component
public class MemberDto {
	
	
	private String memberId;
	private String memberName;
	private String memberGender;
	private String hp;
	private String email;
	private String residence;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberName=" + memberName + ", memberGender=" + memberGender
				+ ", hp=" + hp + ", email=" + email + ", residence=" + residence + "]";
	}
	
	

}
