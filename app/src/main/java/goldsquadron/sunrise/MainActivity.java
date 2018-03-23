package goldsquadron.sunrise;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alButton;
    private Button btButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alButton = (Button) findViewById(R.id.alButton);
        alButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlarmPage();
            }
        });
        btButton = (Button) findViewById(R.id.roomButton);
        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBluetoothPage();
            }
        });

    }

    public void openAlarmPage(){
        Intent intent = new Intent(this, alarmActivity.class);
        startActivity(intent);
    }

    public void openBluetoothPage(){
        Intent intent = new Intent(this, btTest.class);
        startActivity(intent);
    }

}
