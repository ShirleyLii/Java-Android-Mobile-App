package com.example.shirley.project3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.CountDownTimer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    private ArrayAdapter<String> adapter;

    private View.OnClickListener startListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the buttons and views
        countdown = (EditText) findViewById(R.id.timeToCountText);
        countdownBtn = (Button) findViewById(R.id.countDownBtn);
        notification = (Spinner) findViewById(R.id.notificationSpinner);

        message = (EditText) findViewById(R.id.messageText);
        startCountdown = (Button) findViewById(R.id.startCountDownBtn);

        spinners = getResources().getStringArray(R.array.spinners);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinners);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        notification.setAdapter(adapter);

    }


    private Spinner notification;
    private EditText countdown;
    private Button countdownBtn;
    private EditText message;
    private Button startCountdown;
    private String[] spinners;
    List<String> spinner;

    private View.OnClickListener countdownListener;


}
