package com.hand.ajax.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hand.ajax.pojo.ItemsDTO;

/** 

    * @ClassName: TodoMapper 

    * @Description:todo数据表操作接口

    * @author ZhongLingYun

    * @date 2018年8月7日 下午6:21:19 
 
*/
@Repository
public interface TodoMapper {
	 
	    /** 
	
	    * @Title: findByInpute 
	
	    * @Description:
	
	    * @param @param str 匹配数据
	    * @param @return   返回匹配的标题
	
	    * @return List<String>      
	
		* @author ZhongLingYun
	
	    */
	List<ItemsDTO> findByInpute(String str);

}
