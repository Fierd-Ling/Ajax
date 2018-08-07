package com.hand.ajax.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.ajax.pojo.ItemsDTO;
import com.hand.ajax.service.TodoService;

/** 

    * @ClassName: TodoController 

    * @Description:todo 控制层

    * @author ZhongLingYun

    * @date 2018年8月7日 下午6:42:02 
 
*/
@Controller
@RequestMapping(value="/todo")
public class TodoController {
	
	private Log log = LogFactory.getLog(TodoController.class);
	
	@Autowired
	private TodoService todoService;
	
	    /** 
	
	    * @Title: select 
	
	    * @Description:异步加载查询符合条件的标题
	
	    * @param @param str 模糊匹配标题
	    * @param @return    返回查的对象
	
	    * @return List<ItemsDTO>      
	
		* @author ZhongLingYun
	
	    */
	@RequestMapping(value="/select", method=RequestMethod.POST)
	public @ResponseBody List<ItemsDTO> select(String str){
		if("".equals(str)||str==null) {
			return null;
		}
		List<ItemsDTO> list=todoService.findByInpute(str);
		log.info(list.size());
		return list;
		
		
	}

}
