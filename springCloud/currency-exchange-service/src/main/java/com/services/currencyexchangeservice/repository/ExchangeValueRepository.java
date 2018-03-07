package com.services.currencyexchangeservice.repository;

import com.services.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeValueRepository extends CrudRepository<ExchangeValue, Long> {


    ExchangeValue findByFromAndTo(String from, String to);


}
