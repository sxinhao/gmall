package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-09-20 15:35:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
