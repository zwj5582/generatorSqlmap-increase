package com.meliora.cpcms.dao;

import com.meliora.cpcms.model.CpcLog;
import com.meliora.cpcms.model.CpcLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpcLogDAO {
    int countByExample(CpcLogCriteria example);

    int deleteByExample(CpcLogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CpcLog record);

    int insertSelective(CpcLog record);

    List<CpcLog> selectByExample(CpcLogCriteria example);

    CpcLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CpcLog record, @Param("example") CpcLogCriteria example);

    int updateByExample(@Param("record") CpcLog record, @Param("example") CpcLogCriteria example);

    int updateByPrimaryKeySelective(CpcLog record);

    int updateByPrimaryKey(CpcLog record);
}