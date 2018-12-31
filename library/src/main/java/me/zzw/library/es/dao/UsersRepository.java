package me.zzw.library.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import me.zzw.library.es.io.Users;

@Repository
public interface UsersRepository  extends ElasticsearchCrudRepository<Users, String>{
	Users queryUserById(String id);

}
