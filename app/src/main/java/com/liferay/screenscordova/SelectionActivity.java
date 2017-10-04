package com.liferay.screenscordova;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selection);

		findViewById(R.id.native_gallery_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SelectionActivity.this, NativeGalleryActivity.class));
			}
		});

		findViewById(R.id.hybrid_gallery_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SelectionActivity.this, HybridGalleryActivity.class));
			}
		});

		findViewById(R.id.native_blog_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SelectionActivity.this, NativeBlogActivity.class));
			}
		});

		findViewById(R.id.hybrid_blog_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SelectionActivity.this, HybridBlogActivity.class));
			}
		});
	}
}
