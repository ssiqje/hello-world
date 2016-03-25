package ssiqje.Plance_game.BaseClass;

public abstract class BasePlance 
{
	private BaseMagazine Magazine;
	private boolean Islive;
	private int X,Y;
	public BasePlance(BaseMagazine Magazine) {
		this.Magazine=Magazine;
		Islive=true;
		X=0;
		Y=0;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		this.X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		this.Y = y;
	}
	
	public boolean isIslive() {
		return Islive;
	}
	public void setIslive(boolean islive) {
		this.Islive = islive;
	}
	public abstract void move();
	public abstract void shot();
}
