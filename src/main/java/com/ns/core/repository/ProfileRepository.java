package com.ns.core.repository;

import com.ns.core.model.UserProfile;

import java.util.Map;

public interface ProfileRepository {
    void save(UserProfile user);
    Map<String,UserProfile> findAll();
    UserProfile fidById(String id);
    void Update(UserProfile user);
    void delete(String id);
}
