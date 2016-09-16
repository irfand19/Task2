package irfandp.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Contact extends BaseActivity {
    String[] products = new String[] {"Windows", "OSX", "Ubuntu"};
    RecyclerView rv_products;
    RecyclerView.Adapter rv_adapter;
    RecyclerView.LayoutManager rv_layout_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ////--------Code Recycleview--------

        rv_products = (RecyclerView) findViewById(R.id.rv_products);
        rv_products.setHasFixedSize(true);
        rv_layout_manager = new LinearLayoutManager(this);
        rv_products.setLayoutManager(rv_layout_manager);
        rv_adapter = new MyAdapter(products);
        rv_products.setAdapter(rv_adapter);

        ////-------end recycleview--------
    }






    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private String[] ds_products;
        public class ViewHolder extends RecyclerView.ViewHolder {
            public CardView cv_products;
            public TextView tv_product;
            public ViewHolder(View v) {
                super(v);
                cv_products = (CardView) v.findViewById(R.id.cv_products);
                tv_product = (TextView) v.findViewById(R.id.tv_product);
            }
        }

        public MyAdapter(String[] dataset) {
            ds_products = dataset;
        }

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_product, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.tv_product.setText(ds_products[position]);
        }

        @Override
        public int getItemCount() {
            return ds_products.length;
        }
    }

    @Override
    protected int setLayoutResourceIdentifier() {
        return R.layout.activity_contact;
    }
}
