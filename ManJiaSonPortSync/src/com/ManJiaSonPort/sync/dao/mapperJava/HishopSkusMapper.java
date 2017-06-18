package com.ManJiaSonPort.sync.dao.mapperJava;

import com.ManJiaSonPort.sync.dto.HishopSkus;
import com.ManJiaSonPort.sync.dto.HishopSkusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HishopSkusMapper {
    long countByExample(HishopSkusExample example);

    int deleteByExample(HishopSkusExample example);

    int deleteByPrimaryKey(String skuid);

    int insert(HishopSkus record);

    int insertSelective(HishopSkus record);

    List<HishopSkus> selectByExample(HishopSkusExample example);

    HishopSkus selectByPrimaryKey(String skuid);

    int updateByExampleSelective(@Param("record") HishopSkus record, @Param("example") HishopSkusExample example);

    int updateByExample(@Param("record") HishopSkus record, @Param("example") HishopSkusExample example);

    int updateByPrimaryKeySelective(HishopSkus record);

    int updateByPrimaryKey(HishopSkus record);

    int countThisGuid(@Param("guid") String guid);
}