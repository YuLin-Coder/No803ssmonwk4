package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YoukeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YoukeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YoukeView;


/**
 * 游客
 *
 * @author 
 * @email 
 * @date 2021-03-19 17:53:22
 */
public interface YoukeService extends IService<YoukeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoukeVO> selectListVO(Wrapper<YoukeEntity> wrapper);
   	
   	YoukeVO selectVO(@Param("ew") Wrapper<YoukeEntity> wrapper);
   	
   	List<YoukeView> selectListView(Wrapper<YoukeEntity> wrapper);
   	
   	YoukeView selectView(@Param("ew") Wrapper<YoukeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoukeEntity> wrapper);
   	
}

