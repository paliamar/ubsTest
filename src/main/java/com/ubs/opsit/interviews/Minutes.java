package com.ubs.opsit.interviews;


public class Minutes implements TimeConverter {
    
    private static final String RED_LIGHT = "R";
    private static final String YELLOW_LIGHT = "Y";
    private static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
    private static final String ALL_ELVN_LIGHTS_OFF = "OOOOOOOOOOO";

    @Override
    public String convertTime(String mins) {
        int minuteFirstRow = Integer.parseInt(mins) / 5;
        int minuteBottomRow = Integer.parseInt(mins) % 5;
        String  str = getMinutesFirstRow(minuteFirstRow) + "\n" + getMinutesBottomRow(minuteBottomRow);
        
        return str;
    }
    
    /**
     * 
     * @param min
     * @return 
     */
    private String getMinutesFirstRow(int min) {
        StringBuffer lmp = new StringBuffer(ALL_ELVN_LIGHTS_OFF);
        for (int i = 0; i < min; i++) {
            if (0 == (i + 1) % 3) {
                lmp.replace(i, i + 1, RED_LIGHT);
            } else {
                lmp.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lmp.toString();
    }

    /**
     * 
     * @param min
     * @return 
     */
    private String getMinutesBottomRow(int min) {
        StringBuffer lmp = new StringBuffer(ALL_FOUR_LIGHTS_OFF);
        for (int i = 0; i < min; i++) {
            lmp.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lmp.toString();
    }
    
}
