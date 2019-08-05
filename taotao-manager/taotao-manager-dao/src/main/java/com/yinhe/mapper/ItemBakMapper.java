package com.yinhe.mapper;

import com.yinhe.entities.ItemBak;
import com.yinhe.entities.ItemBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemBakMapper {
    long countByExample(ItemBakExample example);

    int deleteByExample(ItemBakExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemBak record);

    int insertSelective(ItemBak record);

    List<ItemBak> selectByExample(ItemBakExample example);

    ItemBak selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemBak record, @Param("example") ItemBakExample example);

    int updateByExample(@Param("record") ItemBak record, @Param("example") ItemBakExample example);

    int updateByPrimaryKeySelective(ItemBak record);

    int updateByPrimaryKey(ItemBak record);
}