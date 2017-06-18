package com.example.mobilealbum;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

        albumlist.add(new AlbumItem("MEM",R.drawable.mem,"103","SAS",R.drawable.sas,"112"));
        albumlist.add(new AlbumItem("OKC",R.drawable.okc,"94","HOU",R.drawable.hou,"108"));

        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this, albumlist);

        lv = (ListView)findViewById(android.R.id.list);
        lv.setAdapter(adapter);
        setListAdapter(adapter);
    }

}
