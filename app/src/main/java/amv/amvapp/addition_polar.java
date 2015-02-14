package amv.amvapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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

    public void vectorAddPolar(View view) {

        // Creating a list which contains the EditText fields
        List<EditText> vectorComponents = new ArrayList<EditText>();

        // Obtained the EditText fields
        EditText vectorAddr1 = (EditText) findViewById(R.id.vectorAddx1);
        EditText vectorAddt1 = (EditText) findViewById(R.id.vectorAddy1);
        EditText vectorAddr2 = (EditText) findViewById(R.id.vectorAddx2);
        EditText vectorAddt2 = (EditText) findViewById(R.id.vectorAddy2);
        EditText vectorAddr3 = (EditText) findViewById(R.id.vectorAddx3);
        EditText vectorAddt3 = (EditText) findViewById(R.id.vectorAddy3);

        // Added all the EditText fields in the list
        vectorComponents.add(vectorAddr1);
        vectorComponents.add(vectorAddt1);
        vectorComponents.add(vectorAddr2);
        vectorComponents.add(vectorAddt2);

        // Obtained the radio buttons to check which button is selected
        RadioButton addTwo = (RadioButton) findViewById(R.id.addTwo);
        //RadioButton addThree = (RadioButton) findViewById(R.id.addThree);

        // A placeholder to insert the numerical result on the screen.
        TextView resultField = (TextView) findViewById(R.id.displayVectorAdd);
        String vector = "";
        double component = 0.0;
        double[] result = new double[2];
        List<Double> rtComponents = new ArrayList<Double>();

        if(addTwo.isChecked()) {
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
            result = vectorAddTwo(rtComponents.get(0), rtComponents.get(1), rtComponents.get(2), rtComponents.get(3));
        }
        resultField.setText(String.format(""));
        resultField.setText(String.format("Numerical Result: " + result[0] + " at " + result[1]));
    }

    /* Vector addition for two vectors in polar form
       Adding the x and y components of the two vectors for the resultant.
       Then, obtain thetha using the final x and y component values.
    */
    private double[] vectorAddTwo(double r1, double t1, double r2, double t2){

        double[] result = new double[2];

        double r1x = r1*Math.cos(t1);
        double r1y = r1*Math.sin(t1);
        double r2x = r2*Math.cos(t2);
        double r2y = r2*Math.sin(t2);

        double rx = r1x + r2x;
        double ry = r1y + r2y;

        double r = Math.sqrt(rx*rx + ry*ry);
        double t = Math.tan(ry/rx);

        result[0] = r;
        result[1] = t;

        return result;
    }
}
