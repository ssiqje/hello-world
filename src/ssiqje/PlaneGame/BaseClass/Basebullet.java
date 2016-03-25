package ssiqje.PlaneGame.BaseClass;

public abstract class Basebullet 
{
	private int X,Y;
	private boolean Islive;
	private int Speed;
	public Basebullet(int Speed) {
		// TODO Auto-generated constructor stub
		X=0;
		Y=0;
		Islive=true;
		this.Speed=Speed;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public boolean isIslive() {
		return Islive;
	}
	public void setIslive(boolean islive) {
		Islive = islive;
	}
	
}
