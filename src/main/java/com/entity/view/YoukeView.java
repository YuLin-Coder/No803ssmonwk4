package com.entity.view;

import com.entity.YoukeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游客
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 17:53:22
 */
@TableName("youke")
public class YoukeView  extends YoukeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YoukeView(){
	}
 
 	public YoukeView(YoukeEntity youkeEntity){
 	try {
			BeanUtils.copyProperties(this, youkeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
