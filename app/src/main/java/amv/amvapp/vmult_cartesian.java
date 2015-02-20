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


public class vmult_cartesian extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vmult_cartesian);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vmult_cartesian, menu);
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

    public void vectorCart(View view) {
        // Creating a list which contains the EditText fields
        List<EditText> vectorComponents = new ArrayList<EditText>();

        // Obtained the EditText fields
        EditText x1 = (EditText) findViewById(R.id.vMultx1);
        EditText y1 = (EditText) findViewById(R.id.vMulty1);
        EditText x2 = (EditText) findViewById(R.id.vMultx2);
        EditText y2 = (EditText) findViewById(R.id.vMulty2);

        // Add all the EditText fields in the list
        vectorComponents.add(x1);
        vectorComponents.add(y1);
        vectorComponents.add(x2);
        vectorComponents.add(y2);

        // A placeholder to insert the numerical result on the screen.
        TextView result = (TextView) findViewById(R.id.displayResult);
        String vector = "";
        double component = 0;
        double ans = 0;
        double angle = 0;
        List<Double> xyComponents = new ArrayList<Double>();

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
        ans = vMultiplication(xyComponents.get(0), xyComponents.get(1), xyComponents.get(2), xyComponents.get(3));
        angle = angle(xyComponents.get(0), xyComponents.get(1), xyComponents.get(2), xyComponents.get(3));
        result.setText(String.format("Numerical Result: magnitude %.2f", ans));
    }

    public double vMultiplication(double x1, double y1, double x2, double y2) {
        double x, y, angle, ans;

        x = magnitude(x1, y1);
        y = magnitude(x2, y2);
        angle = angle(x1, y1, x2, y2);
        ans = x*y*Math.sin(angle);

        //return x1 * y2 - x2 * y1;
        return ans;
    }

    public double magnitude(double x, double y){
        return Math.sqrt(x*x + y*y);
    }

    public double angle(double x1, double y1, double x2, double y2){
        double dotProduct, x, y, cosAngle, angle;

        dotProduct = x1*x2 + y1*y2;
        x = magnitude(x1, y1);
        y = magnitude(x2, y2);

        cosAngle = dotProduct/(x*y);
        angle = Math.acos(cosAngle);

        return angle;
    }
}
