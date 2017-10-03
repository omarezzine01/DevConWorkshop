package com.liferay.screenscordova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.liferay.mobile.screens.cache.CachePolicy;
import com.liferay.mobile.screens.context.PicassoScreens;

public class GalleryDetailActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallery_detail);

		PicassoScreens.setCachePolicy(CachePolicy.REMOTE_FIRST);

		String imageUrl = getIntent().getStringExtra("imageUrl");

		ImageView imageView = (ImageView) findViewById(R.id.image_detail);

		PicassoScreens.load(imageUrl).into(imageView);
	}
}
