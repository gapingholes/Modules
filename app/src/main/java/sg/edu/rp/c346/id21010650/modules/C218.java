package sg.edu.rp.c346.id21010650.modules;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class C218 extends AppCompatActivity {

    TextView textModuleCode4;
    TextView textModuleName4;
    TextView textAcademicYear4;
    TextView textSemester4;
    TextView textModuleCredit4;
    TextView textVenue4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c218);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        textModuleCode4 = findViewById(R.id.textModuleCode4);
        textModuleName4 = findViewById(R.id.textModuleName4);
        textAcademicYear4 = findViewById(R.id.textAcademicYear4);
        textSemester4 = findViewById(R.id.textSemester4);
        textModuleCredit4 = findViewById(R.id.textModuleCredit4);
        textVenue4 = findViewById(R.id.textVenue4);

        Intent intentReceived1 = getIntent();
        char value1 = intentReceived1.getCharExtra("value", 'C');

        Intent intentReceived2 = getIntent();
        int value2 = intentReceived2.getIntExtra("value", 218);
        textModuleCode4.setText("Module Code: " + value1 + value2);

        Intent intentReceived3 = getIntent();
        textModuleName4.setText("Module Name: " + "UI/UX Design");

        Intent intentReceived4 = getIntent();
        int value4 = intentReceived4.getIntExtra("value", 2022);
        textAcademicYear4.setText("Academic Year: " + value4);

        Intent intentReceived5 = getIntent();
        int value5 = intentReceived5.getIntExtra("value", 1);
        textSemester4.setText("Semester: " + value5);

        Intent intentReceived6 = getIntent();
        int value6 = intentReceived6.getIntExtra("value", 4);
        textModuleCredit4.setText("Module Credit: " + value6);

        Intent intentReceived7 = getIntent();
        char value7 = intentReceived7.getCharExtra("value", 'E');
        Intent intentReceived8 = getIntent();
        int value8 = intentReceived8.getIntExtra("value", 66);
        Intent intentReceived9 = getIntent();
        char value9 = intentReceived9.getCharExtra("value", 'B');
        textVenue4.setText("Venue: " + value7 + value8 + value9);


    }
}