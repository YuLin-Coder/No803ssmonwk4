package com.dao;

import com.entity.PingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiaxinxiVO;
import com.entity.view.PingjiaxinxiView;


/**
 * 评价信息
 * 
 * @author 
 * @email 
 * @date 2021-03-19 17:53:22
 */
public interface PingjiaxinxiDao extends BaseMapper<PingjiaxinxiEntity> {
	
	List<PingjiaxinxiVO> selectListVO(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	
	PingjiaxinxiVO selectVO(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	
	List<PingjiaxinxiView> selectListView(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);

	List<PingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	
	PingjiaxinxiView selectView(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	
}
