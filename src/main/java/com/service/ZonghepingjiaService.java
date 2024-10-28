package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghepingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghepingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghepingjiaView;


/**
 * 综合评价
 *
 * @author 
 * @email 
 * @date 2021-03-19 17:53:23
 */
public interface ZonghepingjiaService extends IService<ZonghepingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghepingjiaVO> selectListVO(Wrapper<ZonghepingjiaEntity> wrapper);
   	
   	ZonghepingjiaVO selectVO(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
   	
   	List<ZonghepingjiaView> selectListView(Wrapper<ZonghepingjiaEntity> wrapper);
   	
   	ZonghepingjiaView selectView(@Param("ew") Wrapper<ZonghepingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghepingjiaEntity> wrapper);
   	
}

