package com.edu.controller;


import com.edu.pojo.Customer;
import com.edu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    //调service层
    @Autowired
    @Qualifier("CustomerServiceImpl")
    private CustomerService customerService;

    @RequestMapping("/allcustomer")
    public String list(Model model) {
        List<Customer> list = customerService.queryAllCustomer();
        model.addAttribute("list", list);
        return "allCustomer";
    }

    @RequestMapping("/toaddcustomer")
    public String toAddPaper() {
        return "addCustomer";
    }


    @RequestMapping("/addcustomer")
    public String addCustomer(Customer customer) {
        customerService.addCustomer(customer);
        return "redirect:/customer/allcustomer";//重定向到我们的、/add请求
    }

    @RequestMapping("/toupdatecustomer")
    public String update(int id, Model model) {
        Customer customer = customerService.queryCustomerById(id);
        System.out.println(customer);
        model.addAttribute("customer", customer);

        return "updatecustomer";

    }

    @RequestMapping("/updatecustomer")
    //修改
    public String update(Model model, Customer customer) {
        System.out.println(customer);
        customerService.updateCustomer(customer);
        Customer customer1 = customerService.queryCustomerById(customer.getCid());
        model.addAttribute("customers", customer1);
        return "redirect:/customer/allcustomer";//重定向到我们的、/add请求

    }

    //restfau风格
    @RequestMapping("/delete/")
    public String delete(int id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customer/allcustomer";//重定向到我们的、/add请求


    }

    @RequestMapping("/query")
    public String query(String queryname, Model model) {
        Customer customer = customerService.queryCustomer(queryname);

        List<Customer> list = new ArrayList<Customer>();
        list.add(customer);
        if (customer == null) {
            list = customerService.queryAllCustomer();
            model.addAttribute("error", "未查到");
        } else
            model.addAttribute("list", list);
            return "allCustomer";



    }

}








