package ik.ikman.oop.javafx01;

public class Student {
    private String name;
    private  String address;
    private  String tel;
    private  int age;

    public Student() {
    }

    public Student(String name, String address, String tel, int age) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }





}
