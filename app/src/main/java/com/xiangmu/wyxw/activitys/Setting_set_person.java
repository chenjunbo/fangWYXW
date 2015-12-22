package com.xiangmu.wyxw.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiangmu.wyxw.R;
import com.xiangmu.wyxw.Setting_Utils.SearchDB;
import com.xiangmu.wyxw.conent_frament.SheZhiFrament;

/**
 * Created by Administrator on 2015/12/12.
 * 用户信息设置页面
 */
public class Setting_set_person extends AppCompatActivity implements View.OnClickListener{
    private ImageView backsetting;//返回到设置
    private TextView email;//邮箱
    private Button quit;//退出
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hgz_personalset);
        initView();
    }
    //初始化控件
    private void initView() {
        backsetting = (ImageView) findViewById(R.id.backsetting);
        email= (TextView) findViewById(R.id.email);
        quit= (Button) findViewById(R.id.quit);
        listener();
    }
    //设置监听
    private void listener() {
        backsetting.setOnClickListener(this);
        email.setOnClickListener(this);
        quit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backsetting://返回到设置页面
                Intent intent = new Intent(this, Setting_set_page.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                finish();
                break;
            case R.id.email://设置邮箱
                String userName = SearchDB.createDb(this, "userName");
                if (userName!=null){
                    email.setText(userName);
                }
                break;
            case R.id.quit://退出
                SearchDB.removeDb(getSharedPreferences("hgz", Context.MODE_PRIVATE));
                SheZhiFrament.handle.sendEmptyMessage(1);
                finish();
                break;
        }
    }
}
