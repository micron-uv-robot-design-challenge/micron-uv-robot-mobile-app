package com.example.myplaces;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity{

    private Button btnForward, btnBackward, btnLeftward, btnRightward, btnStop;
    private Socket s;
    private PrintWriter writer;
    private TextView showText;
    private String message;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = (TextView) findViewById(R.id.showText);

        btnForward = findViewById(R.id.forward);
        btnBackward = findViewById(R.id.backward);
        btnLeftward = findViewById(R.id.leftward);
        btnRightward = findViewById(R.id.rightward);
        btnStop = findViewById(R.id.stop);

        btnForward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    message = "1";
                    Toast.makeText(MainActivity.this, "Going forward", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    message = "5";
                    Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                }
                return false;
            }
        });

        btnBackward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    message = "2";
                    Toast.makeText(MainActivity.this, "Going backward", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    message = "5";
                    Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                }
                return false;
            }
        });

        btnLeftward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    message = "3";
                    Toast.makeText(MainActivity.this, "Going anti-clockwise", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    message = "5";
                    Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                }
                return false;
            }
        });

        btnRightward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    message = "4";
                    Toast.makeText(MainActivity.this, "Going clockwise", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                    return true;
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    message = "5";
                    Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();
                    BackGroundTask b1 = new BackGroundTask();
                    b1.execute();
                }
                return false;
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "5";
                Toast.makeText(getApplicationContext(), "Stopping", Toast.LENGTH_SHORT).show();
                BackGroundTask b1 = new BackGroundTask();
                b1.execute();
            }
        });

    }


    class BackGroundTask extends AsyncTask<String, Void, Void> {

        Handler h = new Handler();
        @Override
        protected Void doInBackground(String... voids) {
            try {
                if(s == null){
                    //change it to your IP
                    s = new Socket("192.168.1.8",6000);
                    writer = new PrintWriter(s.getOutputStream());
                    Log.i("i", "CONNECTED");
                }
                double linear_x = 0.0;
                double angular_z = 0.0;
                writer.write(message);
                writer.flush();
                //writer.close();
                switch (message){
                    case "1":
                        linear_x += 1.0;
                    case "2":
                        linear_x -= 1.0;
                    case "3":
                        angular_z += 0.1;
                    case "4":
                        angular_z -= 0.1;
                }
                String linear_x_string = Double.toString(linear_x);
                String angular_z_string = Double.toString(angular_z);
                h.post(new Runnable() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void run() {
                        showText.setText("Linear velocities: " + linear_x_string + ", 0.0, 0.0" + "\n" + "Angular velocities: 0.0, 0.0, " + angular_z_string);
                    }
                });
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
