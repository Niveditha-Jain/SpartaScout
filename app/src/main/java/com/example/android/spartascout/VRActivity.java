package com.example.android.spartascout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);


        // Find the View that shows the two D map category
        Button submitLocation = (Button) findViewById(R.id.submitLocation);

        // Set a click listener on that View
        if (submitLocation != null) {
            submitLocation.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the campus news View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent virtualTourIntent = new Intent(VRActivity.this, VirtualTourActivity.class);
                    startActivity(virtualTourIntent);
                }
            });
        }

        //
    }
}
