package com.app.legaciestask.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.app.legaciestask.Adapter.EventAdapter;
import com.app.legaciestask.R;
import com.app.legaciestask.databinding.ActivityEventsBinding;

public class EventsActivity extends BaseActivity<ActivityEventsBinding> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.contentDashBoard.recyclerView.setHasFixedSize(true);
        binding.contentDashBoard.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.contentDashBoard.recyclerView.setAdapter(new EventAdapter());
        binding.contentDashBoard.recyclerScroller.attachRecyclerView(binding.contentDashBoard.recyclerView);

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_events;
    }

    @Override
    protected int getNavigationMenuItemId() {
        return R.id.nav_event;
    }
}