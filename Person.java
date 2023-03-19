package com.one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private String gender;
private long phno;
@OneToOne(fetch=FetchType.LAZY)
private AdharCard card;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public AdharCard getCard() {
	return card;
}
public void setCard(AdharCard card) {
	this.card = card;
}

}
