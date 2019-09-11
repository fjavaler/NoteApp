package com.frederickjavalera.www;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.List;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        // Creates a spinner
        Spinner spinnerCourses = findViewById(R.id.spinner_courses);
        // Gets a list of courses
        List<CourseInfo> courses = DataManager.getInstance().getCourses();
        // Creates an adapter (a spinner needs an adapter)
        ArrayAdapter<CourseInfo> adapterCourses = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);
        // Sets the layout resource to create the drop down views. (from documentation)
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Connects the adapter to the spinner.
        spinnerCourses.setAdapter(adapterCourses);
        
    }


}
