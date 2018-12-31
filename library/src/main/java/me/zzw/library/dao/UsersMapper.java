package me.zzw.library.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import me.zzw.library.pojo.Users;

@Mapper
@CacheConfig(cacheNames = "users")
public interface UsersMapper {
	
	@CacheEvict(key = "#p0", allEntries = true)
    int deleteByPrimaryKey(String username);
    
    
    int insert(Users record);

    int insertSelective(Users record);
    
    @Cacheable(key = "#p0")
    Users selectByPrimaryKey(String username);
    

    int updateByPrimaryKeySelective(Users record);
    

    int updateByPrimaryKey(Users record);
    

}