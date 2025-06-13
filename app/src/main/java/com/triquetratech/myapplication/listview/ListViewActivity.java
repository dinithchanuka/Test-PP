package com.triquetratech.myapplication.listview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.triquetratech.myapplication.R;
import com.triquetratech.myapplication.data.model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<ListItem> listItems = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            ListItem item = new ListItem("Title " + i, "Sub Title " + i);
            listItems.add(item);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListItemAdapter adapter = new ListItemAdapter(listItems);
        recyclerView.setAdapter(adapter);
    }
}