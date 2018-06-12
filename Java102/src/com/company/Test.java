package com.company;

import com.company.Person;

public class Test{

    public static void main (String [] args){



        Person sonny = new Person ("Sonny", "sonny@gmail.com", "483-485-4948" );
        Person jordan = new Person ("Jordan", "jordan@aol.com", "495-586-3456" );


        sonny.printEmail();
        jordan.printEmail();
        jordan.setPhone("123-434-4323");
        sonny.printPhone();
        jordan.printPhone();
        sonny.printGreeting(jordan);
        jordan.printGreeting(sonny);


    }


}