package com.edu.dao;

import com.edu.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {



        //增加一个Book
        int addCustomer(Customer customer);

        //根据id删除一个Book
        int deleteCustomerById( @Param("Cid") int id);

        //更新Book
        int updateCustomer(Customer customer);

        //根据id查询,返回一个Book
        Customer queryCustomerById( @Param("Cid") int id);

        //查询全部Book,返回list集合
        List<Customer> queryAllCustomer();

        Customer queryCustomer(@Param("Cname") String name);
    }


