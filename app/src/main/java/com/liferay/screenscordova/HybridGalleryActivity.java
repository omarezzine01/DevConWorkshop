package com.liferay.screenscordova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;

public class HybridGalleryActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hybrid_gallery);

		WebScreenlet webScreenlet = (WebScreenlet) findViewById(R.id.web_screenlet_gallery);

		WebScreenletConfiguration configuration = new WebScreenletConfiguration
				.Builder("/web/guest/gallery")
				.load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.load();
	}
}
