package com.wewtapi.mapper;

import com.wewtapi.model.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {

    List<Stu> stu_list();

}
