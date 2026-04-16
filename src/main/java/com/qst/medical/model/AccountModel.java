package com.qst.medical.model;

import com.qst.medical.domain.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AccountModel extends Account implements UserDetails {

    private String urealName; //用户真实姓名
    private Collection<? extends GrantedAuthority> authorities; //认证集

    public AccountModel() {
    }

    public AccountModel(Long id, String uname, String urealName, String utype, String pwd, Collection<? extends GrantedAuthority> authorities) {
        this.setId(id);
        this.setUname(uname);
        this.urealName = urealName;
        this.setUtype(utype);
        this.setPwd(pwd);
        this.authorities = authorities;
    }

    public String getUrealName() {
        return urealName;
    }

    public void setUrealName(String urealName) {
        this.urealName = urealName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String getPassword() {
        return getPwd();
    }

    @Override
    public String getUsername() {
        return getUname();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
