
package com.offcn.cus.service;

import com.github.pagehelper.PageInfo;
import com.offcn.cus.bean.Customer;

public interface CustomerService {
    public abstract PageInfo<Customer> getAllcus(int pageNo);
}

