package com.haiyu.manager.dao;


import com.haiyu.manager.dto.AdminUserDTO;
import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.pojo.BaseAdminUser;
import com.haiyu.manager.pojo.DataQlsmdygx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;

import java.util.List;

@Repository
public interface DatQlsmdygxMapper extends MyMapper<DataQlsmdygx> {

    List<DataQlsmdygx> getDataList(String type);

}