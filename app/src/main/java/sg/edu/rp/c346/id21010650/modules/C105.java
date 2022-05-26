package sg.edu.rp.c346.id21010650.modules;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class C105 extends AppCompatActivity {

    TextView textModuleCode2;
    TextView textModuleName2;
    TextView textAcademicYear2;
    TextView textSemester2;
    TextView textModuleCredit2;
    TextView textVenue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c105);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        textModuleCode2 = findViewById(R.id.textModuleCode2);
        textModuleName2 = findViewById(R.id.textModuleName2);
        textAcademicYear2 = findViewById(R.id.textAcademicYear2);
        textSemester2 = findViewById(R.id.textSemester2);
        textModuleCredit2 = findViewById(R.id.textModuleCredit2);
        textVenue2 = findViewById(R.id.textVenue2);

        Intent intentReceived1 = getIntent();
        char value1 = intentReceived1.getCharExtra("value", 'C');

        Intent intentReceived2 = getIntent();
        int value2 = intentReceived2.getIntExtra("value", 105);
        textModuleCode2.setText("Module Code: " + value1 + value2);

        Intent intentReceived3 = getIntent();
        textModuleName2.setText("Module Name: " + "Introduction to Programming");

        Intent intentReceived4 = getIntent();
        int value4 = intentReceived4.getIntExtra("value", 2022);
        textAcademicYear2.setText("Academic Year: " + value4);

        Intent intentReceived5 = getIntent();
        int value5 = intentReceived5.getIntExtra("value", 1);
        textSemester2.setText("Semester: " + value5);

        Intent intentReceived6 = getIntent();
        int value6 = intentReceived6.getIntExtra("value", 4);
        textModuleCredit2.setText("Module Credit: " + value6);

        Intent intentReceived7 = getIntent();
        char value7 = intentReceived7.getCharExtra("value", 'W');
        Intent intentReceived8 = getIntent();
        int value8 = intentReceived8.getIntExtra("value", 64);
        Intent intentReceived9 = getIntent();
        char value9 = intentReceived9.getCharExtra("value", 'R');
        textVenue2.setText("Venue: " + value7 + value8 + value9);


    }
}