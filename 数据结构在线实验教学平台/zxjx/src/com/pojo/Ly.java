package com.pojo;

public class Ly {
    private Integer id;

    private String nr;

    private String member;

    private String sj;

    private String hf;

    private String hfr;

    private String hfsj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr == null ? null : nr.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }

    public String getHf() {
        return hf;
    }

    public void setHf(String hf) {
        this.hf = hf == null ? null : hf.trim();
    }

    public String getHfr() {
        return hfr;
    }

    public void setHfr(String hfr) {
        this.hfr = hfr == null ? null : hfr.trim();
    }

    public String getHfsj() {
        return hfsj;
    }

    public void setHfsj(String hfsj) {
        this.hfsj = hfsj == null ? null : hfsj.trim();
    }
}