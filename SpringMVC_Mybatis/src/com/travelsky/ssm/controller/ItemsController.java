package com.travelsky.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.service.impl.ItemsService;

/** 商品列表查询
 * @author huangyu
 *
 */
@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
		@RequestMapping("/queryItems.action")
		public ModelAndView queryItems() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			//调用service层
			List<ItemsCustom> itemsList = itemsService.findItemsLikeName(null);
			modelAndView.addObject("itemsList", itemsList);
			modelAndView.setViewName("items/itemsList");
			return modelAndView;
			
		}
}
