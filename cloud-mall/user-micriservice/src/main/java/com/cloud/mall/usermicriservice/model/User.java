package com.cloud.mall.usermicriservice.model;


import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -2635974089869998486L;
    /**
     *
     * user.id
     */
    private String id;

    /**
     *
     * user.username
     */
    private String username;

    /**
     *
     * user.password
     */
    private String password;

    /**
     * 姓名
     * user.name
     */
    private String name;

    /**
     * 0:女
     * user.sex
     */
    private String sex;

    /**
     * 0:禁用
     * user.status
     */
    private String status;

    /**
     * 部门ID
     * user.orgid
     */
    private String orgid;

    /**
     *
     * user.email
     */
    private String email;

    /**
     * 身份证号
     * user.idcard
     */
    private String idcard;

    /**
     * 是否是管理员
     * user.is_admin
     */
    private String isAdmin;

    /**
     *
     * user.mobile
     */
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", status='" + status + '\'' +
                ", orgid='" + orgid + '\'' +
                ", email='" + email + '\'' +
                ", idcard='" + idcard + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
