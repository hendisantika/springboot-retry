package com.hendisantika.springbootretry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-retry
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/01/20
 * Time: 06.26
 */
@RestController
@RequestMapping(value = "/billing")
public class BillingClientService {
    @Autowired
    private BillingService billingService;

    @GetMapping
    public String callRetryService() throws SQLException {
        return billingService.simpleRetry();
    }
}
