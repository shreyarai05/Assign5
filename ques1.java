
    package connector;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class ques1 {
    
    public static void main(String[] args) {
        int ct =0;Scanner scn = new Scanner(System.in);
        do{
        //  System.out.println("Give unique id");int iid=scn.nextInt();
          System.out.println("Give your name");
             String name =scn.next();
          System.out.println("give ur age"); int age =scn.nextInt(); 
          System.out.println("Provide address"); String addr=scn.next();
          System.out.println("course id choose out of : 3000,3001,3002,3003,3004 ");int cor =scn.nextInt();
          //   System.out.println(" course id")
          
          // System.out.println("Do you want to add more ? (1/0)");



        String url = "jdbc:mysql://localhost:3306/hr";
        String usern= "root";
        String pas = "1234";
        try{
            Connection conect = DriverManager.getConnection(url,usern,pas);
            System.out.println("sucess");
            String qr="insert into student(name,age,addr,course) values('"+name+"',' " +age+ "',' " +addr+"',' " +cor+"')";
            Statement stm = conect.createStatement();
             int ab =stm.executeUpdate(qr);
            System.out.println(ab + "record added");
            
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    ct++;
    System.out.println("Do you want to add more ? (1/0)");

    
      }while((scn.nextInt()==1) &&  ct <6);
}
}


