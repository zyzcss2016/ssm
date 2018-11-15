package cn.zyz.service.impl;

import cn.zyz.dao.ItemsDao;
import cn.zyz.domain.Items;
import cn.zyz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
