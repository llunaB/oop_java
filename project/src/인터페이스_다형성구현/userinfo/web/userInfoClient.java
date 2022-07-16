package 인터페이스_다형성구현.userinfo.web;

import 인터페이스_다형성구현.domain.userinfo.UserInfo;
import 인터페이스_다형성구현.domain.userinfo.dao.UserInfoDao;
import 인터페이스_다형성구현.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import 인터페이스_다형성구현.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class userInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream files = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(files);

        String dbType = prop.getProperty("DBTYPE"); // key-value

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("@123!");
        userInfo.setUserName("이순신");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {

            userInfoDao = new UserInfoOracleDao();
        }

        else if(dbType.equals("MYSQL")) {

            userInfoDao = new UserInfoMysqlDao();
        }
        else {
            System.out.println("DB ERROR");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
