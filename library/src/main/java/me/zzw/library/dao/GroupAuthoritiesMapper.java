package me.zzw.library.dao;

import org.apache.ibatis.annotations.Mapper;

import me.zzw.library.pojo.GroupAuthorities;
@Mapper
public interface GroupAuthoritiesMapper {
    int insert(GroupAuthorities record);

    int insertSelective(GroupAuthorities record);
}