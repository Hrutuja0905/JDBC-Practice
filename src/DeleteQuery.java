import java.sql.*;

public class DeleteQuery {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Company";
        String username = "root";
        String password = "Hruta0905";
        String query = "delete from employee where id=4";

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
                System.out.println("Data Deleted successfully ");
            }else {
                System.out.println("failes");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
