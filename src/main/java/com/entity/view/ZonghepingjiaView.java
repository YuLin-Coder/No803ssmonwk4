package com.entity.view;

import com.entity.ZonghepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 17:53:23
 */
@TableName("zonghepingjia")
public class ZonghepingjiaView  extends ZonghepingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghepingjiaView(){
	}
 
 	public ZonghepingjiaView(ZonghepingjiaEntity zonghepingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zonghepingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
