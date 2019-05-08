package com.example.peekaboo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private ImageView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (ImageView) findViewById(R.id.imageViewPB);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    //The toggle in enabled
                    resultView.setVisibility(View.VISIBLE);
                }else  {
                    //The toggle is disabled
                    resultView.setVisibility(View.INVISIBLE);
                }

            }
        });

    }
}
