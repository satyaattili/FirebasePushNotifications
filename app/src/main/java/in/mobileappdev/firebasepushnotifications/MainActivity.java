package in.mobileappdev.firebasepushnotifications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static in.mobileappdev.firebasepushnotifications.fcm.MobileAppDevFirebaseMessagingService.KEY_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = (TextView) findViewById(R.id.textview) ;

        Intent recievedIntent = getIntent();

        if(recievedIntent != null){
            String msg = recievedIntent.getStringExtra(KEY_MESSAGE);
            if(msg != null){
                result.setText(msg);
            }

        }
    }
}
