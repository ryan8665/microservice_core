package com.ns.core.repository;

import com.ns.core.model.UserProfile;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProfileRepositoryImpl implements ProfileRepository {
    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    public ProfileRepositoryImpl(RedisTemplate<String, Object> template) {
        this.redisTemplate =  template;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(UserProfile profile) {
        hashOperations.put("PROFILE",profile.getToken(),profile);
    }

    @Override
    public Map<String, UserProfile> findAll() {
        return hashOperations.entries("PROFILE");
    }

    @Override
    public UserProfile fidById(String id) {
        return (UserProfile) hashOperations.get("PROFILE",id);
    }

    @Override
    public void Update(UserProfile profile) {
        hashOperations.put("PROFILE",profile.getToken(),profile);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete("PROFILE",id);
    }
}
