package ik.ikman.oop.javafx01;
import javafx.event.ActionEvent;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HelloController {

    public TextField txtName;
    public TextField txtAddress;
    public TextField txtTel;
    public TextField txtAge;

    //Student [] studentDB = new Student[10];
    //int index=0;

    public void add(ActionEvent actionEvent){

        String name=txtName.getText();
        String address=txtAddress.getText();
        String tel=txtTel.getText();
        int age= Integer.parseInt(txtAge.getText());

        //Student student = new Student(name,address,tel,age);



        //if(index > 9){
            //System.out.println("can not add any more students...DB is full...");
        //}
        //else{
            //studentDB[index]=student;
           // index++;
           // System.out.println("student added...");
        //}
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demojdbc", "root", "@Janith11#");

                PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, address);
                preparedStatement.setString(3, tel);
                preparedStatement.setInt(4, age);

                int result=preparedStatement.executeUpdate();
                if(result>0){
                    System.out.println("student added successfully...");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}