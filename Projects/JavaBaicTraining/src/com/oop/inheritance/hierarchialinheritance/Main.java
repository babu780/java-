package com.oop.inheritance.hierarchialinheritance;

public class Main {

    public static void main(String[] args) {
        JavaSoftwareCompany java = new JavaSoftwareCompany();
        java.name();
        java.age();
        java.department();
        java.salary();


        PythonSoftwareCompany py = new PythonSoftwareCompany();
        py.program();
        py.age();
        py.name();

        JavaScriptCompany script = new JavaScriptCompany();
        script.sytex();
        script.name();
        script.age();


    }

}
