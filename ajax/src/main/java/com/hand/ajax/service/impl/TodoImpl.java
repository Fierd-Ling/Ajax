package com.hand.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.ajax.mapper.TodoMapper;
import com.hand.ajax.pojo.ItemsDTO;
import com.hand.ajax.service.TodoService;

@Service
public class TodoImpl implements TodoService {
	
	@Autowired
	private TodoMapper todoMapper;

	@Override
	public List<ItemsDTO> findByInpute(String str) {
		return todoMapper.findByInpute(str);
	}

}
