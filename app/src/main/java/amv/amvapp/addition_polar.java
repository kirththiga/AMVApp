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


public class addition_polar extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_polar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_addition_polar, menu);
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

    public void vectorAddPolar(View view) {

        // Creating a list which contains the EditText fields
        List<EditText> vectorComponents = new ArrayList<EditText>();

        // Obtained the EditText fields
        EditText vectorAddr1 = (EditText) findViewById(R.id.vectorAddr1);
        EditText vectorAddt1 = (EditText) findViewById(R.id.vectorAddt1);
        EditText vectorAddr2 = (EditText) findViewById(R.id.vectorAddr2);
        EditText vectorAddt2 = (EditText) findViewById(R.id.vectorAddt2);
        EditText vectorAddr3 = (EditText) findViewById(R.id.vectorAddr3);
        EditText vectorAddt3 = (EditText) findViewById(R.id.vectorAddt3);

        // Added all the EditText fields in the list
        vectorComponents.add(vectorAddr1);
        vectorComponents.add(vectorAddt1);
        vectorComponents.add(vectorAddr2);
        vectorComponents.add(vectorAddt2);

        // Obtained the radio buttons to check which button is selected
        RadioButton addTwo = (RadioButton) findViewById(R.id.addTwo);
        //RadioButton addThree = (RadioButton) findViewById(R.id.addThree);

        // A placeholder to insert the numerical result on the screen.
        TextView resultField = (TextView) findViewById(R.id.displayResult);
        String vector = "";
        double component = 0.0;
        double[] result = new double[2];
        List<Double> rtComponents = new ArrayList<Double>();

        if (addTwo.isChecked()) {
            // Iterating over the list to check for empty fields and display a message
            for (EditText vectorField : vectorComponents) {
                if (vectorField.getText().toString().isEmpty()) {
                    resultField.setText(String.format("Numerical Result:"));
                    Toast.makeText(this, "Enter values for empty fields", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    // Convert the contents from the input fields as a string
                    vector = vectorField.getText().toString();
                    component = Double.parseDouble(vector);
                    rtComponents.add(component);
                }
            }
            // Computed the result
            result = vectorPolarAddTwo(rtComponents.get(0), rtComponents.get(1), rtComponents.get(2), rtComponents.get(3));

        } else {
            vectorComponents.add(vectorAddr3);
            vectorComponents.add(vectorAddt3);

            for (EditText vectorField : vectorComponents) {
                // Iterating over the list to check for empty fields and display a message
                if (vectorField.getText().toString().isEmpty()) {
                    resultField.setText(String.format("Numerical Result:"));
                    Toast.makeText(this, "Enter values for empty fields", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    // Convert the contents from the input fields as a string
                    vector = vectorField.getText().toString();
                    component = Double.parseDouble(vector);
                    rtComponents.add(component);
                }
            }
            // Computed the result
            result = vectorPolarAddThree(rtComponents.get(0), rtComponents.get(1), rtComponents.get(2),
                    rtComponents.get(3), rtComponents.get(4), rtComponents.get(5));

        }
        resultField.setText(String.format(""));
        resultField.setText(String.format("Numerical Result: %.2f at %.2f", result[0], result[1]));
    }

    /* Vector addition for two vectors in polar form
       Adding the x and y components of the two vectors for the resultant.
       Then, obtain thetha using the final x and y component values.
    */
    private double[] vectorPolarAddTwo(double r1, double t1, double r2, double t2) {
        double r1x, r1y, r2x, r2y, rx, ry, r, t;
        double[] result = new double[2];

        r1x = r1 * Math.cos(Math.toRadians(t1));
        r1y = r1 * Math.sin(Math.toRadians(t1));
        r2x = r2 * Math.cos(Math.toRadians(t2));
        r2y = r2 * Math.sin(Math.toRadians(t2));

        rx = r1x + r2x;
        ry = r1y + r2y;

        r = Math.sqrt(rx * rx + ry * ry);
        t = Math.atan(ry / rx);

        result[0] = r;
        result[1] = Math.toDegrees(t);

        return result;
    }

    private double[] vectorPolarAddThree(double r1, double t1, double r2, double t2, double r3, double t3) {
        double r1x, r1y, r2x, r2y, r3x, r3y, rx, ry, r, t;
        double[] result = new double[2];

        r1x = r1 * Math.cos(Math.toRadians(t1));
        r1y = r1 * Math.sin(Math.toRadians(t1));
        r2x = r2 * Math.cos(Math.toRadians(t2));
        r2y = r2 * Math.sin(Math.toRadians(t2));
        r3x = r3 * Math.cos(Math.toRadians(t3));
        r3y = r3 * Math.sin(Math.toRadians(t3));

        rx = r1x + r2x + r3x;
        ry = r1y + r2y + r3y;

        r = Math.sqrt(rx * rx + ry * ry);
        t = Math.atan(ry / rx);

        result[0] = r;
        result[1] = t;

        return result;
    }
}
