
package com.offcn.cus.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.cus.bean.Customer;
import com.offcn.cus.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper cus;

    public PageInfo<Customer> getAllcus(int pageNo) {
        PageHelper.startPage(pageNo,4);
        List<Customer> list = cus.selectByExample(null);
        PageInfo<Customer> info = new PageInfo<Customer>(list);
        return  info;
    }
}

