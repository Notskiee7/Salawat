package noor.eid.salawat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity_SplashScreen extends AppCompatActivity {
    private ImageView IVtext;
    private ImageView IVlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        IVtext=findViewById(R.id.IVtext);
        IVlogo=findViewById(R.id.IVlogo);
    }
}
