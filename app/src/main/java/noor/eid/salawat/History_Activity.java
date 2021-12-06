package noor.eid.salawat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class History_Activity extends AppCompatActivity {
    private SearchView SVHistory;
    private ListView LThistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        SVHistory=findViewById(R.id.SVHistory);
        LThistory=findViewById(R.id.LThistory);
    }
}