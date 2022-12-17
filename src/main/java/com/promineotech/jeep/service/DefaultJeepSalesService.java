package com.promineotech.jeep.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

//import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j

public class DefaultJeepSalesService implements JeepSalesService {
	
	Logger log = LoggerFactory.getLogger(getClass());  


	public List<Jeep> fetchJeep(JeepModel model, String trim) {
		
		
		log.info("These fetchJeeps Method was called with model={} and trim={}",
		        model,trim); 
		
		return null;
	}

}
