package me.zzw.library.dao;

import org.apache.ibatis.annotations.Mapper;

import me.zzw.library.pojo.Groups;
@Mapper
public interface GroupsMapper {
    int insert(Groups record);

    int insertSelective(Groups record);
}