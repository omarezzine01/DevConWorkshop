package com.liferay.screenscordova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import com.liferay.mobile.screens.util.LiferayLogger;
import com.liferay.mobile.screens.web.WebListener;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;

public class HybridGalleryActivity extends AppCompatActivity implements WebListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hybrid_gallery);

		WebScreenlet webScreenlet = (WebScreenlet) findViewById(R.id.web_screenlet_gallery);

		WebScreenletConfiguration configuration = new WebScreenletConfiguration
				.Builder("/web/guest/gallery")
				.addRawCss(R.raw.gallery_portlet_css, "gallery_portlet_css")
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
		LiferayLogger.d(namespace + body);
	}

	@Override
	public void error(Exception e, String userAction) {

	}
}
