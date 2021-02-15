package com.example.just4u;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import static android.view.LayoutInflater.from;

public class HomeActivity extends AppCompatActivity {
    private final String CHANNEL_ID = "Personal_Notification";
    private final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void displayNotification(View View){
        createNotificationChannel();
        Intent HomePageIntent =  new Intent(this,HopePageActivity.class);
        HomePageIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent HomePagePendingIntent = PendingIntent.getActivity(this,0,HomePageIntent,PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,CHANNEL_ID );
        builder.setSmallIcon(R.drawable.ic_sms_24);
        builder.setContentTitle("Simple Notification");
        builder.setContentText("This is a Simple Notification");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setContentIntent(HomePagePendingIntent);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID,builder.build());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void createNotificationChannel(){
        CharSequence name = "Personal Notification";
        String description = "Include all the Personal Notification";
        int importance = NotificationManager.IMPORTANCE_DEFAULT;

        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,name,importance);
        notificationChannel.setDescription(description);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(notificationChannel);
    }
}