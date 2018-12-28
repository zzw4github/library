package me.zzw.library.dao;

import org.apache.ibatis.annotations.Mapper;

import me.zzw.library.pojo.GroupMembers;
@Mapper
public interface GroupMembersMapper {
    int insert(GroupMembers record);

    int insertSelective(GroupMembers record);
}