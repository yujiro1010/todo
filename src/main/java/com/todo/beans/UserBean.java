package com.todo.beans;

import java.sql.Date;

import org.springframework.security.core.userdetails.UserDetails;





public class UserBean implements UserDetails {
    private int id;
    private String user_name;
    private String password;
    private int delete_flg;
    private Date created_at;
    private Date updated_at;
    private int company_id;
//    private List<String> roles;
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roles.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
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
    public void setDelete_Flg(int delete_flg) {
        this.delete_flg = delete_flg;
    }
    public int getDelete_Flg() {
        return delete_flg;
    }
    public void setCreated_At(Date created_at) {
        this.created_at = created_at;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public void setUpdated_At(Date updated_at) {
        this.updated_at = updated_at;
    }
    public Date getUpdated_At() {
        return updated_at;
    }
    public void setCompany_Id(int company_id) {
        this.company_id = company_id;
    }
    public int getCompany_Id() {
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