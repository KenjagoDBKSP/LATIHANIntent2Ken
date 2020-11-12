package id.ac.teknokrat.latihanintent2ken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activitykedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitykedua);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA MESSAGE");
        TextView textView = findViewById(R.id.displayed);
        textView.setText(message);
    }
}