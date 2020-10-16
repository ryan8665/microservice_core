package com.ns.core.model;

import java.io.Serializable;

public class Authority implements Serializable {
    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
