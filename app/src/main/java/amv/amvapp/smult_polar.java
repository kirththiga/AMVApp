package amv.amvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class smult_polar extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smult_polar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_smult_polar, menu);
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

    public void scalarPolar(View view) {
        // Creating a list which contains the EditText fields
        List<EditText> vectorComponents = new ArrayList<EditText>();

        // Obtained the EditText fields
        EditText r1 = (EditText) findViewById(R.id.sMultr1);
        EditText t1 = (EditText) findViewById(R.id.sMultt1);
        EditText r2 = (EditText) findViewById(R.id.sMultr2);
        EditText t2 = (EditText) findViewById(R.id.sMultt2);

        // Add all the EditText fields in the list
        vectorComponents.add(r1);
        vectorComponents.add(t1);
        vectorComponents.add(r2);
        vectorComponents.add(t2);

        // A placeholder to insert the numerical result on the screen.
        TextView result = (TextView) findViewById(R.id.displayResult);
        String vector = "";
        double component = 0;
        double ans = 0.0;
        List<Double> rtComponents = new ArrayList<Double>();

        for (EditText vectorField : vectorComponents) {
            if (vectorField.getText().toString().isEmpty()) {
                result.setText(String.format("Numerical Result:"));
                Toast.makeText(this, "Enter values for empty fields", Toast.LENGTH_SHORT).show();
                return;
            } else {
                // Convert the contents from the input fields as a string
                vector = vectorField.getText().toString();
                component = Double.parseDouble(vector);
                rtComponents.add(component);
            }
        }
        ans = sMultiplication(rtComponents.get(0), rtComponents.get(1), rtComponents.get(2), rtComponents.get(3));
        result.setText(String.format("Numerical Result: %.2f", ans));
    }

    private double sMultiplication(Double r1, Double t1, Double r2, Double t2) {
        double ans, x1, x2, y1, y2;

        x1 = r1 * Math.cos(Math.toRadians(t1));
        x2 = r2 * Math.cos(Math.toRadians(t2));
        y1 = r1 * Math.sin(Math.toRadians(t1));
        y2 = r2 * Math.sin(Math.toRadians(t2));

        ans = x1 * x2 + y1 * y2;

        return ans;
    }
}
