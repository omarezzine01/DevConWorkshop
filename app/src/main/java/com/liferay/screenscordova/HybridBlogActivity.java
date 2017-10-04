package com.liferay.screenscordova;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.liferay.mobile.screens.viewsets.defaultviews.web.cordova.CordovaLifeCycleObserver;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;

public class HybridBlogActivity extends AppCompatActivity {

	CordovaLifeCycleObserver observer = new CordovaLifeCycleObserver();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hybrid_blog);

		WebScreenlet webScreenlet = (WebScreenlet) findViewById(R.id.web_screenlet_blog);

		WebScreenletConfiguration configuration =
			new WebScreenletConfiguration.Builder("/web/guest/test1?id=" + getString(R.string.blog_class_name))
				.enableCordova(observer)
				.addRawCss(R.raw.blog_css, "blog_css")
				.addRawJs(R.raw.blog_js, "blog_js")
				.load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.load();
	}

	@Override
	protected void onStart() {
		super.onStart();

		observer.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();

		observer.onStop();
	}

	@Override
	public void onPause() {
		super.onPause();

		observer.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();

		observer.onResume();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		observer.onDestroy();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		observer.onSaveInstanceState(outState);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		observer.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
		@NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);

		observer.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		observer.onConfigurationChanged(newConfig);
	}

}
