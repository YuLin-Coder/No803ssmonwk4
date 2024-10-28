package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YoukeDao;
import com.entity.YoukeEntity;
import com.service.YoukeService;
import com.entity.vo.YoukeVO;
import com.entity.view.YoukeView;

@Service("youkeService")
public class YoukeServiceImpl extends ServiceImpl<YoukeDao, YoukeEntity> implements YoukeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoukeEntity> page = this.selectPage(
                new Query<YoukeEntity>(params).getPage(),
                new EntityWrapper<YoukeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoukeEntity> wrapper) {
		  Page<YoukeView> page =new Query<YoukeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YoukeVO> selectListVO(Wrapper<YoukeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YoukeVO selectVO(Wrapper<YoukeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YoukeView> selectListView(Wrapper<YoukeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoukeView selectView(Wrapper<YoukeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
