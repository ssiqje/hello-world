package ssiqje.PlaneGame.mainView;

import ssiqje.PlaneGame.ObjectClass.MyManazine;
import ssiqje.PlaneGame.ObjectClass.MyPlane;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity{
	SurfaceView surfaceView;
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//surfaceView=(SurfaceView) findViewById(R.id.surface);
		button=(Button) findViewById(R.id.but);
		MyPlane myPlane=new MyPlane(new MyManazine());
		button.setOnTouchListener(myPlane);
		myPlane.shot();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
		
	
	
}
