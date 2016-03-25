package ssiqje.PlaneGame.BaseClass;

public abstract class BasePlance 
{
	private BaseMagazine Magazine;
	private boolean Islive;
	private float X,Y;
	public BasePlance(BaseMagazine Magazine) {
		this.Magazine=Magazine;
		Islive=true;
		X=0;
		Y=0;
	}
	public float getX() {
		return X;
	}
	public void setX(float x) {
		this.X = x;
	}
	public float getY() {
		return Y;
	}
	public void setY(float y) {
		this.Y = y;
	}
	
	public boolean isIslive() {
		return Islive;
	}
	public void setIslive(boolean islive) {
		this.Islive = islive;
	}
	public abstract void shot();
	
	public abstract void move(float f, float g);
}
