package com.bilgeadam.service;


import com.bilgeadam.repository.IAuthRepository;
import com.bilgeadam.repository.entity.Auth;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthService extends ServiceManager<Auth, Long> {
    private final IAuthRepository authRepository;
    public AuthService(JpaRepository<Auth, Long> repository, IAuthRepository authRepository) {
        super(repository);
        this.authRepository = authRepository;
    }


}
