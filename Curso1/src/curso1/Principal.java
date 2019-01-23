
package curso1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {
    
    private Connection con;
    private Statement stmt;
    
    public Principal(){
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        String url ="jdbc:mysql://127.0.0.1:3306/curso?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";

        try{
        con = DriverManager.getConnection(url,user,password);
        stmt = con.createStatement();
        
        }catch(SQLException e){
            System.out.println("Error:"+e.getMessage());
        }
        
        insertRecord();
    }
    public void insertRecord(){
        try{
        stmt.executeUpdate("INSERT INTO disciplina VALUES(6,'Sistema do GOOGLE')");
        }catch(SQLException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new Principal();
    }
}
