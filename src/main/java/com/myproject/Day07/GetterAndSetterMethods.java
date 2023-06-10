package com.myproject.Day07;

public class GetterAndSetterMethods {
    private int ssnNumber=4343;
    private String employeeID;

    public int getSsnNumber() {
        return ssnNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setSsnNumber(int ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}


class MyEmployeeDetails{

    GetterAndSetterMethods gs= new GetterAndSetterMethods();
    public void myTestMethod(){
        System.out.println(gs.getSsnNumber());
        gs.setSsnNumber(6778888);
    }
}