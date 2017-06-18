package com.ManJiaSonPort.sync.dao.mapperJava;

import com.ManJiaSonPort.sync.dto.HishopProducts;
import com.ManJiaSonPort.sync.dto.HishopProductsExample;
import com.ManJiaSonPort.sync.dto.HishopProductsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HishopProductsMapper {
    long countByExample(HishopProductsExample example);

    int deleteByExample(HishopProductsExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(HishopProductsWithBLOBs record);

    int insertSelective(HishopProductsWithBLOBs record);

    List<HishopProductsWithBLOBs> selectByExampleWithBLOBs(HishopProductsExample example);

    List<HishopProducts> selectByExample(HishopProductsExample example);

    HishopProductsWithBLOBs selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") HishopProductsWithBLOBs record, @Param("example") HishopProductsExample example);

    int updateByExampleWithBLOBs(@Param("record") HishopProductsWithBLOBs record, @Param("example") HishopProductsExample example);

    int updateByExample(@Param("record") HishopProducts record, @Param("example") HishopProductsExample example);

    int updateByPrimaryKeySelective(HishopProductsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HishopProductsWithBLOBs record);

    int updateByPrimaryKey(HishopProducts record);

    int countThisGuid(@Param("guid") String guid);
}