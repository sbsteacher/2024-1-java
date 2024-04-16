package com.green.day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// 싱글톤 SingleTon
public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        //jdbc:mariadb://localhost:3306/market_db
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료!");
        return conn;
    }

    //instance 메소드, void, 메소드명: close, 파라미터는 1개, 1개 타입은? Connection 객체 주소값
    public void close(Connection conn) {
        if(conn == null) { return; }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Statement stat, Connection conn) {
        if(stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }
}

class MyConnectionTest {
    public static void main(String[] args) {
        MyConnection myConn = new MyConnection();
        try(Connection conn = myConn.getConn()) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}