package com.travelsky.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.travelsky.ssm.mapper.ItemsMapper;
import com.travelsky.ssm.mapper.ItemsMapperCustom;
import com.travelsky.ssm.po.Items;
import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.po.ItemsQueryVo;

public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Autowired
	private ItemsMapper itemsMapper;

	// 商品列表查询
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {

		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	// 根据id查询商品信息
	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		Items items = itemsMapper.selectByPrimaryKey(id);

		// 中间对商品信息进行业务处理
		// ......
		// 返回ItemsCustom
		ItemsCustom itemsCustom = null;
		if (items != null) {
			itemsCustom = new ItemsCustom();
			BeanUtils.copyProperties(items, itemsCustom);
		}

		return itemsCustom;
	}

	// 修改商品信息
	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom)
			throws Exception {
		// 添加业务校验，通常在service接口对关键参数进行校验
		// 校验id是否为空，如果为空抛出异常
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);

	}

}
