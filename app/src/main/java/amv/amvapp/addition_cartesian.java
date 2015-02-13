package amv.amvapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


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

    public void vectorAdd(View view){

        // Convert the contents from the input fields as a string
        EditText vectorAddx1 = (EditText) findViewById(R.id.vectorAddx1);
        EditText vectorAddy1 = (EditText) findViewById(R.id.vectorAddy1);
        EditText vectorAddx2 = (EditText) findViewById(R.id.vectorAddx2);
        EditText vectorAddy2 = (EditText) findViewById(R.id.vectorAddy2);
        EditText vectorAddx3 = (EditText) findViewById(R.id.vectorAddx3);
        EditText vectorAddy3 = (EditText) findViewById(R.id.vectorAddy3);

        String vectorx1 = vectorAddx1.getText().toString();
        String vectory1 = vectorAddy1.getText().toString();
        String vectorx2 = vectorAddx2.getText().toString();
        String vectory2 = vectorAddy2.getText().toString();
        String vectorx3 = vectorAddx3.getText().toString();
        String vectory3 = vectorAddy3.getText().toString();

        int x1 = Integer.parseInt(vectorx1);
        int y1 = Integer.parseInt(vectory1);
        int x2 = Integer.parseInt(vectorx2);
        int y2 = Integer.parseInt(vectory2);
        int x3 = Integer.parseInt(vectorx3);
        int y3 = Integer.parseInt(vectory3);

        int x = vectorAddTwo(x1,x2);
        int y = vectorAddTwo(y1, y2);
        TextView result = (TextView) findViewById(R.id.displayVectorAdd);
        result.setText(String.format(""));
        result.setText(String.format("Your result will be %d %d",x , y));
    }

    /* Vector addition for two vectors
       Adding the x components of the two vectors for the resultant.
       Same process for y components.
     */
    public int vectorAddTwo(int x1, int x2){
        int x = 0;
            x = x1 + x2;
        return x;
    }

    public int vectorAddThree(int x1, int x2, int x3){
        int x = 0;
        x = x1 + x2 + x3;
        return x;
    }
}
