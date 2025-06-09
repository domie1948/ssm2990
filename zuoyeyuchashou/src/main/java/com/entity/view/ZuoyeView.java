package com.entity.view;

import com.entity.ZuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 作业
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-22
 */
@TableName("zuoye")
public class ZuoyeView extends ZuoyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 作业类型的值
		*/
		private String zuoyeValue;



		//级联表 laoshi
			/**
			* 老师姓名
			*/
			private String laoshiName;
			/**
			* 老师手机号
			*/
			private String laoshiPhone;
			/**
			* 老师身份证号
			*/
			private String laoshiIdNumber;
			/**
			* 老师头像
			*/
			private String laoshiPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 学院专业类型
			*/
			private Integer xueyuanzhuanyeTypes;
				/**
				* 学院专业类型的值
				*/
				private String xueyuanzhuanyeValue;

	public ZuoyeView() {

	}

	public ZuoyeView(ZuoyeEntity zuoyeEntity) {
		try {
			BeanUtils.copyProperties(this, zuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 作业类型的值
			*/
			public String getZuoyeValue() {
				return zuoyeValue;
			}
			/**
			* 设置： 作业类型的值
			*/
			public void setZuoyeValue(String zuoyeValue) {
				this.zuoyeValue = zuoyeValue;
			}






				//级联表的get和set laoshi
					/**
					* 获取： 老师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 老师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 老师手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 老师手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 老师身份证号
					*/
					public String getLaoshiIdNumber() {
						return laoshiIdNumber;
					}
					/**
					* 设置： 老师身份证号
					*/
					public void setLaoshiIdNumber(String laoshiIdNumber) {
						this.laoshiIdNumber = laoshiIdNumber;
					}
					/**
					* 获取： 老师头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 老师头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 学院专业类型
					*/
					public Integer getXueyuanzhuanyeTypes() {
						return xueyuanzhuanyeTypes;
					}
					/**
					* 设置： 学院专业类型
					*/
					public void setXueyuanzhuanyeTypes(Integer xueyuanzhuanyeTypes) {
						this.xueyuanzhuanyeTypes = xueyuanzhuanyeTypes;
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
