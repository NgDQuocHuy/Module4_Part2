package com.codegym.demo2.repository;

import com.codegym.demo2.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
