package com.yinhe.mapper;

import com.yinhe.entities.ItemDescBak;
import com.yinhe.entities.ItemDescBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemDescBakMapper {
    long countByExample(ItemDescBakExample example);

    int deleteByExample(ItemDescBakExample example);

    int insert(ItemDescBak record);

    int insertSelective(ItemDescBak record);

    List<ItemDescBak> selectByExampleWithBLOBs(ItemDescBakExample example);

    List<ItemDescBak> selectByExample(ItemDescBakExample example);

    int updateByExampleSelective(@Param("record") ItemDescBak record, @Param("example") ItemDescBakExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemDescBak record, @Param("example") ItemDescBakExample example);

    int updateByExample(@Param("record") ItemDescBak record, @Param("example") ItemDescBakExample example);
}