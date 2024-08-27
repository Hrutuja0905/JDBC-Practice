import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Company";
        String username = "root";
        String password = "Hruta0905";
        String query = "update employee SET job_title = 'Full Stack Developer ', salary = 59000 where id=1";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Conection establish successflly");

            Statement stmt = connection.createStatement();
            int rows = stmt.executeUpdate(query);
            if(rows>0){
                System.out.println("Updated successfully "+rows+" row affected");
            }else {
                System.out.println("Failed to update");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
