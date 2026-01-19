package com.generics.aidrivenresumescreeningsystem;

//Product Manager role
class ProductManager extends JobRole {

 @Override
 public String getRoleName() 
 {
     return "Product Manager";
 }

 @Override
 public int getMinimumExperience() 
 {
     return 5;
 }
}
