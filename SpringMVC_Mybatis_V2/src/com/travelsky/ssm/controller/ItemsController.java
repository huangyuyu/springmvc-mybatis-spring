package com.travelsky.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.travelsky.ssm.exception.CustomException;
import com.travelsky.ssm.po.ItemsCustom;
import com.travelsky.ssm.service.impl.ItemsService;

/** 
 * @author huangyu
 *
 */
@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
		/**商品列表查询
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryItems.action")
		public ModelAndView queryItems() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			//商品列表查询
			List<ItemsCustom> itemsList = itemsService.findItemsList(null);
			modelAndView.addObject("itemsList", itemsList);
			modelAndView.setViewName("items/itemsList");
			return modelAndView;
			
		}
	/**根据商品id查询商品信息
	 * @param model 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editItems.action")
	public String editItems(Model model,Integer id) throws Exception{
		//调用service根据商品id查询商品信息
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
		//根据id没有查询到商品，抛出异常，提示用户商品信息不存在
		if(itemsCustom == null){
			throw new CustomException("修改的商品信息不存在!");
		}
		//将查询的结果添加到request中
		model.addAttribute("itemsCustom", itemsCustom);
		return "items/editItems";
	}		
		
	
	/**根据商品id修改商品信息
	 * @param id
	 * @param itemsCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editItemsSubmit.action")
	public String editItemsSubmit(Model model,Integer id,@Validated ItemsCustom itemsCustom,BindingResult bindingResult) throws Exception{
		
		//判断是否存在错误信息
		if(bindingResult.hasErrors()){
			//获得错误信息
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError objectError : allErrors) {
				//打印错误信息
				System.out.println(objectError.getDefaultMessage());
			}
			//将错误信息保存到request中
			model.addAttribute("allErrors", allErrors);
			//出错则校验没通过，重新回到商品信息修改页面
			return "items/editItems";
		}
		itemsService.updateItems(id, itemsCustom);
		//转发到查询列表页面
		return "redirect:queryItems.action";
	}
}
