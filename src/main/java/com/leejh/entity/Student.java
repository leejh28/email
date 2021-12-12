package com.leejh.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student {
  @Id
  @GeneratedValue(generator = "generator")
  @GenericGenerator(name="generator", strategy = "uuid")
  private String id;
  @Column(name="name")
  private String name;
  @Column(name="age")
  private int age;

}
