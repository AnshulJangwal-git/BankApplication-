package com.eazybytes.accounts.functions;

import com.eazybytes.accounts.service.IAccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AccountsFunctions {
    private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

    @Autowired
    private IAccountsService accountsService;

    @Bean
    public Consumer<Long> updateCommunication(){
        return accountNumber -> {
          log.info("Updating Communication status for the account number: "+ accountNumber.toString());
          accountsService.updateCommunicationStatus(accountNumber);
        };
    }
}
