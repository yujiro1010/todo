package com.todo.beans;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;





public class UserBean implements UserDetails {
    private String id;
    private String user_name;
    private String password;
    private String delete_flg;
    private String created_at;
    private String updated_at;
    private String company_id;
    private List<String> roles;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setUser_Name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_Name() {
        return user_name;
    }
    public void setPassWord(String password) {
        this.password = password;
    }
    public String getPassWord() {
        return password;
    }
    public void setDelete_Flg(String delete_flg) {
        this.delete_flg = delete_flg;
    }
    public String getDelete_Flg() {
        return delete_flg;
    }
    public void setCreated_At(String created_at) {
        this.created_at = created_at;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setUpdated_At(String updated_at) {
        this.updated_at = updated_at;
    }
    public String getUpdated_At() {
        return updated_at;
    }
    public void setCompany_Id(String company_id) {
        this.company_id = company_id;
    }
    public String getCompany_Id() {
        return company_id;
    }



    @Override
    public String getPassword() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getUsername() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isEnabled() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

}