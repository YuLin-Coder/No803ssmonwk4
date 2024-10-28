package com.dao;

import com.entity.YoukeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoukeVO;
import com.entity.view.YoukeView;


/**
 * 游客
 * 
 * @author 
 * @email 
 * @date 2021-03-19 17:53:22
 */
public interface YoukeDao extends BaseMapper<YoukeEntity> {
	
	List<YoukeVO> selectListVO(@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	YoukeVO selectVO(@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	List<YoukeView> selectListView(@Param("ew") Wrapper<YoukeEntity> wrapper);

	List<YoukeView> selectListView(Pagination page,@Param("ew") Wrapper<YoukeEntity> wrapper);
	
	YoukeView selectView(@Param("ew") Wrapper<YoukeEntity> wrapper);
	
}
