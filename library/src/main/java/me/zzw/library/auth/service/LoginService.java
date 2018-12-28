package me.zzw.library.auth.service;

import java.util.Optional;

import me.zzw.library.auth.dto.Login;

public interface LoginService {

	Optional<Login> findByUsername(String username);

}
