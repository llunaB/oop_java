package pkg1;

public class UserInfo {

    String userId;
    String userPassword;
    String userName;
    String address;
    int phoneNumber;

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
