package com.liferay.screenscordova;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.liferay.mobile.screens.web.WebListener;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;

public class HybridGalleryActivity extends AppCompatActivity implements WebListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hybrid_gallery);

		WebScreenlet webScreenlet = (WebScreenlet) findViewById(R.id.web_screenlet_gallery);

		WebScreenletConfiguration configuration =
			new WebScreenletConfiguration.Builder("/web/guest/gallery").addRawCss(
				R.raw.gallery_portlet_css, "gallery_portlet_css")
				.addRawJs(R.raw.gallery_portlet_js, "gallery_portlet_js")
				.load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.setListener(this);

		webScreenlet.load();
	}

	@Override
	public void onPageLoaded(String url) {

	}

	@Override
	public void onScriptMessageHandler(String namespace, String body) {
		Intent intent = new Intent(this, GalleryDetailActivity.class);
		intent.putExtra("imageUrl", body);

		startActivity(intent);
	}

	@Override
	public void error(Exception e, String userAction) {

	}
}
