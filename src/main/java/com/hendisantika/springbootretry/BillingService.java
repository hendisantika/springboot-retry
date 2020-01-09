package com.hendisantika.springbootretry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-retry
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/01/20
 * Time: 06.25
 */
@Service
public class BillingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BillingService.class);
    int counter = 0;
}
