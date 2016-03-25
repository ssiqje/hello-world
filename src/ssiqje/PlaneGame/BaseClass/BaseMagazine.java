package ssiqje.PlaneGame.BaseClass;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMagazine 
{
	private int BulletCount;
	private List<Basebullet> BulletSpace;
	public BaseMagazine() {
		// TODO Auto-generated constructor stub
		BulletCount=0;
		BulletSpace= new ArrayList<Basebullet>();
	}

	public int getCount() {
		return BulletCount;
	}

	public void setCount(int count) {
		this.BulletCount = count;
	}
	public abstract void addBullet();
	public abstract void getBullet();
	

}