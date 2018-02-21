package goldsquadron.sunrise;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alButton;
    private Button cancelButton;


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

        /*cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelActivity();
            }
        });*/
    }

    public void openAlarmPage(){
        Intent intent = new Intent(this, alarmActivity.class);
        startActivity(intent);
    }

    /*public void cancelActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

}
