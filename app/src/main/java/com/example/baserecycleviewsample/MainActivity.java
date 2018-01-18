package com.example.baserecycleviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.baserecycleviewsample.adapter.InfoAdapter;
import com.example.baserecycleviewsample.bean.DataBean;
import com.example.baserecycleviewsample.bean.Info;
import com.example.baserecycleviewsample.data.Data;
import com.example.baserecycleviewsample.utils.ConvertUtils;
import com.example.baserecycleviewsample.utils.GsonUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Info info;
    private InfoAdapter infoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        info = GsonUtils.getModelfromJson(Data.data, Info.class);
        List<DataBean> dataBeanList = ConvertUtils.getBean(info.getData());
        infoAdapter = new InfoAdapter(this, R.layout.item_content, R.layout.item_head, dataBeanList);

        setListener();
        mRecyclerView.setAdapter(infoAdapter);
    }

    private void setListener() {
        infoAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "内容被点击了", Toast.LENGTH_SHORT).show();
            }
        });
        infoAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "分类组被点击了", Toast.LENGTH_LONG).show();
            }
        });
    }
}
