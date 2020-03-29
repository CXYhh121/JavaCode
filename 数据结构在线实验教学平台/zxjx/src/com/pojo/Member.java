package com.pojo;

/**
 * 注册用户实体类
 */
public class Member {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String sex;

    private String sfz;

    private String tel;

    private String email;

    private String regtime;

    private String ifuse;

    private String hy;

    private String tx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz == null ? null : sfz.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public String getIfuse() {
        return ifuse;
    }

    public void setIfuse(String ifuse) {
        this.ifuse = ifuse == null ? null : ifuse.trim();
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy == null ? null : hy.trim();
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }
}