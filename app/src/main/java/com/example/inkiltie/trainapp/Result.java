package com.example.inkiltie.trainapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView fromRes = (TextView)findViewById(R.id.actual);
        TextView toRes = (TextView)findViewById(R.id.destination);
        TextView result = (TextView)findViewById(R.id.route);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        String from = sharedPref.getString("From", null);
        String to = sharedPref.getString("To", null);

        fromRes.setText("From: " + from);
        toRes.setText("To: " + to);

        String[] expo = getResources().getStringArray(R.array.expo);
        String[] expoTwo = getResources().getStringArray(R.array.expoTwo);
        String[] millennium = getResources().getStringArray(R.array.millennium);
        String[] canada = getResources().getStringArray(R.array.canada);
        String[] canadaTwo = getResources().getStringArray(R.array.canadaTwo);

        StringBuilder builder = new StringBuilder();
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        Integer stPt = null;
        Integer endPt = null;
        String lineFrom;
        String lineTo;

        if(Arrays.asList(expo).contains(from)) {
            lineFrom = "expo";
            for(int i = 0; i < expo.length; i++) {
                if(expo[i].equals(from)) {
                    stPt = i;
                }
            }
        }
        else if(Arrays.asList(expoTwo).contains(from)) {
            lineFrom = "expoTwo";
            for(int i = 0; i < expoTwo.length; i++) {
                if(expoTwo[i].equals(from)) {
                    stPt = i;
                }
            }
        }
        else if(Arrays.asList(millennium).contains(from)) {
            lineFrom = "millennium";
            for(int i = 0; i < millennium.length; i++) {
                if(millennium[i].equals(from)) {
                    stPt = i;
                }
            }
        }
        else if(Arrays.asList(canada).contains(from)) {
            lineFrom = "canada";
            for(int i = 0; i < canada.length; i++) {
                if(canada[i].equals(from)) {
                    stPt = i;
                }
            }
        }
        else {
            lineFrom = "canadaTwo";
            for(int i = 0; i < canadaTwo.length; i++) {
                if(canadaTwo[i].equals(from)) {
                    stPt = i;
                }
            }
        }

        if(Arrays.asList(expo).contains(to)) {
            lineTo ="expo";
            for(int i = 0; i < expo.length; i++) {
                if(expo[i].equals(to)) {
                    endPt = i;
                }
            }
        }
        else if(Arrays.asList(expoTwo).contains(to)) {
            lineTo ="expoTwo";
            for(int i = 0; i < expoTwo.length; i++) {
                if(expoTwo[i].equals(to)) {
                    endPt = i;
                }
            }
        }
        else if(Arrays.asList(millennium).contains(to)) {
            lineTo = "millennium";
            for(int i = 0; i < millennium.length; i++) {
                if(millennium[i].equals(to)) {
                    endPt = i;
                }
            }
        }
        else if(Arrays.asList(canada).contains(to)) {
            lineTo = "canada";
            for(int i = 0; i < canada.length; i++) {
                if(canada[i].equals(to)) {
                    endPt = i;
                }
            }
        }
        else {
            lineTo = "canadaTwo";
            for(int i = 0; i < canadaTwo.length; i++) {
                if(canadaTwo[i].equals(to)) {
                    endPt = i;
                }
            }
        }

        if (lineFrom.equals("expo")) {
            Integer expoCounter1 = 0;
            Integer expoCounter2 = 0;

            if (lineTo.equals("expo")) {
                if (stPt <= 5 && endPt >= 17) {
                    for (int i = stPt; i <= 5; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for (int i = 2; i <= 8; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                    for (int i = 19; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else if (stPt == 6 && endPt >= 18) {
                    for (int i = stPt; i >= 5; i--) {
                        builder.append(expo[i] + "\n");
                    }
                    for (int i = 2; i <= 8; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                    for (int i = 19; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else if (stPt == 7 && endPt >= 19) {
                    for (int i = stPt; i >= 5; i--) {
                        builder.append(expo[i] + "\n");
                    }
                    for (int i = 2; i <= 8; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                    for (int i = 19; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else if(stPt >= 17 && endPt <= 5) {
                    for(int i = stPt; i <= 19; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for(int i = 8; i >= 2; i--) {
                        builder.append(millennium[i] + "\n");
                    }
                    for(int i = 5; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else if(stPt >= 18 && endPt == 6) {
                    for(int i = stPt; i <= 19; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for(int i = 8; i >= 2; i--) {
                        builder.append(millennium[i] + "\n");
                    }
                    for(int i = 5; i <= endPt; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else if(stPt >= 19 && endPt == 7) {
                    for(int i = stPt; i <= 19; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for(int i = 8; i >= 2; i--) {
                        builder.append(millennium[i] + "\n");
                    }
                    for(int i = 5; i <= endPt; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else {
                    if (stPt < endPt) {
                        for (int i = stPt; i <= endPt; i++) {
                            builder.append(expo[i] + "\n");
                        }
                    }
                    else {
                        for (int i = stPt; i >= endPt; i--) {
                            builder.append(expo[i] + "\n");
                        }
                    }
                }

                result.setText(addTransfer(builder, lineFrom, lineTo));
            }

            if (lineTo.equals("millennium")) {
                if (stPt < 5) {
                    for (int i = stPt; i <= 5; i++) {
                        builder.append(expo[i] + "\n");
                    }

                    if (to.equals("VCC–Clark") != true) {
                        for (int i = 2; i <= endPt; i++) {
                            builder.append(millennium[i] + "\n");
                        }
                    }
                    else {
                        builder.append("VCC-Clark" + "\n");
                    }

                    result.setText(addTransfer(builder, lineFrom, lineTo));
                }
                else {
                    for (int i = stPt; i >= 5; i--) {
                        one.append(expo[i] + "\n");
                        expoCounter1++;
                    }
                    for (int i = stPt; i <= 18; i++) {
                        two.append(expo[i] + "\n");
                        expoCounter2++;
                    }

                    if (to.equals("VCC–Clark") != true) {
                        for (int i = 2; i <= endPt; i++) {
                            one.append(millennium[i] + "\n");
                            expoCounter1++;
                        }
                    }
                    else {
                        one.append("VCC-Clark" + "\n");
                        expoCounter1++;
                    }

                    if (endPt < 10) {
                        for (int i = 10; i >= endPt; i--) {
                            two.append(millennium[i] + "\n");
                            expoCounter2++;
                        }
                    }
                    else {
                        for (int i = 10; i <= endPt; i++) {
                            two.append(millennium[i] + "\n");
                            expoCounter2++;
                        }
                    }

                    if (expoCounter1 == expoCounter2) {
                        two = removeDuplicates(two);
                        result.setText(addTransfer(two, lineFrom, lineTo));
                    }
                    else if (expoCounter1 < expoCounter2) {
                        one = removeDuplicates(one);
                        result.setText(addTransfer(one, lineFrom, lineTo));
                    }
                    else {
                        two = removeDuplicates(two);
                        result.setText(addTransfer(two, lineFrom, lineTo));
                    }
                }
            }

            if (lineTo.equals("expoTwo")) {
                if (stPt < 15) {
                    for (int i = stPt; i <= 15; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= 15; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }

                for (int i = 0; i <= endPt; i++) {
                    builder.append(expoTwo[i] + "\n");
                }

                result.setText(builder);
            }

            if (lineTo.equals("canada")) {
                if (stPt > 5) {
                    for (int i = stPt; i >= 5; i--) {
                        one.append(expo[i] + "\n");
                        expoCounter1++;
                    }
                    for (int i = stPt; i <= 18; i++) {
                        two.append(expo[i] + "\n");
                        expoCounter2++;
                    }
                    for (int i = 10; i >= 1; i--) {
                        two.append(millennium[i] + "\n");
                        expoCounter2++;
                    }
                    for (int i = 5; i >= 0; i--) {
                        one.append(expo[i] + "\n");
                        two.append(expo[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= 0; i--) {
                        one.append(expo[i] + "\n");
                        two.append(expo[i] + "\n");
                    }
                }

                for (int i = 0; i <= endPt; i++) {
                    one.append(canada[i] + "\n");
                    two.append(canada[i] + "\n");
                }

                if (expoCounter1 == expoCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                } else if (expoCounter1 < expoCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                } else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }

            if (lineTo.equals("canadaTwo")) {
                if (stPt > 5) {
                    for (int i = stPt; i >= 5; i--) {
                        one.append(expo[i] + "\n");
                        expoCounter1++;
                    }
                    for (int i = stPt; i <= 18; i++) {
                        two.append(expo[i] + "\n");
                        expoCounter2++;
                    }
                    for (int i = 10; i >= 1; i--) {
                        two.append(millennium[i] + "\n");
                        expoCounter2++;
                    }
                    for (int i = 5; i >= 0; i--) {
                        one.append(expo[i] + "\n");
                        two.append(expo[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= 0; i--) {
                        one.append(expo[i] + "\n");
                        two.append(expo[i] + "\n");
                    }
                }

                for (int i = 0; i <= 8; i++) {
                    one.append(canada[i] + "\n");
                    two.append(canada[i] + "\n");
                }

                for (int i = 0; i <= endPt; i++) {
                    one.append(canadaTwo[i] + "\n");
                    two.append(canadaTwo[i] + "\n");
                }

                if (expoCounter1 == expoCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else if (expoCounter1 < expoCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }
        }

        if (lineFrom.equals("millennium")) {
            Integer millenniumCounter1 = 0;
            Integer millenniumCounter2 = 0;

            if (lineTo.equals("millennium")) {
                if (stPt < endPt) {
                    for (int i = stPt; i <= endPt; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= endPt; i--) {
                        builder.append(millennium[i] + "\n");
                    }
                }

                result.setText(builder);
            }

            if (lineTo.equals("expo")) {
                if (stPt > 0 && stPt <= 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else if (stPt > 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i >= 10; i--) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else {
                    for (int i = stPt; i <= 1; i++) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }

                if (endPt < 5) {
                    for (int i = 4; i >= endPt; i--) {
                        one.append(expo[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = 18; i >= endPt; i--) {
                        two.append(expo[i] + "n");
                        millenniumCounter2++;
                    }
                }
                else {
                    for (int i = 6; i <= endPt; i++) {
                        one.append(expo[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = 18; i >= endPt; i--) {
                        two.append(expo[i] + "\n");
                        millenniumCounter2++;
                    }
                }

                if (millenniumCounter1 == millenniumCounter2) {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
                else if (millenniumCounter1 < millenniumCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }


            if (lineTo.equals("expoTwo")) {
                if (stPt > 0 && stPt <= 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else if (stPt > 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i >= 10; i--) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else {
                    for (int i = stPt; i <= 1; i++) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }

                for (int i = 5; i <= 15; i++) {
                    one.append(expo[i] + "\n");
                    millenniumCounter1++;
                }
                for (int i = 18; i >= 15; i--) {
                    two.append(expo[i] + "\n");
                    millenniumCounter2++;
                }
                for (int i = 0; i <= endPt; i++) {
                    one.append(expoTwo[i] + "\n");
                    two.append(expoTwo[i] + "\n");
                }

                if (millenniumCounter1 == millenniumCounter2) {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
                else if (millenniumCounter1 < millenniumCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }

            if (lineTo.equals("canada")) {
                if (stPt > 0 && stPt <= 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else if (stPt > 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i >= 10; i--) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else {
                    for (int i = stPt; i <= 1; i++) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }

                for (int i = 5; i >= 0; i--) {
                    one.append(expo[i] + "\n");
                    millenniumCounter1++;
                }
                for (int i = 18; i >= 0; i--) {
                    two.append(expo[i] + "\n");
                    millenniumCounter2++;
                }
                for (int i = 0; i <= endPt; i++) {
                    one.append(canada[i] + "\n");
                    two.append(canada[i] + "\n");
                }

                if (millenniumCounter1 == millenniumCounter2) {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
                else if (millenniumCounter1 < millenniumCounter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }

            if (lineTo.equals("canadaTwo")) {
                if (stPt > 0 && stPt <= 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else if (stPt > 10) {
                    for (int i = stPt; i >= 1; i--) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i >= 10; i--) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }
                else {
                    for (int i = stPt; i <= 1; i++) {
                        one.append(millennium[i] + "\n");
                        millenniumCounter1++;
                    }
                    for (int i = stPt; i <= 10; i++) {
                        two.append(millennium[i] + "\n");
                        millenniumCounter2++;
                    }
                }

                for (int i = 5; i >= 0; i--) {
                    one.append(expo[i] + "\n");
                    millenniumCounter1++;
                }
                for (int i = 18; i >= 0; i--) {
                    two.append(expo[i] + "\n");
                    millenniumCounter2++;
                }
                for (int i = 0; i <= 8; i++) {
                    one.append(canada[i] + "\n");
                    two.append(canada[i] + "\n");
                }
                for (int i = 0; i <= endPt; i++) {
                    one.append(canadaTwo[i] + "\n");
                    two.append(canadaTwo[i] + "\n");
                }

                if (millenniumCounter1 == millenniumCounter2) {
                    two = removeDuplicates(two);
                    result.setText(millenniumCanada(two, lineFrom, lineTo));
                }
                else if (millenniumCounter1 < millenniumCounter2) {
                    one = removeDuplicates(one);
                    result.setText(millenniumCanada(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(millenniumCanada(two, lineFrom, lineTo));
                }
            }
        }

        if(lineFrom.equals("expoTwo")){
            if(lineTo.equals("expoTwo")){
                if (stPt < endPt) {
                    for (int i = stPt; i <= endPt; i++) {
                        builder.append(expoTwo[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= endPt; i--) {
                        builder.append(expoTwo[i] + "\n");
                    }
                }

                result.setText(builder);
            }

            if(lineTo.equals("expo")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(expoTwo[i] + "\n");
                }

                if(endPt > 15) {
                    for(int i = 15; i <= endPt; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else {
                    for(int i = 15; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                result.setText(addTransfer(builder, lineFrom, lineTo));
            }

            if(lineTo.equals("millennium")) {
                Integer counter1 = 0;
                Integer counter2 = 0;

                for(int i = stPt; i >= 0; i--) {
                    one.append(expoTwo[i] + "\n");
                    two.append(expoTwo[i] + "\n");
                }
                for(int i = 15; i >= 5; i--) {
                    one.append(expo[i] + "\n");
                    counter1++;
                }
                for(int i = 15; i <= 18; i++) {
                    two.append(expo[i] + "\n");
                    counter2++;
                }

                if(to.equals("VCC–Clark") != true) {
                    for(int i = 2; i <= endPt; i++) {
                        one.append(millennium[i] + "\n");
                        counter1++;
                    }

                    if(endPt > 10) {
                        for(int i = 10; i <= endPt; i++) {
                            two.append(millennium[i] + "\n");
                            counter2++;
                        }
                    }
                    else {
                        for(int i = 10; i >= endPt; i--) {
                            two.append(millennium[i] + "\n");
                            counter2++;
                        }
                    }
                }
                else{
                    one.append(millennium[0] + "\n");
                    counter1++;

                    for(int i = 10; i >= 0; i--){
                        two.append(millennium[i] + "\n");
                        counter2++;
                    }
                }

                if(counter1 == counter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else if(counter1 < counter2) {
                    one = removeDuplicates(one);
                    result.setText(addTransfer(one, lineFrom, lineTo));
                }
                else {
                    two = removeDuplicates(two);
                    result.setText(addTransfer(two, lineFrom, lineTo));
                }
            }

            if(lineTo.equals("canada")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(expoTwo[i] + "\n");
                }
                for(int i = 15; i >= 0; i--) {
                    builder.append(expo[i] + "\n");
                }
                for(int i = 0; i <= endPt; i++) {
                    builder.append(canada[i] + "\n");
                }

                result.setText(addTransfer(builder, lineFrom, lineTo));
            }

            if(lineTo.equals("canadaTwo")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(expoTwo[i] + "\n");
                }
                for(int i = 15; i >= 0; i--) {
                    builder.append(expo[i] + "\n");
                }
                for(int i = 0; i <= 8; i++) {
                    builder.append(canada[i] + "\n");
                }
                for(int i = 0; i <= endPt; i++) {
                    builder.append(canadaTwo[i] + "\n");
                }

                result.setText(addTransfer(builder, lineFrom, lineTo));
            }
        }

        if(lineFrom.equals("canada")) {
            if(lineTo.equals("canada")) {
                if (stPt < endPt) {
                    for (int i = stPt; i <= endPt; i++) {
                        builder.append(canada[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= endPt; i--) {
                        builder.append(canada[i] + "\n");
                    }
                }

                result.setText(builder);
            }

            if(lineTo.equals("canadaTwo")) {
                if(stPt > 8) {
                    for(int i = stPt; i >= 8; i--) {
                        builder.append(canada[i] + "\n");
                    }
                }
                else
                {
                    for(int i = stPt; i <= 8; i++) {
                        builder.append(canada[i] + "\n");
                    }
                }

                for(int i = 0; i <= endPt; i++) {
                    builder.append(canadaTwo[i] + "\n");
                }

                result.setText(changeYVR(builder, stPt, lineTo));
            }

            if(lineTo.equals("expo")) {
                for (int i = stPt; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }

                if (endPt >= 17) {
                    for (int i = 0; i <= 5; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for (int i = 2; i <= 8; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                    for (int i = 19; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else {
                    for (int i = 0; i <= endPt; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }

                result.setText(addTransfer(builder, lineFrom, lineTo));
            }
            if(lineTo.equals("millennium")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }
                for(int i = 0; i <= 5; i++) {
                    builder.append(expo[i] + "\n");
                }

                if(to.equals("VCC–Clark") != true) {
                    for(int i = 2; i <= endPt; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                }
                else {
                    builder.append(millennium[0] + "\n");
                }

                builder = removeDuplicates(builder);
                result.setText(canadaMillennium(builder, lineFrom, lineTo));
            }

            if(lineTo.equals("expoTwo")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }
                for(int i = 0; i <= 15; i++) {
                    builder.append(expo[i] + "\n");
                }
                for(int i = 0; i <= endPt; i++) {
                    builder.append(expoTwo[i] + "\n");
                }

                result.setText(addTransfer(builder, lineFrom, lineTo));
            }
        }

        if(lineFrom.equals("canadaTwo")) {
            if(lineTo.equals("canadaTwo")) {
                if (stPt < endPt) {
                    for (int i = stPt; i <= endPt; i++) {
                        builder.append(canadaTwo[i] + "\n");
                    }
                }
                else {
                    for (int i = stPt; i >= endPt; i--) {
                        builder.append(canadaTwo[i] + "\n");
                    }
                }
            }

            if(lineTo.equals("canada")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canadaTwo[i] + "\n");
                }

                if(endPt > 8) {
                    for(int i = 8; i <= endPt; i++) {
                        builder.append(canada[i] + "\n");
                    }
                }
                else{
                    for(int i = 8; i >= endPt; i--) {
                        builder.append(canada[i] + "\n");
                    }
                }
            }

            if(lineTo.equals("expo")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canadaTwo[i] + "\n");
                }
                for (int i = 8; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }

                if (endPt >= 17) {
                    for (int i = 0; i <= 5; i++) {
                        builder.append(expo[i] + "\n");
                    }
                    for (int i = 2; i <= 8; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                    for (int i = 19; i >= endPt; i--) {
                        builder.append(expo[i] + "\n");
                    }
                }
                else {
                    for (int i = 0; i <= endPt; i++) {
                        builder.append(expo[i] + "\n");
                    }
                }
            }

            if(lineTo.equals("millennium")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canadaTwo[i] + "\n");
                }
                for (int i = 8; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }
                for(int i = 0; i <= 5; i++) {
                    builder.append(expo[i] + "\n");
                }

                if(to.equals("VCC–Clark") != true) {
                    for(int i = 2; i <= endPt; i++) {
                        builder.append(millennium[i] + "\n");
                    }
                }
                else {
                    builder.append(millennium[0] + "\n");
                }
            }

            if(lineTo.equals("expoTwo")) {
                for(int i = stPt; i >= 0; i--) {
                    builder.append(canadaTwo[i] + "\n");
                }
                for (int i = 8; i >= 0; i--) {
                    builder.append(canada[i] + "\n");
                }
                for(int i = 0; i <= 15; i++) {
                    builder.append(expo[i] + "\n");
                }
                for(int i = 0; i <= endPt; i++) {
                    builder.append(expoTwo[i] + "\n");
                }
            }

            builder = removeDuplicates(builder);
            result.setText(addTransfer(builder, lineFrom, lineTo));
        }
    }

    public StringBuilder removeDuplicates(StringBuilder input) {
        String[] tokens = input.toString().split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        Set<String> alreadyPresent = new HashSet<String>();

        boolean first = true;
        for(String token : tokens) {
            if(!alreadyPresent.contains(token)) {
                if(first) first = false;
                else resultBuilder.append("\n");

                if(!alreadyPresent.contains(token))
                    resultBuilder.append(token);
            }

            alreadyPresent.add(token);
        }

        return resultBuilder;
    }

    public String changeYVR(StringBuilder input, Integer sPoint, String lineTo) {
        String[] tokens = input.toString().split("\n");
        StringBuilder resultBuilder = new StringBuilder();

        if(sPoint > 8 && lineTo.equals("canadaTwo")) {
            for(String token : tokens) {
                if(token.equals("Bridgeport")) {
                    token = token + " *** TRANSFER";
                }
                resultBuilder.append(token + "\n");
            }
        }

        String result = resultBuilder.toString();
        return  result;
    }

    public String millenniumCanada(StringBuilder input, String from, String to) {
        String[] tokens = input.toString().split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        Set<String> alreadyPresent = new HashSet<String>(Arrays.asList(tokens));

        if(from.equals("millennium") && to.equals("canada") || to.equals("canadaTwo")) {
            for(String token : tokens) {
                if(token.equals("Commercial–Broadway")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }

        String result = resultBuilder.toString();
        return  result;
    }

    public String canadaMillennium(StringBuilder input, String from, String to) {
        String[] tokens = input.toString().split("\n");
        StringBuilder resultBuilder = new StringBuilder();

        if(from.equals("canada") || from.equals("canadaTwo") && to.equals("millennium")) {
            for(String token : tokens) {
                if(token.equals("Commercial–Broadway")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }

        String result = resultBuilder.toString();
        return  result;
    }

    public String addTransfer(StringBuilder input, String from, String to) {
        String[] tokens = input.toString().split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        Set<String> alreadyPresent = new HashSet<String>(Arrays.asList(tokens));

        if(from.equals("expo") && to.equals("expo")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Renfrew")) {
                    if(alreadyPresent.contains("Nanaimo") || alreadyPresent.contains("Main Street–Science World")) {
                        if(token.equals("Commercial–Broadway")) {
                            token = token + " *** TRANSFER";
                        }

                        if(alreadyPresent.contains("Braid")) {
                            if(token.equals("Lougheed Town Centre")) {
                                token = token + " *** TRANSFER";
                            }
                        }
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expo") && to.equals("millennium")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Nanaimo") || alreadyPresent.contains("Main Street–Science World")) {
                    if(token.equals("Commercial–Broadway")) {
                        token = token + " *** TRANSFER";
                    }
                }

                if(alreadyPresent.contains("Burquitlam")) {
                    if(token.equals("Lougheed Town Centre")) {
                        token = token + " *** TRANSFER";
                    }
                }

                if(alreadyPresent.contains("Lake City Way")) {
                    if(token.equals("Lougheed Town Centre")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expo") && to.equals("canada") || to.equals("canadaTwo")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Renfrew")) {
                    if(token.equals("Lougheed Town Centre")) {
                        token = token + " *** TRANSFER";
                    }

                    if(token.equals("Commercial–Broadway")) {
                        token = token + " *** TRANSFER";
                    }
                }

                if(alreadyPresent.contains("Burrard")) {
                    if(token.equals("Waterfront")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expo") && to.equals("expoTwo")) {
            if(alreadyPresent.contains("Sapperton") || alreadyPresent.contains("Braid") || alreadyPresent.contains("Lougheed Town Centre") || alreadyPresent.contains("Production Way–University")) {
                for(String token : tokens) {
                    if(token.equals("Columbia")) {
                        token = token + " *** TRANSFER";
                    }

                    resultBuilder.append(token + "\n");
                }
            }
        }
        else if(from.equals("millennium") && to.equals("expo") && !alreadyPresent.contains("Commercial–Broadway")) {
            for(String token : tokens) {
                if(token.equals("Commercial–Broadway")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Lougheed Town Centre")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("millennium") && to.equals("expoTwo")) {
            for(String token : tokens) {
                if(token.equals("Lougheed Town Centre")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Columbia")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("millennium") && to.equals("canada") || to.equals("canadaTwo")) {
            for(String token : tokens) {
                if(token.equals("Commercial–Broadway")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expoTwo") && to.equals("expo")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Sapperton") || alreadyPresent.contains("Braid") || alreadyPresent.contains("Lougheed Town Centre") || alreadyPresent.contains("Production Way–University")) {
                    if(token.equals("Columbia")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expoTwo") && to.equals("millennium")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("VCC–Clark")) {
                    if(token.equals("Commercial–Broadway")) {
                        token = token + " *** TRANSFER";
                    }
                }
                else {
                    if(token.contains("Columbia")) {
                        token = token + " *** TRANSFER";
                    }

                    if(token.equals("Lougheed Town Centre")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("expoTwo") && to.equals("canada") || to.equals("canadaTwo")) {
            for(String token : tokens) {
                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("canada") || from.equals("canadaTwo") && to.equals("expo")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Burrard")) {
                    if(token.equals("Waterfront")) {
                        token = token + " *** TRANSFER";
                    }
                }

                if(alreadyPresent.contains("VCC–Clark")) {
                    if(token.equals("Commercial–Broadway")) {
                        token = token + " *** TRANSFER";
                    }
                }

                if(alreadyPresent.contains("Renfrew")) {
                    if(token.equals("Commercial–Broadway")) {
                        token = token + " *** TRANSFER";
                    }

                    if(token.equals("Lougheed Town Centre")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("canada") || from.equals("canadaTwo") && to.equals("millennium")) {
            for(String token : tokens) {
                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                if(token.equals("Commercial–Broadway")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("canada") || from.equals("canadaTwo") && to.equals("expoTwo")) {
            for(String token : tokens) {
                if(token.equals("Waterfront")) {
                    token = token + " *** TRANSFER";
                }

                resultBuilder.append(token + "\n");
            }
        }
        else if(from.equals("canadaTwo") && to.equals("canada")) {
            for(String token : tokens) {
                if(alreadyPresent.contains("Aberdeen") || alreadyPresent.contains("Lansdowne") || alreadyPresent.contains("Richmond–Brighouse")) {
                    if(token.equals("Bridgeport")) {
                        token = token + " *** TRANSFER";
                    }
                }

                resultBuilder.append(token + "\n");
            }
        }
        else {
            resultBuilder = input;
        }

        String result = resultBuilder.toString();
        return  result;
    }

    public void back(View v)
    {
        startActivity(new Intent(Result.this,MainActivity.class));
    }
}