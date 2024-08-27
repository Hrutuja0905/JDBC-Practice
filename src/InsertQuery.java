import java.sql.*;

public class InsertQuery {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Company";
        String username = "root";
        String password = "Hruta0905";
        String query = "insert into employee(id,name,job_title,salary) values(5,'Gokul','Devops engineer',95000);";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded sccessfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection establish successfully");

            Statement stmt= connection.createStatement();
           int rows = stmt.executeUpdate(query);
           if(rows>0){
               System.out.println("Data insert successfully "+rows + " rows affected");
           }else {
               System.out.println("failes");
           }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
