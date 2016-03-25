package ssiqje.PlaneGame.ObjectClass;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import ssiqje.PlaneGame.BaseClass.BaseMagazine;
import ssiqje.PlaneGame.BaseClass.BasePlance;

public class MyPlane extends BasePlance implements OnTouchListener{

	public MyPlane(BaseMagazine Magazine) {
		super(Magazine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(float f,float g) {
		// TODO Auto-generated method stub
		Log.i("info", "我在移动"+f+"~~"+g);
		setX(f);
		setY(g);

	}

	@Override
	public void shot() {
		// TODO Auto-generated method stub
		Log.i("info", "我在射击");
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		if(arg1.getAction()==MotionEvent.ACTION_DOWN)
			Log.i("info", "按下");
		if(arg1.getAction()==MotionEvent.ACTION_MOVE)
			move(arg1.getX(),arg1.getY());
			
		return true;
	}

}
