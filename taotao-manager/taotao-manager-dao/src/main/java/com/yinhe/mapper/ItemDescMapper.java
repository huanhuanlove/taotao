package com.yinhe.mapper;

import com.yinhe.entities.ItemDesc;
import com.yinhe.entities.ItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemDescMapper {
    long countByExample(ItemDescExample example);

    int deleteByExample(ItemDescExample example);

    int insert(ItemDesc record);

    int insertSelective(ItemDesc record);

    List<ItemDesc> selectByExampleWithBLOBs(ItemDescExample example);

    List<ItemDesc> selectByExample(ItemDescExample example);

    int updateByExampleSelective(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    int updateByExample(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);
}