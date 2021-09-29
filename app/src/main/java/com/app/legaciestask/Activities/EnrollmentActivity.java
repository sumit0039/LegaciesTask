package com.app.legaciestask.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.legaciestask.R;
import com.app.legaciestask.databinding.ActivityEnrollmentBinding;

public class EnrollmentActivity extends BaseActivity<ActivityEnrollmentBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_enrollment;
    }

    @Override
    protected int getNavigationMenuItemId() {
        return R.id.nav_enrollment;
    }
}