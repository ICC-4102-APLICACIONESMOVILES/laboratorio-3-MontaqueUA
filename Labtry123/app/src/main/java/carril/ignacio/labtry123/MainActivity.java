package carril.ignacio.labtry123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.text.Layout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView user_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent log = new Intent (this, LoginActivity.class);
        startActivityForResult(log, 1);
        user_data = (TextView)findViewById(R.id.textView);
    }

    protected void onStart(Bundle savedInstanceState) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        String user_data_string = data.getStringExtra("valueId");
        user_data.setText(user_data_string);
    }
}

