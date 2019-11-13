
package com.offcn.cus.cotrlloer;

import com.github.pagehelper.PageInfo;
import com.offcn.cus.bean.Customer;
import com.offcn.cus.service.CustomerService;
import com.offcn.cus.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("cus")
public class CustomerCotrlloer {
    @Autowired
    CustomerService cus;
    @RequestMapping("getAllcus")
    public String getAllcus(Model m, @RequestParam(defaultValue = "1")int pageno) {
       PageInfo<Customer> info = cus.getAllcus(pageno);
       m.addAttribute("info","info") ;
        System.err.println(info);
       return "";
    }
}

