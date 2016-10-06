package com.example.rajat_pc.msme_project;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RAJAT-PC on 01-10-2016.
 */
public class ProductAdapter extends ArrayAdapter<Product> {
    Context context;
    int resource_id;
    Product data[] = null;

    public ProductAdapter(Context context1,int rid,Product[] d)
    {
        super(context1,rid,d);
        this.context = context1;
        this.resource_id = rid;
        this.data = d;
    }

    public String getPid(int position)
    {
        Product prod = data[position];
        return prod.pid;
    }
    @Override
    public View getView(final int Position, View convert_view, ViewGroup parent)
    {
        View row = convert_view;
        ProductHolder holder = null;
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(resource_id, parent, false);

            holder = new ProductHolder();
            holder.product_id = (TextView)row.findViewById(R.id.list_item_id);
            holder.product_quantity = (TextView)row.findViewById(R.id.list_item_quantity);
            holder.pop_btn = (ImageButton)row.findViewById(R.id.list_item_btn);
            row.setTag(holder);
        }
        else
        {
            holder = (ProductHolder)row.getTag();
        }
        Product prod = data[Position];
        try {
            holder.product_id.setText(prod.pid);
            holder.product_quantity.setText(prod.quantity.toString());
            holder.pop_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popup = new PopupMenu(getContext(),v);
                    MenuInflater inflater = popup.getMenuInflater();
                    inflater.inflate(R.menu.item_menu,popup.getMenu());
                    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId())
                            {
                                case R.id.change_op:
                                    Toast.makeText(getContext(),"Change option selected for "+getPid(Position)+".", Toast.LENGTH_SHORT).show();
                                    break;
                                case R.id.delete_op:
                                    Toast.makeText(getContext(),"Delete option selected for "+getPid(Position)+".", Toast.LENGTH_SHORT).show();
                                    break;
                            }
                            return true;
                        }
                    });
                    popup.show();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        return row;
    }

    public class ProductHolder{
        TextView product_id;
        TextView product_quantity;
        ImageButton pop_btn;
    }

}
