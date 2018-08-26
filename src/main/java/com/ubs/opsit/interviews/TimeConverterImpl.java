/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubs.opsit.interviews;


/**
 *
 * @author amarpali
 */
public class TimeConverterImpl implements TimeConverter {

    @Override
    public String convertTime(String time) {
        
        StringBuilder timeS = new StringBuilder();
        String[] times = time.split(":");

        Seconds seconds = new Seconds();
        Hours hours = new Hours();
        Minutes minutes = new Minutes();

        timeS.append(seconds.convertTime(times[2])).append("\n").append(hours.convertTime(times[0])).append("\n").append(minutes.convertTime(times[1]));

        return timeS.toString();
    }
}
