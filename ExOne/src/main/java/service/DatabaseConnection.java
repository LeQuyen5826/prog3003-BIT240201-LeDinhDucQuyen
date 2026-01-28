

package service;


public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    
    private String databaseUrl = "jdbc:mysql://localhost:3306/mydb";
    private String username = "root";
    private String password = "123456";
    
    private DatabaseConnection() {
        System.out.println("Da khoi tao ket noi co so du lieu (Singleton instance created!)");
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Ket noi thanh cong den: " + databaseUrl);
        System.out.println("   User: " + username);
    }
    
    public void disconnect() {
        System.out.println("Da ngat ket noi co so du lieu.");
    }
    
    public String getDatabaseUrl() {
        return databaseUrl;
    }
}
