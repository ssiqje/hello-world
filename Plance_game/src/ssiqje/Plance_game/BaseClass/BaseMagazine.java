package ssiqje.Plance_game.BaseClass;

import java.util.List;

public abstract class BaseMagazine 
{
	private int BulletCount;
	private List<E>
	private Basebullet Bullet;
	public BaseMagazine(Basebullet bullet) {
		// TODO Auto-generated constructor stub
		BulletCount=0;
		this.Bullet=bullet;
		
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
