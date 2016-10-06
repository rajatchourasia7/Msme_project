package com.example.rajat_pc.msme_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Product product_data[] = new Product[]
                {
                        new Product("Arbitr", 1),
                        new Product("hgifeifh", 2),
                        new Product("geigfief", 3),
                        new Product("geiufgeigfei", 4),
                        new Product("heifheof", 5),
                        new Product("rgegvdegve", 2),
                        new Product("rgrgvrgvfrg", 3),
                        new Product("rbvrdgvgv", 3),
                        new Product("rdvdefvecfe", 4),
                        new Product("vrgvgdrvfrv", 5),
                        new Product("dvdve", 1),
                        new Product("vdvdefvefce", 2),
                        new Product("dvdecefedf", 3),
                        new Product("geiufgeigfei", 4),
                        new Product("heifheof", 5),
                        new Product("Arbitr", 1),
                        new Product("hgifeifh", 2),
                        new Product("geigfief", 3),
                        new Product("geiufgeigfei", 4),
                        new Product("heifheof", 5)
                };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductAdapter adapter = new ProductAdapter(this,R.layout.item_view,product_data);
        ListView listView = (ListView)findViewById(R.id.list_view1);
        View header = (View)getLayoutInflater().inflate(R.layout.list_view_header_row,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
    }

    /*public void showPopup(View v)
    {
        PopupMenu popup = new PopupMenu(this,v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.item_menu,popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.change_op:
                        Toast.makeText(MainActivity.this,"Change option selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.delete_op:
                        Toast.makeText(MainActivity.this,"Delete option selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        popup.show();
    }*/
}
