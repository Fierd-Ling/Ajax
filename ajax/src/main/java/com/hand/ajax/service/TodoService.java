package com.hand.ajax.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hand.ajax.pojo.ItemsDTO;

/** 

    * @ClassName: TodoService 

    * @Description: todo 表service

    * @author ZhongLingYun

    * @date 2018年8月7日 下午6:46:46 
 
*/
@Service
public interface TodoService {
	
	    /** 
	
	    * @Title: findByInpute 
	
	    * @Description:模糊查找标题返回一个list
	
	    * @param @param str
	    * @param @return   
	
	    * @return List<ItemsDTO>      
	
		* @author ZhongLingYun
	
	    */
	List<ItemsDTO> findByInpute(String str);

}
