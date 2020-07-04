package com.edu.service;

import com.edu.pojo.Books;
import com.edu.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerService {

    //增加一个Customer
    int addCustomer(Customer customer);
    //根据id删除一个Customer
    int deleteCustomerById(int id);
    //更新Customer
    int updateCustomer(Customer customer);
    //根据id查询,返回一个Customer
    Customer queryCustomerById(int id);
    //查询全部Customer,返回list集合
    List<Customer> queryAllCustomer();
    Customer queryCustomer( String name);

}
