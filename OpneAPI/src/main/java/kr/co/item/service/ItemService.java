package kr.co.item.service;

import java.util.List;

import kr.co.item.domain.Item;

public interface ItemService {
	// 전체 Data를 가져오는 Method
	public List<Item> allItem();
	// itemid를 이용하여 Data 1개를 가져오는 Method
	public Item getItem(int itemid);
}
