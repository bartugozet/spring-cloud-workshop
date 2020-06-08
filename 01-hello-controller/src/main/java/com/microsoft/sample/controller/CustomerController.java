package com.microsoft.sample.controller;

import com.microsoft.sample.domain.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    @ResponseBody
    public Customer findById(@PathVariable int customerId){
        return new Customer(1,"Bartu");
    }


    @RequestMapping(method =  RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String save(@RequestBody Customer customer){
        System.out.println("customer.getName() = " + customer.getName());
        return "ok";
    }
}
