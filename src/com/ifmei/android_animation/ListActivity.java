package com.ifmei.android_animation;

import java.util.ArrayList;
import java.util.List;

import android.R.animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listactivity);
        listView = (ListView) findViewById(R.id.list1);
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= 20; i++) {
			list.add("小伙伴"+i);
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
		listView.setAdapter(adapter);
		//定义布局动画控制器
		LayoutAnimationController lac = new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.zoom_in));
		//设置顺序
		lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
		listView.setLayoutAnimation(lac);
		listView.startLayoutAnimation();
	}
}

































