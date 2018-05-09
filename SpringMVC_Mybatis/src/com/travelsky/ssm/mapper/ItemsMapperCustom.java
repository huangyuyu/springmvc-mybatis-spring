package com.travelsky.ssm.mapper;

import java.util.List;

import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.po.ItemsQueryVo;


public interface ItemsMapperCustom {
	public List<ItemsCustom> findItemsLikeName(ItemsQueryVo itemsQueryVo) throws Exception;
 }