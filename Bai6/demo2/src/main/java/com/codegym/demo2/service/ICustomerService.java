package com.codegym.demo2.service;

import com.codegym.demo2.model.Customer;

public interface ICustomerService {

    boolean insertWithStoredProcedure(Customer customer);
}
