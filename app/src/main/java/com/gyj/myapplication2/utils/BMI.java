package com.gyj.myapplication2.utils;

import com.gyj.myapplication2.R;

public class BMI {
    public static String getBmi(int id, double bmi1,int id2) {
        String str = "";
        if (id == id2) {
            if (bmi1 < 20) {
                str = "体重过轻";
            } else if (bmi1 < 25) {
                str = "体重正常";

            } else if (bmi1 < 27) {
                str = "体重超重";
            } else if (bmi1 < 30) {
                str = "轻度肥胖";
            } else if (bmi1 < 35) {
                str = "中度肥胖";

            } else if (bmi1 >= 35) {
                str = "重度肥胖";

            }
        } else {
            if (bmi1 < 19) {
                str = "体重过轻";

            } else if (bmi1 < 24) {
                str = "体重正常";

            } else if (bmi1 < 26) {
                str = "体重超重";

            } else if (bmi1 < 29) {
                str = "轻度肥胖";

            } else if (bmi1 < 34) {
                str = "中度肥胖";

            } else if (bmi1 >= 34) {
                str = "重度肥胖";

            }
        }
        return str;
    }
}

