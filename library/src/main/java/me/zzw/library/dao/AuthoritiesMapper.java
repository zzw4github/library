package me.zzw.library.dao;

import org.apache.ibatis.annotations.Mapper;

import me.zzw.library.pojo.Authorities;
@Mapper
public interface AuthoritiesMapper {
    int insert(Authorities record);

    int insertSelective(Authorities record);
}