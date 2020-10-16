package com.ns.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserProfile extends Object implements Serializable {
   private String  token;
   private List<Authority> authorities;
   private UserDetails userDetails;
   private Date lastActivity;
   private boolean isLogin;

    public UserProfile(String token, List<Authority> authorities, UserDetails userDetails, Date lastActivity, boolean isLogin) {
        this.token = token;
        this.authorities = authorities;
        this.userDetails = userDetails;
        this.lastActivity = lastActivity;
        this.isLogin = isLogin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Date getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
