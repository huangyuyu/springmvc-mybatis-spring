package com.travelsky.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.travelsky.ssm.mapper.ItemsMapperCustom;
import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.po.ItemsQueryVo;

public class ItemsServiceImpl implements ItemsService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	//��Ʒ�б��ѯ
	@Override
	public List<ItemsCustom> findItemsLikeName(ItemsQueryVo itemsQueryVo)
			throws Exception {
		
		return itemsMapperCustom.findItemsLikeName(itemsQueryVo);
	}

	
	

}
