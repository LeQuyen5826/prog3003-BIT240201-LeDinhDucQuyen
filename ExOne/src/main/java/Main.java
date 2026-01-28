import service.DatabaseConnection;
        
public class Main {
    public static void main(String[] args) {
        
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();
        
        System.out.println("db1 va db2 co cung instance? " + (db1 == db2));  // true
        System.out.println("URL ban dau: " + db1.getDatabaseUrl());
    }
}