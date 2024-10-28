package com.entity.model;

import com.entity.ZonghepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 综合评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 17:53:23
 */
public class ZonghepingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 课程次数
	 */
	
	private Integer kechengcishu;
		
	/**
	 * 综合评分
	 */
	
	private Integer zonghepingfen;
		
	/**
	 * 总体评价
	 */
	
	private String zongtipingjia;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：课程次数
	 */
	 
	public void setKechengcishu(Integer kechengcishu) {
		this.kechengcishu = kechengcishu;
	}
	
	/**
	 * 获取：课程次数
	 */
	public Integer getKechengcishu() {
		return kechengcishu;
	}
				
	
	/**
	 * 设置：综合评分
	 */
	 
	public void setZonghepingfen(Integer zonghepingfen) {
		this.zonghepingfen = zonghepingfen;
	}
	
	/**
	 * 获取：综合评分
	 */
	public Integer getZonghepingfen() {
		return zonghepingfen;
	}
				
	
	/**
	 * 设置：总体评价
	 */
	 
	public void setZongtipingjia(String zongtipingjia) {
		this.zongtipingjia = zongtipingjia;
	}
	
	/**
	 * 获取：总体评价
	 */
	public String getZongtipingjia() {
		return zongtipingjia;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
