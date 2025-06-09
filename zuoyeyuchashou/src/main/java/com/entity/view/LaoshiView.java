package com.entity.view;

import com.entity.LaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 老师
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-22
 */
@TableName("laoshi")
public class LaoshiView extends LaoshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 学院专业类型的值
		*/
		private String xueyuanzhuanyeValue;



	public LaoshiView() {

	}

	public LaoshiView(LaoshiEntity laoshiEntity) {
		try {
			BeanUtils.copyProperties(this, laoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 学院专业类型的值
			*/
			public String getXueyuanzhuanyeValue() {
				return xueyuanzhuanyeValue;
			}
			/**
			* 设置： 学院专业类型的值
			*/
			public void setXueyuanzhuanyeValue(String xueyuanzhuanyeValue) {
				this.xueyuanzhuanyeValue = xueyuanzhuanyeValue;
			}










}
