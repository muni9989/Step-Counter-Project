package com.example.stepcounterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HealthActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    private EditText sleep_intake;
    private EditText water_intake;
    private TextView sleep_goal;
    private TextView water_goal;

    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

       setUpNavBar();



        sleep_intake = (EditText) findViewById(R.id.editText_sleep_intake);
        water_intake = (EditText) findViewById(R.id.editText_water_intake);
        sleep_goal = (TextView) findViewById(R.id.sleep_goal);
        water_goal = (TextView) findViewById(R.id.water_goal);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sleep_hrs = Integer.parseInt(sleep_intake.getText().toString());
                int water_litres = Integer.parseInt(water_intake.getText().toString());
                switch (sleep_hrs) {
                    case 0: {
                        sleep_goal.setText("8 hrs");
                        break;
                    }
                    case 1: {
                        sleep_goal.setText("7 hrs");

                        break;
                    }
                    case 2: {
                        sleep_goal.setText("6 hrs");
                        break;
                    }
                    case 3: {
                        sleep_goal.setText("5 hrs");
                        break;
                    }
                    case 4: {
                        sleep_goal.setText("4 hrs");
                        break;
                    }
                    case 5: {
                        sleep_goal.setText("3 hrs");
                        break;
                    }
                    case 6: {
                        sleep_goal.setText("2 hrs");
                        break;
                    }
                    case 7: {
                        sleep_goal.setText("1 hr");
                        break;
                    }
                    case 8: {
                        sleep_goal.setText("0");
                        break;
                    }
                    default: {
                        sleep_goal.setText("0");

                    }
                }

                switch (water_litres) {
                    case 0: {
                        water_goal.setText("3 litres");
                        break;
                    }
                    case 1: {
                        water_goal.setText("2 litres");
                        break;
                    }
                    case 2: {
                        water_goal.setText("1 litre");
                        break;
                    }
                    case 3: {
                        water_goal.setText("0");
                        break;
                    }

                    default: {
                        water_goal.setText("0");

                    }


                }
            }


        });


    }

    private void setUpNavBar(){
        bottomNav = findViewById(R.id.bottomNav);

        bottomNav.setSelectedItemId(R.id.health);


        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                    {
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    }
                    case R.id.health:
                    {

                        return true;
                    }


                    case R.id.setting:
                    {
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    }


                }
                return false;
            }
        });
    }

}