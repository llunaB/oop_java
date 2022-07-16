# 인터페이스 interface 다형성 구현

## 인터페이스와 다형성

- 하나의 인터페이스를 여러 객체가 구현하면, 클라이언트 프로그램이 인터페이스를 활용하여 여러 객체의 구현을 사용할 수 있다.



## UserInfoDao 인터페이스를 정의하고

- oracleDao, mysqlDao, mysqlDao 클래스를 각각 구현

![dao](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-13/img/dao.png)



## dao 구현

- DBTYPE 에 따라서 다른 결과가 나온다.
- 각각 다른 Dao 인스턴스를 만들기 때문이다.

- ```java
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
  
  ```

  

![userinfo](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-13/img/userinfo.png)
