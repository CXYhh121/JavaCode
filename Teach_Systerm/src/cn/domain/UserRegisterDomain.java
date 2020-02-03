package cn.domain;

public class UserRegisterDomain {

    private int id;
    private String userName;
    private String password;
    private String mobile;
    private String email;

    public UserRegisterDomain() {
        super();

    }

    public UserRegisterDomain(int id, String userName, String password, String mobile, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRegisterDomain [id=" + id + ", userName=" + userName + ", password=" + password + ", mobile="
                  + mobile + ", email=" + email + "]";
    }

}
