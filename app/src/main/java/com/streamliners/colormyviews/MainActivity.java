package com.streamliners.colormyviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.streamliners.colormyviews.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setupEventHandlers();

    }

    private void makeColored(View view) {
        if (view.getId() == b.boxOneText.getId())
            b.boxOneText.setBackgroundColor(Color.DKGRAY);
        else if (view.getId() == b.boxTwoText.getId())
            b.boxTwoText.setBackgroundColor(Color.GRAY);
        else if (view.getId() == b.boxThreeText.getId())
            b.boxThreeText.setBackgroundColor(Color.BLUE);
        else if (view.getId() == b.boxFourText.getId())
            b.boxFourText.setBackgroundColor(Color.BLUE);
        else if (view.getId() == b.boxFiveText.getId())
            b.boxFiveText.setBackgroundColor(Color.BLUE);

        else if (view.getId() == b.red.getId())
            b.boxThreeText.setBackgroundColor(getResources().getColor(R.color.my_red));
        else if (view.getId() == b.yellow.getId())
            b.boxFourText.setBackgroundColor(getResources().getColor(R.color.my_yellow));
        else if (view.getId() == b.green.getId())
            b.boxFiveText.setBackgroundColor(getResources().getColor(R.color.my_green));


        else
            view.setBackgroundColor(Color.LTGRAY);
    }

    /**
     * Set event handlers(onClick) for views
     */
    private void setupEventHandlers() {
        // list of all the clickable views
        List<View> clickableViews = new ArrayList<>(
                Arrays.asList(b.boxOneText, b.boxTwoText, b.boxThreeText,
                        b.boxFourText, b.boxFiveText, b.constraintLayout,
                        b.red,b.green,b.yellow)
        );

        // setting the on click listeners to all the views using loop
        for (View item :
                clickableViews) {
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    makeColored(item);
                }
            });
        }
    }


}