package com.daicham.catlog.infrastructure;

import com.daicham.catlog.domain.model.log.Log;
import com.daicham.catlog.domain.model.log.LogId;
import com.daicham.catlog.domain.model.log.Logs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author daicham
 */
@Mapper
public interface LogMapper {
    Log findBy(@Param("id") LogId id);

    List<Log> findRecent();

    void register(@Param("log") Log log);

    void update(@Param("log") Log log);

    void delete(@Param("id") LogId id);
}
