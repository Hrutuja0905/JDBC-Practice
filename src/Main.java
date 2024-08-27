import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url= "jdbc:mysql://localhost:3306/Students";

        String username ="root";
        String password ="Hruta0905";

        try(Connection connection = DriverManager.getConnection(url,username,password)) {
            System.out.println("Conected to database");
            System.out.println(connection);
        } catch (SQLException e) {
          System.out.println("Connection files"+e.getMessage());
        }
    }
    }
