package sg.edu.rp.c346.id21010650.modules;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class C346 extends AppCompatActivity {

    TextView textModuleCode5;
    TextView textModuleName5;
    TextView textAcademicYear5;
    TextView textSemester5;
    TextView textModuleCredit5;
    TextView textVenue5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        textModuleCode5 = findViewById(R.id.textModuleCode5);
        textModuleName5 = findViewById(R.id.textModuleName5);
        textAcademicYear5 = findViewById(R.id.textAcademicYear5);
        textSemester5 = findViewById(R.id.textSemester5);
        textModuleCredit5 = findViewById(R.id.textModuleCredit5);
        textVenue5 = findViewById(R.id.textVenue5);

        Intent intentReceived1 = getIntent();
        char value1 = intentReceived1.getCharExtra("value", 'C');

        Intent intentReceived2 = getIntent();
        int value2 = intentReceived2.getIntExtra("value", 346);
        textModuleCode5.setText("Module Code: " + value1 + value2);

        Intent intentReceived3 = getIntent();
        textModuleName5.setText("Module Name: " + "Mobile App Development");

        Intent intentReceived4 = getIntent();
        int value4 = intentReceived4.getIntExtra("value", 2022);
        textAcademicYear5.setText("Academic Year: " + value4);

        Intent intentReceived5 = getIntent();
        int value5 = intentReceived5.getIntExtra("value", 1);
        textSemester5.setText("Semester: " + value5);

        Intent intentReceived6 = getIntent();
        int value6 = intentReceived6.getIntExtra("value", 4);
        textModuleCredit5.setText("Module Credit: " + value6);

        Intent intentReceived7 = getIntent();
        char value7 = intentReceived7.getCharExtra("value", 'E');
        Intent intentReceived8 = getIntent();
        int value8 = intentReceived8.getIntExtra("value", 62);
        Intent intentReceived9 = getIntent();
        char value9 = intentReceived9.getCharExtra("value", 'E');
        textVenue5.setText("Venue: " + value7 + value8 + value9);
    }
}