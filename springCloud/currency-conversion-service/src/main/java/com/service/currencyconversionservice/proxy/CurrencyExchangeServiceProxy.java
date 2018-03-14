package com.service.currencyconversionservice.proxy;

import com.service.currencyconversionservice.bean.CurrencyConversionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by gbrescia on 14/03/2018.
 */
//@RibbonClient(name="currency-exchange-service")
@FeignClient(name="currency-exchange-service",url="localhost:8000")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from , @PathVariable("to") String to);

}
