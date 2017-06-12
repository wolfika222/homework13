import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Hp_Workplace on 2017. 06. 12..
 */
public class CreateTable {

    public static void tableCreator(String tableName, String firstColumnName, String firstColumnType, String secondColumnName, String secondColumnTye, String thirdColumnName, String thirdColumnType) {

        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE REGISTRATION" + tableName +
                    "(id INTEGER not NULL, " +
                    " " + firstColumnName + " " + firstColumnType + ", " +
                    " " + secondColumnName + " " + secondColumnTye + ", " +
                    " " + thirdColumnName + " " + thirdColumnType + ", " +
                    "PRIMARY KEY ( id ))";
            statement.executeUpdate(sql);

            connection.close();
            System.out.println("Created table in given database...");

        } catch (SQLException se) {
            se.printStackTrace();

        }
    }
}

