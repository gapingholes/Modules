package sg.edu.rp.c346.id21010650.modules;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class C206 extends AppCompatActivity {

    TextView textModuleCode3;
    TextView textModuleName3;
    TextView textAcademicYear3;
    TextView textSemester3;
    TextView textModuleCredit3;
    TextView textVenue3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c206);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        textModuleCode3 = findViewById(R.id.textModuleCode3);
        textModuleName3 = findViewById(R.id.textModuleName3);
        textAcademicYear3 = findViewById(R.id.textAcademicYear3);
        textSemester3 = findViewById(R.id.textSemester3);
        textModuleCredit3 = findViewById(R.id.textModuleCredit3);
        textVenue3 = findViewById(R.id.textVenue3);

        Intent intentReceived1 = getIntent();
        char value1 = intentReceived1.getCharExtra("value", 'C');

        Intent intentReceived2 = getIntent();
        int value2 = intentReceived2.getIntExtra("value", 206);
        textModuleCode3.setText("Module Code: " + value1 + value2);

        Intent intentReceived3 = getIntent();
        textModuleName3.setText("Module Name: " + "Software Development Process");

        Intent intentReceived4 = getIntent();
        int value4 = intentReceived4.getIntExtra("value", 2022);
        textAcademicYear3.setText("Academic Year: " + value4);

        Intent intentReceived5 = getIntent();
        int value5 = intentReceived5.getIntExtra("value", 1);
        textSemester3.setText("Semester: " + value5);

        Intent intentReceived6 = getIntent();
        int value6 = intentReceived6.getIntExtra("value", 4);
        textModuleCredit3.setText("Module Credit: " + value6);

        Intent intentReceived7 = getIntent();
        char value7 = intentReceived7.getCharExtra("value", 'E');
        Intent intentReceived8 = getIntent();
        int value8 = intentReceived8.getIntExtra("value", 66);
        Intent intentReceived9 = getIntent();
        char value9 = intentReceived9.getCharExtra("value", 'J');
        textVenue3.setText("Venue: " + value7 + value8 + value9);
    }
}