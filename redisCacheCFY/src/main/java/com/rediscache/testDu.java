package com.rediscache;

import java.time.Duration;

public class testDu {

    public static void ofMillis(long millis) {
        long secs = millis / 1000;
        int mos = (int) (millis % 1000);
        if (mos < 0) {
            mos += 1000;
            secs--;
        }
    }

    public static void main(String[] args) {
        ofMillis(-1L);
    }


}
