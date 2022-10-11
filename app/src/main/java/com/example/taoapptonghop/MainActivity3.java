package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.taoapptonghop.databinding.ActivityMain3Binding;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView listView;
        ArrayList<User> arrayList;
        ListAdapter adapter;

        listView =findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayList.add(new User("Nguyễn Cẩm Tú","Hà Nội",R.drawable.c));
        arrayList.add(new User("Trần Thảo Ngọc","Hải Phòng",R.drawable.b));
        arrayList.add(new User("Trần Ngọc Thảo","Hà Giang",R.drawable.a));
        arrayList.add(new User("Đỗ Thảo Nguyên","Quảng Trị",R.drawable.d));
        arrayList.add(new User("Trần Thu Trang","Quảng Bình",R.drawable.e));
        arrayList.add(new User("Lê Kim Chi","Nghệ An",R.drawable.f));
        arrayList.add(new User("Trần Phúc Ngân","Hà Tĩnh",R.drawable.g));

        adapter = new ListAdapter(MainActivity3.this,R.layout.list_item,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0) {
                    Intent intent= new Intent();
                    intent.setClass(MainActivity3.this,banbe_a.class);
                    startActivity(intent);
                }
            }
        });




    }
}