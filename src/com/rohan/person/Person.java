package com.rohan.person;

import java.util.Date;

/**
 * Created by rohanclunig on 11-01-17.
 */
public class Person
{
    private String name;
    private String address;
    private Date dob;

    public Person()
    {
        name = null;
        address = null;
        dob = null;
    }

    public Person(String name,
                  String address,
                  Date dob)
    {
        this.name = name + " - new stuff";
        this.address = address;
        this.dob = dob;

        if (null != this.address)
        {
            this.address += " extra";
        }

        int i = 1;
        while (i < 5)
        {
            System.out.println("Construct");
            i++;
        }

        i = 2;
        do
        {
            System.out.println("part 2");
            i++;
        } while (i < 4);

        i = 3;
        switch (i)
        {
            case 1:
                System.out.println("1: Switch Statement");
                break;
            case 3:
                System.out.println("3: Switch Statement");
        }

        System.out.println();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddress() {return this.address;}

    public void setAddress(String address) {this.address = address;}

    public Date getDob() {return dob;}

    public void setDob(Date dob) { this.dob = dob;}
}
