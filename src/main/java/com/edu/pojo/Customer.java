package com.edu.pojo;

public class Customer {
    private  int Cid;
    private String Cname;
    private String phone;
    private  String email;

    public int getCid() {
        return Cid;
    }

    public Customer() {
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + Cid +
                ", name='" + Cname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Customer(int Cid, String Cname, String phone, String email, String address) {
        this.Cid = Cid;
        this.Cname = Cname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getPhone() {
        return phone;

    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private  String address;

}
