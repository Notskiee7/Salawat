package noor.eid.salawat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity_Splash_Screen extends AppCompatActivity {
    private ImageView IVtext;
    private ImageView IVlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        IVtext=findViewById(R.id.IVtext);
        IVlogo=findViewById(R.id.IVlogo);
        // thread:1
        Thread th=new Thread(){
            //thread:2
            @Override
            public void run() {
                //هنا المقطع الذي سيعمل بالتزامن مع المقاطع
                //thread:3
                int ms=3*1000;
                try {
                    sleep(ms);
                    startActivity(new Intent(getApplicationContext(),Activity_SignUp.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        //thread:4
        th.start();

    }
}
