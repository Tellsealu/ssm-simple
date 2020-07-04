package com.edu.service;

import com.edu.dao.BookMapper;
import com.edu.dao.CustomerMapper;
import com.edu.pojo.Books;
import com.edu.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private CustomerMapper customerMapper;
    public  void setCustomerMapper(CustomerMapper customerMapper){
        this.customerMapper=customerMapper;
    }
    public  int addCustomer(Customer customer){
        return customerMapper.addCustomer(customer);
    }

    public  int deleteCustomerById(int id){
        return  customerMapper.deleteCustomerById(id);
    }
    public int updateCustomer (Customer customer){
        return customerMapper.updateCustomer(customer);
    }
    public Customer queryCustomerById(int id){
        return customerMapper.queryCustomerById(id);

    }
    public  List<Customer> queryAllCustomer(){
        return customerMapper.queryAllCustomer();
    }


    public Customer queryCustomer(String Cname) {
        return customerMapper.queryCustomer(Cname);
    }


}
