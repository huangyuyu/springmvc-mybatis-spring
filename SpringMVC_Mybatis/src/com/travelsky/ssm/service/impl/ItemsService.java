package com.travelsky.ssm.service.impl;

import java.util.List;

import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.po.ItemsQueryVo;

public interface ItemsService {
//商品查询列表	
	public List<ItemsCustom> findItemsLikeName(ItemsQueryVo itemsQueryVo) throws Exception;
}
