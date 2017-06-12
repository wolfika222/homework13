import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Hp_Workplace on 2017. 06. 12..
 */
public class DbUtil {

    public static Connection getConnection(){

        Connection connection = null;
        Properties p = getProperties();
        try {
            Class.forName(p.getProperty("DB_DRIVER_NAME"));
            connection = DriverManager.getConnection(p.getProperty("DB_URL"),p.getProperty("DB_USER"),p.getProperty("DB_PASSWORD"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }

    public static Properties getProperties(){
        Properties p = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework13\\src\\main\\resources\\properties");
            p.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }
}
