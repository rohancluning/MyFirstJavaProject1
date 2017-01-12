package com.rohan;

import com.rohan.person.*;
import java.util.Date;

public class Main
{

    public static void main(String[] args)
    {
        Date today = new Date();
        Person person = new Person ( "Rohan Cluning",
                                      "85 Alexandra Ave",
                                        today);

        System.out.println(
                "Hello World" +
                "\n Name: " + person.getName() +
                "\n Address: " + person.getAddress() +
                "\n DOB: " + person.getDob());
    }
}
