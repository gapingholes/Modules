package sg.edu.rp.c346.id21010650.modules;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class C203 extends AppCompatActivity {

    TextView textModuleCode1;
    TextView textModuleName1;
    TextView textAcademicYear1;
    TextView textSemester1;
    TextView textModuleCredit1;
    TextView textVenue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c203);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        textModuleCode1 = findViewById(R.id.textModuleCode1);
        textModuleName1 = findViewById(R.id.textModuleName1);
        textAcademicYear1 = findViewById(R.id.textAcademicYear1);
        textSemester1 = findViewById(R.id.textSemester1);
        textModuleCredit1 = findViewById(R.id.textModuleCredit1);
        textVenue1 = findViewById(R.id.textVenue1);

        Intent intentReceived1 = getIntent();
        char value1 = intentReceived1.getCharExtra("value", 'C');

        Intent intentReceived2 = getIntent();
        int value2 = intentReceived2.getIntExtra("value", 203);
        textModuleCode1.setText("Module Code: " + value1 + value2);

        Intent intentReceived3 = getIntent();
        textModuleName1.setText("Module Name: " + "Web Application Development");

        Intent intentReceived4 = getIntent();
        int value4 = intentReceived4.getIntExtra("value", 2022);
        textAcademicYear1.setText("Academic Year: " + value4);

        Intent intentReceived5 = getIntent();
        int value5 = intentReceived5.getIntExtra("value", 1);
        textSemester1.setText("Semester: " + value5);

        Intent intentReceived6 = getIntent();
        int value6 = intentReceived6.getIntExtra("value", 4);
        textModuleCredit1.setText("Module Credit: " + value6);

        Intent intentReceived7 = getIntent();
        char value7 = intentReceived7.getCharExtra("value", 'W');
        Intent intentReceived8 = getIntent();
        int value8 = intentReceived8.getIntExtra("value", 65);
        Intent intentReceived9 = getIntent();
        char value9 = intentReceived9.getCharExtra("value", 'H');
        textVenue1.setText("Venue: " + value7 + value8 + value9);
    }
}