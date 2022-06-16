package pkg1;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("asdf");
        userInfo.setUserPassword("1234");

        String userId = userInfo.getUserId();
        System.out.println(userId);
    }
}
