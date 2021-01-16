package com.todo.bean;

public class LoginBean {
    private String id;
    private String user_name;
    private String password;
    private String delete_flg;
    private String created_at;
    private String updated_at;
    private String company_id;

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

}