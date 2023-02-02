package connector;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("which column you want to update :name/age/addr/course");
        String sc=  scn.next();
        System.out.println("Give its value");
         String st=scn.next();
       System.out.println("Give ur id");
      int id=   scn.nextInt();

          

      String url = "jdbc:mysql://localhost:3306/hr";
      String usern= "root";
      String pas = "1234";
      try{
          Connection conect = DriverManager.getConnection(url,usern,pas);
          System.out.println("sucess");
          String qr= "update  student set  "+sc+" = '"+st+"' where id = '"+id+"' ";
          Statement stm = conect.createStatement();
           int ab =stm.executeUpdate(qr);
          System.out.println(ab + "record added");
          
  }catch(SQLException e){
      System.out.println(e.getMessage());
  }

    }
}
