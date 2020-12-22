package com.example.lap_app_passio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView img_thongtin,img_qua, img_map,img_thongbao;
    FloatingActionButton floatting1;
    private  RecyclerView rc1;
    private  RCV_AdapterViewHolder rcv_adapterViewHolder;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_thongtin= (ImageView)findViewById(R.id.thongtin);
        img_thongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,trang2_activity.class);
                 startActivity(intent);
            }
        });

        img_qua= (ImageView)findViewById(R.id.qua);
        img_qua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,trang2_activity.class);
                startActivity(intent2);
            }
        });

        floatting1 = (FloatingActionButton)findViewById(R.id.btn_mua_trasua);
        floatting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity.this,trang2_activity.class);
                startActivity(intent3);
            }
        });


        rc1 =findViewById( R.id.rcv1_home );
        rc1.setHasFixedSize(  true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( context, RecyclerView.VERTICAL,false );
        rc1.setLayoutManager( linearLayoutManager );
        rcv_adapterViewHolder=new RCV_AdapterViewHolder();
        rcv_adapterViewHolder.setData(getListMonAn() );
        rc1.setAdapter( rcv_adapterViewHolder );

    }

    private  List<RCV_View>getListMonAn (){
        List<RCV_View> list_MonAn = new ArrayList<>(  );
        list_MonAn.add( new RCV_View( "Nhận ngay ưu đã", "Khuyến mãi đến 50%" ,R.drawable.km2 ));
        list_MonAn.add( new RCV_View( "Nhận ngay ưu đã", "Khuyến mãi đến 50%" ,R.drawable.km2 ));
        list_MonAn.add( new RCV_View( "Nhận ngay ưu đã", "Khuyến mãi đến 50%" ,R.drawable.km2 ));
        list_MonAn.add( new RCV_View( "Nhận ngay ưu đã", "Khuyến mãi đến 50%" ,R.drawable.km2 ));
        return list_MonAn;
    }


}