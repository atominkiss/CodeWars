package net.protoprint;

import java.util.Arrays;

public class SurfaceAreaVolumeBox {
    // S = w*h
    // V = w*h*d
    static String getSize(int w, int h, int d) {
        int[] value = new int[2];
        value[0] = 2 * (w * h + h * d + w * d);
        value[1] = w * h * d;
        String intArrayString = Arrays.toString(value);
        return intArrayString;
    }

}
