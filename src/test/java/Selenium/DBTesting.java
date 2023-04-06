package Selenium;

import java.sql.*;

public class DBTesting {
    public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException, InstantiationException, SQLException {
        String DataBaseURL="jdbc:mysql://127.0.0.1:3306/NIT9PMFeb23?enabledTLSProtocols=TLSv1.2";
        //We are accessing a database example from MySQL database using the URL localhost:3036

        String userName="root"; //DB Username
        String password="";
        String query="select * from employee";
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //throws ClassNotFoundException
        Connection conn= DriverManager.getConnection(DataBaseURL,userName,password);
        Statement statement= conn.createStatement();
        ResultSet result=statement.executeQuery(query);
        while(result.next()){
            System.out.print(result.getInt(1)+"\t");
            System.out.print(result.getString(2)+"\t");
            System.out.print(result.getString(3)+"\t");
            System.out.print(result.getString(4)+"\t"+"\n");
            System.out.print(result.getString(5)+"\t");
            System.out.println(result.getInt(6)+"\t"+"\n");
            System.out.println(result.getDate(7)+"\t"+"\n");
//            result.getInt(0); //To get an Integer Value from DB using the Column Number
//            result.getBoolean(0); //To get a Boolean Value from DB using the Column Number
//            result.getByte(0); //To get a Byte Value from DB using the Column Number
//            result.getDate(0); //To get a Date from DB using the Column Number
//            result.getDouble(0); //To get a Double Value from DB using the Column Number
//            result.getString(0); //To get a String Value from DB using the Column Number
        }
    }
}
