package com.liferay.screenscordova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.liferay.mobile.screens.web.WebScreenlet;
import com.liferay.mobile.screens.web.WebScreenletConfiguration;

public class HybridBlogActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hybrid_blog);

		WebScreenlet webScreenlet = (WebScreenlet) findViewById(R.id.web_screenlet_blog);

		WebScreenletConfiguration configuration =
			new WebScreenletConfiguration.Builder("/web/guest/test1?id=50501")
				.addRawCss(R.raw.blog_css, "blog_css")
				.load();

		webScreenlet.setWebScreenletConfiguration(configuration);

		webScreenlet.load();
	}
}
