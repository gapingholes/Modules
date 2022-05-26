package sg.edu.rp.c346.id21010650.modules;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textWeb;
    TextView textProgram;
    TextView textSoftware;
    TextView textUI;
    TextView textMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWeb = findViewById(R.id.textWeb);
        textProgram = findViewById(R.id.textProgram);
        textSoftware = findViewById(R.id.textSoftware);
        textUI = findViewById(R.id.textUI);
        textMobile = findViewById(R.id.textMobile);

    textWeb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, C203.class);
        startActivity(intent);

    textProgram.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, C105.class);
        startActivity(intent);

    textSoftware.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, C206.class);
        startActivity(intent);

    textUI.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, C218.class);
        startActivity(intent);

    textMobile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, C346.class);
        startActivity(intent);

        setContentView(R.layout.activity_main);
    }
} );}} );}} );}} );}} );}}