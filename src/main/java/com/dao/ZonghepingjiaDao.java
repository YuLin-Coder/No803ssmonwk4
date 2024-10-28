package com.dao;

import com.entity.ZonghepingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghepingjiaVO;
import com.entity.view.ZonghepingjiaView;


/**
 * 综合评价
 * 
 * @author 
 * @email 
 * @date 2021-03-19 17:53:23
 */
public interface ZonghepingjiaDao extends BaseMapper<ZonghepingjiaEntity> {
	
	List<ZonghepingjiaVO> selectListVO(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
	
	ZonghepingjiaVO selectVO(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
	
	List<ZonghepingjiaView> selectListView(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);

	List<ZonghepingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
	
	ZonghepingjiaView selectView(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
	
}
