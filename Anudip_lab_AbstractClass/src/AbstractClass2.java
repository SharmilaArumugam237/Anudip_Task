interface Database {
    void connect();
}
class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}

class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle Database");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database oracle = new OracleDatabase();

        mysql.connect();
        oracle.connect();
    }
}

