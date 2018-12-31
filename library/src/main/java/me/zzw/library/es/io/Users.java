package me.zzw.library.es.io;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "company",type = "employee", shards = 1,replicas = 0, refreshInterval = "-1")
public class Users {
	@Id
	private String id;
	@Field(type =FieldType.Text)
	private String username;	
	@Field(type =FieldType.Text)
	private String password;
	@Field(type =FieldType.Boolean)
	private Boolean enabled;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
