import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/Company";
        String username="root";
        String password="Hruta0905";
        String query = "select * from employee;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection establish successfully");

            Statement stmt = connection.createStatement();


            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()){

                int id=rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println("************");
                System.out.println("ID:"+id);
                System.out.println("Name:"+name);
                System.out.println("Job Title:"+job_title);
                System.out.println("Salary:"+salary);
            }

            rs.close();
            stmt.close();
            connection.close();

            System.out.println("Connection closed sucessfully");


        } catch (SQLException e) {
           System.out.println("SQL exception");
        }


    }
}
