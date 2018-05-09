package com.travelsky.ssm.po;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description:鍟嗗搧鍖呰瀵硅薄 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2015-4-13涓嬪崍3:22:36
 * @version 1.0
 */
public class ItemsQueryVo {
	
	//鍟嗗搧淇℃伅
	private Items items;
	
	//涓轰簡绯荤粺 鍙墿灞曟�锛屽鍘熷鐢熸垚鐨刾o杩涜鎵╁睍
	private ItemsCustom itemsCustom;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	

}
