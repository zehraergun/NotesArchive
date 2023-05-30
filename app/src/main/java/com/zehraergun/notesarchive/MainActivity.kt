package com.zehraergun.notesarchive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

     RecyclerView recyclerView;
     FloatingActionButton add_button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener();

        public void onClick(View view) {
            Intent intent = new Intent(pacageContext MainActivity.this, AddActivitiy.Class);
            startActivity(intent )
        }
         );
    }
}