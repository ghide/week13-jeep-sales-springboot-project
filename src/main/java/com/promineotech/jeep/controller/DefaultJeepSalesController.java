package com.promineotech.jeep.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;
//import lombok.extern.slf4j.Slf4j;

@RestController
//@Slf4j
public class DefaultJeepSalesController implements JeepSalesController {
	Logger log = LoggerFactory.getLogger(getClass());  

  @Autowired JeepSalesService jeepSalesService;

  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.debug("model={}, trim={}", model, trim);
    return jeepSalesService.fetchJeep(model, trim);
  }

}
