package nao.cycledev.ocpjavase7.c10.jdbc;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class TestCon {

    public void testMySQLCon(){

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pw = "";

        try(Connection con = DriverManager.getConnection(url + "addressbook", user, pw);
            Statement sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet results = sql.executeQuery("SELECT * FROM contacts")) {
            System.out.println("Connection: Successful");


            System.out.println("Id \tFirstName \t\tLastName");
            while(results.next()){

                //results.deleteRow();
                System.out.println(results.getInt("id") + "\t" +
                                   results.getString("firstname") + "\t" +
                                   results.getString("lastname"));

            }

        } catch (SQLException e) {
            System.out.printf("Connection: Failed");
            e.printStackTrace();
        }
    }


    public void getDBInfo(){
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pw = "";

        try {
            try(Connection con = DriverManager.getConnection(url+"addressbook", user, pw)){

                DatabaseMetaData info = con.getMetaData();

                System.out.println("DB url: " + info.getURL());
                System.out.println("DB name: " + info.getDatabaseProductName()+ " " + info.getDatabaseProductVersion());
                System.out.println("DB driver name: " + info.getDriverName() + " " + info.getDriverVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void transactionTest(){
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pw = "";

        try {
            try(Connection con = DriverManager.getConnection(url+"addressbook", user, pw);
                Statement sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet results = sql.executeQuery("Select * From contacts")){

                con.setAutoCommit(false);
                results.moveToInsertRow();
                results.updateString("firstname", "Nazar");
                results.updateString("lastname", "Oprysk");
                results.insertRow();

                con.commit();

                System.out.println("Id \tFirstName \t\tLastName");
                while(results.next()){

                    //results.deleteRow();
                    System.out.println(results.getInt("id") + "\t" +
                            results.getString("firstname") + "\t" +
                            results.getString("lastname"));

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        };



    }

    public void rowSetTest(){

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pw = "";
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = factory.createJdbcRowSet();
            rowSet.setUrl(url + "AddressBook");
            rowSet.setUsername(user);
            rowSet.setPassword(pw);
            rowSet.setCommand("Select * From contacts");
            rowSet.execute();

            System.out.println("Id \tFirstName \t\tLastName");
            while(rowSet.next()){

                //results.deleteRow();
                System.out.println(rowSet.getInt("id") + "\t" +
                        rowSet.getString("firstname") + "\t" +
                        rowSet.getString("lastname"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
