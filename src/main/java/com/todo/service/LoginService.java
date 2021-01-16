package com.todo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.todo.bean.LoginBean;

/**
 * ・社員情報検索サービス
 */

public class LoginService {

  // 問① 接続情報を記述してください
 /** ドライバーのクラス名 */
 private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
 /** ・JDMC接続先情報 */
 private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/Tasknantoka";
 /** ・ユーザー名 */
 private static final String USER = "";
 /** ・パスワード */
 private static final String PASS = "";


 LoginBean loginDate = null;

  // 送信されたIDとPassWordを元に社員情報を検索するためのメソッド
 public LoginBean search(String id, String password) {

 Connection connection = null;
 Statement statement = null;
 ResultSet resultSet = null;


 try {
  // データベースに接続
 Class.forName(POSTGRES_DRIVER);
 connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
 statement = connection.createStatement();

 // forName()で例外発生
 } catch (ClassNotFoundException e) {
 e.printStackTrace();

  // getConnection()、createStatement()、executeQuery()で例外発生
 } catch (SQLException e) {
 e.printStackTrace();

 } finally {
 try {

 if (resultSet != null) {
 resultSet.close();
 }
 if (statement != null) {
 statement.close();
 }
 if (connection != null) {
 connection.close();
 }

 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 return loginDate;
 }
}