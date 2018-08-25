/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubs.opsit.interviews;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amarpali
 */
public class BerlinMain {

    private static List<TimeConverter> unitsOf = new ArrayList<TimeConverter>();

    public static void main(String args[]) {

        unitsOf.add(new Seconds());
        unitsOf.add(new Minutes());
        unitsOf.add(new Hours());

        System.out.println("Finale ouput :\n" + convertTime("13:17:01"));

    }

    public static String convertTime(String time) {
        StringBuilder timeS = new StringBuilder();
        String[] times = time.split(":");

        int i = 0;
        int j = 2;

        for (TimeConverter timeUnit : unitsOf) {
            for (String timeSecMin : times) {
                timeS.append(unitsOf.get(i).convertTime(times[j])).append("\n");
                i++;
                j--;
                break;
            }
        }
        return timeS.toString();
    }
}
