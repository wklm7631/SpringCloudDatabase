package com.example.demo.cms.information;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.example.demo.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_PLATFORM_INFORMATION")
@lombok.Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class InformationEntity extends UUID implements Serializable{
	private static final long serialVersionUID = 1L;
	

	/** 资讯状态-下架  */
	public static final String INFORMATION_status_off = "off";
	/** 资讯状态-发布  */
	public static final String INFORMATION_status_published = "published";
	/** 资讯状态-待发布  */
	public static final String INFORMATION_status_publishing = "publishing";
	/** 资讯状态-待审核  */
	public static final String INFORMATION_status_pending= "pending";
	/** 资讯状态-已驳回  */
	public static final String INFORMATION_status_refused = "reject";
	
	/** 审批结果状态-通过  */
	public static final String INFORMATION_reviewStatus_pass = "pass"; 
	/** 审批结果状态-驳回  */
	public static final String INFORMATION_reviewStatus_refused = "refused";
	/**咨询状态-已经推送*/
	public static final String INFORMATION_isPush_yes = "yes";
	/**咨询状态-未推送*/
	public static final String INFORMATION_isPush_no = "no";

	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 类型
	 */
	private String type;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 状态
	 */
	private String isPush="no";
	
	/**
	 * 摘要
	 */
	private String summary;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 缩略图
	 */
	private String thumbnailUrl;
	
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 发布者
	 */
	private String publisher;
	/**
	 * 发布时间
	 */
	private Timestamp publishTime;
	/**
	 * 编辑者
	 */
	private String editor;
	/**
	 * 编辑时间
	 */
	private Timestamp editTime;
	/**
	 * 审核者
	 */
	private String review;
	/**
	 * 审核时间
	 */
	private Timestamp reviewTime;
	/**
	 * 文章来源
	 */
	private String origin;
	
	private String reviewRemark;
	/**
	 * 文章链接
	 */
	private String url;
	/**
	 * 是否推荐2：否认 1： 是
	 */
	private Integer isHome;
	/**
	 * 图片大小
	 */
	private String imgSize;
	/**
	 * urlMD5加密串
	 */
	private String urlMd5Str;
	/**
	 * 标签
	 */
	private String tags;

}
