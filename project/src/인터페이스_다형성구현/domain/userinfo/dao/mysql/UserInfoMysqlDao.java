package 인터페이스_다형성구현.domain.userinfo.dao.mysql;

import 인터페이스_다형성구현.domain.userinfo.UserInfo;
import 인터페이스_다형성구현.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySQL DB userID = " + userInfo.getUserId());

    }
}
