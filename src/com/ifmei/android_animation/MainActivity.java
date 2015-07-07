package com.ifmei.android_animation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	Button button11;
	Button button12;
	Button button13;
	Button button14;
	Button button21;
	Button button22;
	Button button23;
	Button button24;
	Button button31;
	Button button32;
	Button button33;
	ImageView imageView41;
	Animation animation;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button21 = (Button)findViewById(R.id.button21);
        button22 = (Button)findViewById(R.id.button22);
        button23 = (Button)findViewById(R.id.button23);
        button24 = (Button)findViewById(R.id.button24);
        button31 = (Button)findViewById(R.id.button31);
        button32 = (Button)findViewById(R.id.button32);
        button33 = (Button)findViewById(R.id.button33);
        imageView41 = (ImageView) findViewById(R.id.iv41);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button11:{
				animation = AnimationUtils.loadAnimation(this, R.anim.scale);
				imageView41.startAnimation(animation);
				break;
			}
			case R.id.button12:{
				animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
				imageView41.startAnimation(animation);
				break;
			}
			case R.id.button13:{
				animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
				imageView41.startAnimation(animation);
				break;
			}
			case R.id.button14:{
				animation = AnimationUtils.loadAnimation(this, R.anim.translate);
				imageView41.startAnimation(animation);
				break;
			}
			case R.id.button21:{
				animation = AnimationUtils.loadAnimation(this, R.anim.translate);
				imageView41.startAnimation(animation);
				final Animation loadAnimation = AnimationUtils.loadAnimation(this,
						R.anim.rotate);
				animation.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation arg0) {
						imageView41.startAnimation(loadAnimation);
					}
				});
				break;
			}
			case R.id.button22:{
				animation = AnimationUtils.loadAnimation(this,R.anim.continue_anim);
				imageView41.startAnimation(animation);
				break;
			}
			case R.id.button23:{
				AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f,1.0f);
				alphaAnimation.setDuration(100);
				alphaAnimation.setRepeatCount(20);
				//µπ–Ú÷ÿ∏¥REVERSE   ’˝–Ú÷ÿ∏¥RESTART
				alphaAnimation.setRepeatMode(Animation.REVERSE);
				imageView41.startAnimation(alphaAnimation);
				break;
			}
			case R.id.button24:{
				RotateAnimation rotateAnimation = new RotateAnimation(3f, 0f);
				rotateAnimation.setDuration(50);
				rotateAnimation.setRepeatCount(30);
				rotateAnimation.setRepeatMode(RotateAnimation.REVERSE);
				imageView41.startAnimation(rotateAnimation);
				break;
			}
			case R.id.button31:{
				Intent intent = new Intent(MainActivity.this,MainActivity2.class);
				startActivity(intent);
				overridePendingTransition(R.anim.zoom_in,
						R.anim.zoom_out);
				break;
			}
			case R.id.button32:{
				Intent intent = new Intent(MainActivity.this,ListActivity.class);
				startActivity(intent);
				break;
			}
			case R.id.button33:{
				imageView41.setImageBitmap(null);
				imageView41.setBackgroundResource(R.drawable.anim_list);
				AnimationDrawable animationDrawable = (AnimationDrawable) imageView41.getBackground();
				animationDrawable.start();
				break;
			}
			default:{
				break;
			}
		}
	}
}































