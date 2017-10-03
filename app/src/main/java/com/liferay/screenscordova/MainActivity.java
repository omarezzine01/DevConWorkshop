
package com.liferay.screenscordova;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;
import com.liferay.mobile.screens.util.LiferayLogger;

public class MainActivity extends Activity implements LoginListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login_screenlet);

		loginScreenlet.setListener(this);

		((EditText) findViewById(R.id.liferay_password)).setText("test");
		((EditText) findViewById(R.id.liferay_login)).setText("test@liferay.com");
	}

	@Override
	public void onLoginSuccess(User user) {
		LiferayLogger.d("login correct");
	}

	@Override
	public void onLoginFailure(Exception e) {
		LiferayLogger.e("login error", e);
	}
}
