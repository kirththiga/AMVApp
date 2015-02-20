package amv.amvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class addition_cartesian extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_cartesian);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_addition_cartesian, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void returnMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addCart(View view) {

        // Creating a list which contains the EditText fields
        List<EditText> vectorComponents = new ArrayList<EditText>();

        // Obtained the EditText fields
        EditText vectorAddx1 = (EditText) findViewById(R.id.vectorAddx1);
        EditText vectorAddy1 = (EditText) findViewById(R.id.vectorAddy1);
        EditText vectorAddx2 = (EditText) findViewById(R.id.vectorAddx2);
        EditText vectorAddy2 = (EditText) findViewById(R.id.vectorAddy2);
        EditText vectorAddx3 = (EditText) findViewById(R.id.vectorAddx3);
        EditText vectorAddy3 = (EditText) findViewById(R.id.vectorAddy3);

        // Added all the EditText fields in the list
        vectorComponents.add(vectorAddx1);
        vectorComponents.add(vectorAddy1);
        vectorComponents.add(vectorAddx2);
        vectorComponents.add(vectorAddy2);

        // Obtained the radio buttons to check which button is selected
        RadioButton addTwo = (RadioButton) findViewById(R.id.addTwo);
        //RadioButton addThree = (RadioButton) findViewById(R.id.addThree);

        // A placeholder to insert the numerical result on the screen.
        TextView result = (TextView) findViewById(R.id.displayResult);
        String vector = "";
        double component = 0.0;
        double x = 0.0;
        double y = 0.0;
        List<Double> xyComponents = new ArrayList<Double>();

        if (addTwo.isChecked()) {
            // Iterating over the list to check for empty fields and display a message
            for (EditText vectorField : vectorComponents) {
                if (vectorField.getText().toString().isEmpty()) {
                    result.setText(String.format("Numerical Result:"));
                    Toast.makeText(this, "Enter values for empty fields", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    // Convert the contents from the input fields as a string
                    vector = vectorField.getText().toString();
                    component = Double.parseDouble(vector);
                    xyComponents.add(component);
                }
            }

            // Computed the result
            x = vectorAddTwo(xyComponents.get(0), xyComponents.get(2));
            y = vectorAddTwo(xyComponents.get(1), xyComponents.get(3));

        } else {
            vectorComponents.add(vectorAddx3);
            vectorComponents.add(vectorAddy3);

            for (EditText vectorField : vectorComponents) {
                // Iterating over the list to check for empty fields and display a message
                if (vectorField.getText().toString().isEmpty()) {
                    result.setText(String.format("Numerical Result:"));
                    Toast.makeText(this, "Enter values for empty fields", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    // Convert the contents from the input fields as a string
                    vector = vectorField.getText().toString();
                    component = Double.parseDouble(vector);
                    xyComponents.add(component);
                }
            }
            // Computed the result
            x = vectorAddThree(xyComponents.get(0), xyComponents.get(2), xyComponents.get(4));
            y = vectorAddThree(xyComponents.get(1), xyComponents.get(3), xyComponents.get(5));
        }

        result.setText(String.format(""));
        result.setText(String.format("Numerical Result: (%.2f, %.2f)", x, y));

    }

    /* Vector addition for two vectors
       Adding the x components of the two vectors for the resultant.
       Same process for y components.
     */
    private double vectorAddTwo(double x1, double x2) {

        double x = x1 + x2;
        return x;
    }

    /* Vector addition for three vectors
       Adding the x components of the three vectors for the resultant.
       Same process for y components.
    */
    private double vectorAddThree(double x1, double x2, double x3) {

        double x = x1 + x2 + x3;
        return x;
    }

}
