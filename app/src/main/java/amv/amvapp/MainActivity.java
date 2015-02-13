package amv.amvapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /** Called when the user clicks the Next button */
    public void nextSelection(View view) {
        // Need to check which radio buttons are clicked and switch to that activity page.
        RadioButton vectorAdd = (RadioButton) findViewById(R.id.vectorAdd);
        RadioButton scalarMult = (RadioButton) findViewById(R.id.scarMult);
        RadioButton vectorMult = (RadioButton) findViewById(R.id.vectorMult);
        RadioButton cartesian = (RadioButton) findViewById(R.id.cartesian);
        RadioButton polar = (RadioButton) findViewById(R.id.polar);

        if(vectorAdd.isChecked() && cartesian.isChecked()) {
            Intent intent = new Intent(this, addition_cartesian.class);
            startActivity(intent);
        } else if(vectorAdd.isChecked() && polar.isChecked()) {
            Intent intent = new Intent(this, addition_polar.class);
            startActivity(intent);
        } else if(scalarMult.isChecked() && cartesian.isChecked()) {
            Intent intent = new Intent(this, smult_cartesian.class);
            startActivity(intent);
        } else if(scalarMult.isChecked() && polar.isChecked()) {
            Intent intent = new Intent(this, smult_polar.class);
            startActivity(intent);
        } else if(vectorMult.isChecked() && cartesian.isChecked()) {
            Intent intent = new Intent(this, vmult_cartesian.class);
            startActivity(intent);
        } else if(vectorMult.isChecked() && polar.isChecked()) {
            Intent intent = new Intent(this, vmult_polar.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
