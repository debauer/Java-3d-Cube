public class punkt {
	public double x;
	public double y;
	public double z;
	private double betrag;
	public punkt(double x, double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
		this.betrag = java.lang.Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
	double getWinkelX(){
		return java.lang.Math.acos(this.x/this.betrag);
	}
	double getWinkelY(){
		return java.lang.Math.acos(this.y/this.betrag);
	}
	double getWinkelZ(){
		return java.lang.Math.acos(this.z/this.betrag);
	}
	double getWinkelXY(){
		double ret = java.lang.Math.toDegrees(java.lang.Math.atan(this.y/this.x));
		if(this.x < 0){
			ret = ret +180;
		}
		return ret;
	}
	double getWinkelYZ(){
		double ret = java.lang.Math.toDegrees(java.lang.Math.atan(this.z/this.y));
		if(this.y < 0){
			ret = ret +180;
		}
		return ret;
	}
	double getWinkelZX(){
		double ret = java.lang.Math.toDegrees(java.lang.Math.atan(this.x/this.z));
		if(this.z > 0){
			ret = ret -180;
		}
		return ret;
	}
	public void drehen(int winkelX, int winkelY, int winkelZ){
		if(winkelX != 0){
			double betrag = java.lang.Math.sqrt(this.z*this.z + this.y*this.y);
			double winkel = getWinkelYZ();
			this.z = java.lang.Math.cos(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
			this.y = java.lang.Math.sin(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
		}
		if(winkelY != 0){
			double betrag = java.lang.Math.sqrt(this.z*this.z + this.x*this.x);
			double winkel = getWinkelYZ();
			this.x = java.lang.Math.cos(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
			this.z = java.lang.Math.sin(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
		}
		if(winkelZ != 0){
			double betrag = java.lang.Math.sqrt(this.x*this.x + this.y*this.y);
			double winkel = getWinkelXY();
			this.x =  java.lang.Math.cos(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
			this.y =  java.lang.Math.sin(java.lang.Math.toRadians(winkel+ winkelZ))*betrag;
		}
	}
	
	
}
