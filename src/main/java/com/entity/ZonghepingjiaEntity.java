package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 综合评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 17:53:23
 */
@TableName("zonghepingjia")
public class ZonghepingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghepingjiaEntity() {
		
	}
	
	public ZonghepingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
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
