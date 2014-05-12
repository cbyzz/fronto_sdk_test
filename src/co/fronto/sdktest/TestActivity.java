package co.fronto.sdktest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import co.fronto.Fronto;

import com.example.fronto_sdk_test.R;


public class TestActivity extends Activity {
	protected static final String LOG_TAG = TestActivity.class.getSimpleName();
	private Button mbtn;
	protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        
        super.onCreate(savedInstanceState);    
        initLayout();
	}
	
	
	 public void initLayout() {
		 
			retrieveUiObjRefs();
			registerUiActionHandler();
	    }
	    
	
	
	
	private void retrieveUiObjRefs() {
		mbtn = (Button)findViewById(R.id.btn);
		
	}


	private void registerUiActionHandler() {
		mbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Fronto f= new Fronto(TestActivity.this, "app_id");
				f.sendActionCompleted();
				Log.i("LOG_TAG", "click");
			}    			
		});		
	}
}
