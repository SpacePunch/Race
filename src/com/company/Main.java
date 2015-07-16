package com.company;


import com.company.Package1.AbstractMoto;
import com.company.Package1.Honda;
import com.company.Package1.Java;
import com.company.Package1.Kawasaki;

public class Main {

    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki();
        Java java = new Java();
        Honda honda = new Honda();
        AbstractMoto.race(kawasaki,honda);
        AbstractMoto.race(java,honda);
        AbstractMoto.race(kawasaki,java);
    }
}
