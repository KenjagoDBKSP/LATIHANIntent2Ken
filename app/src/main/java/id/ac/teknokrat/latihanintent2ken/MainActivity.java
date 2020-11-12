package id.ac.teknokrat.latihanintent2ken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calling (View view){
        String no = "081385401973";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",no,null));
        startActivity(panggil);
    }

    public void gotoWebsite(View view){
        String url = "http://www.vetindo.com/";
        Intent openSpada = new Intent(Intent.ACTION_VIEW);
        openSpada.setData(Uri.parse(url));
        startActivity(openSpada);
    }

    public void sendData (View view){
        EditText editText = findViewById(R.id.UserMessage);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, activitykedua.class);
        intent.putExtra("EXTRA MESSAGE", message);
        startActivity(intent);
    }

    public void map(View view) {
        Uri linkmap = Uri.parse("google.navigation:q=-5.3832459,105.2775215");
        Intent intent = new Intent(Intent.ACTION_VIEW,linkmap);
        startActivity(intent);
    }

    public void gotoWA(View view) {
        Uri linkWA = Uri.parse("https://api.whatsapp.com/send?phone=+6281385401973");
        Intent intent = new Intent(Intent.ACTION_VIEW,linkWA);
        startActivity(intent);
    }

    public void gotoFAQ(View view) {
        Uri linkfaq = Uri.parse("http://www.vetindo.com/hubungi-kami.html");
        Intent intent = new Intent(Intent.ACTION_VIEW,linkfaq);
        startActivity(intent);
    }
}