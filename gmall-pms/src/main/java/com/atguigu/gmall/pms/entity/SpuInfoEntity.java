package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-09-20 15:35:53
 */
@ApiModel
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "商品id")
	private Long id;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "spuName",value = "商品名称")
	private String spuName;
	/**
	 * 商品描述
	 */
	@ApiModelProperty(name = "spuDescription",value = "商品描述")
	private String spuDescription;
	/**
	 * 所属分类id
	 */
	@ApiModelProperty(name = "catalogId",value = "所属分类id")
	private Long catalogId;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "brandId",value = "品牌id")
	private Long brandId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "weight",value = "")
	private BigDecimal weight;
	/**
	 * 上架状态[0 - 下架，1 - 上架]
	 */
	@ApiModelProperty(name = "publishStatus",value = "上架状态[0 - 下架，1 - 上架]")
	private Integer publishStatus;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@ApiModelProperty(name = "updateTime",value = "更新时间")
	private Date updateTime;

}
