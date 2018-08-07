package com.hand.ajax.test;



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.ajax.mapper.TodoMapper;
import com.hand.ajax.pojo.ItemsDTO;

@Controller
@RequestMapping(value="/test")
public class test {
	
	@Autowired
	private TodoMapper todoMapper;
	private Log log = LogFactory.getLog(test.class);
	
	@RequestMapping(value="/jdbc")
	public void testJdbc() {
		log.info("into");
		List<ItemsDTO> listString =todoMapper.findByInpute("re");
		log.info(listString.size());	
	}

}
