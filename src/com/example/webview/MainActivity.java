package com.example.webview;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String url = "www.x3cn.com";
	private WebView webView;
	private ProgressDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Uri uri = Uri.parse(url);
		//Intent intent = new Intent (Intent.ACTION_VIEW,uri);
		//startActivity(intent);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		webView = (WebView) findViewById(R.id.webView);
		webView.loadUrl("http://www.baidu.com");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			if(webView.canGoBack())
			{
				Toast.makeText(this, webView.getUrl(), Toast.LENGTH_SHORT).show();
				webView.goBack();
				return true;
				
			}
			else
			{
				System.exit(0);
				
			}
		}
		return super.onKeyDown(keyCode, event);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
