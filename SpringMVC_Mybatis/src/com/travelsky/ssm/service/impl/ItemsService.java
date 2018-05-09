package com.travelsky.ssm.service.impl;

import java.util.List;

import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.po.ItemsQueryVo;

public interface ItemsService {
//商品列表查询
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	//根据id查询商品信息
	public ItemsCustom findItemsById(Integer id) throws Exception;
	
	//修改商品信息
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;
}
