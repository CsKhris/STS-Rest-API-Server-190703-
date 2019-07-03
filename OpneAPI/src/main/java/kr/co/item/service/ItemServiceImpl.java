package kr.co.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.item.dao.ItemDao;
import kr.co.item.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;

	@Override
	public List<Item> allItem() {
		return itemDao.allitem();
	}

	@Override
	public Item getItem(int itemid) {
		return itemDao.getitem(itemid);
	}

}
