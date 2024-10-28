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


import com.dao.ZonghepingjiaDao;
import com.entity.ZonghepingjiaEntity;
import com.service.ZonghepingjiaService;
import com.entity.vo.ZonghepingjiaVO;
import com.entity.view.ZonghepingjiaView;

@Service("zonghepingjiaService")
public class ZonghepingjiaServiceImpl extends ServiceImpl<ZonghepingjiaDao, ZonghepingjiaEntity> implements ZonghepingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghepingjiaEntity> page = this.selectPage(
                new Query<ZonghepingjiaEntity>(params).getPage(),
                new EntityWrapper<ZonghepingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghepingjiaEntity> wrapper) {
		  Page<ZonghepingjiaView> page =new Query<ZonghepingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghepingjiaVO> selectListVO(Wrapper<ZonghepingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghepingjiaVO selectVO(Wrapper<ZonghepingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghepingjiaView> selectListView(Wrapper<ZonghepingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghepingjiaView selectView(Wrapper<ZonghepingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
