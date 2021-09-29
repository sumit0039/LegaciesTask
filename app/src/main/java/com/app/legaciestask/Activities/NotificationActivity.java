package com.app.legaciestask.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.legaciestask.R;
import com.app.legaciestask.databinding.ActivityNotificationBinding;

public class NotificationActivity extends BaseActivity<ActivityNotificationBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_notification;
    }

    @Override
    protected int getNavigationMenuItemId() {
        return R.id.nav_notification;
    }
}