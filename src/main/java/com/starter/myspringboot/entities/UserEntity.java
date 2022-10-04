package com.starter.myspringboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "users")
public class UserEntity extends BaseEntity {

  @Column(nullable = false, length = 30, unique = true)
  private String code;

  @Column(nullable = false, length = 3, columnDefinition = "default 'AM'")
  private String type;

  @Column(nullable = true, length = 2, columnDefinition = "default '4'")
  private int level;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private String password;

  @Column(name = "firstname_th", nullable = false)
  private String firstNameTh;

  @Column(name = "lastname_th", nullable = false)
  private String lastNameTh;

  @Column(name = "firstname_en", nullable = false)
  private String firstNameEn;

  @Column(name = "lastname_en", nullable = false)
  private String lastNameEn;

  @Column(nullable = true, length = 30)
  private String phoneNo;

  @Column(nullable = true, length = 30)
  private String mobileNo;

  @Column(nullable = false)
  private boolean isActive;

  @Column(nullable = false)
  private boolean isDeleted;
}
