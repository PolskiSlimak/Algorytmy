/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
public abstract class Player { //musi mieć conajmniej jedna metode abstrakcyjna

    private String name;
    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z~]{3,}$")) // bezpieczniejszy sposob, bo name moze nie istniec, a pusty lancuch znakow zawsze istnieje
        {
            this.name = name; //this wskazuje na obiekt n którym jest wywoływana metoda setName
        } else //            System.err.println("Name can't be null");
        {
            throw new IllegalArgumentException("Dales nulla");
        }
    }

    public abstract int guess();
}

