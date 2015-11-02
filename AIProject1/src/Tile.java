
public class Tile {
boolean movable;
Type type;
String config; // ─ , │ , ┐ , └ ,  ┌ , ┘



public Tile(boolean movable, Type type , String config){
	this.movable = movable;
	this.type = type;
	this.config = config;
}

public boolean isMovable() {
	return movable;
}
public void setMovable(boolean movable) {
	this.movable = movable;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}

public String getConfig() {
	return config;
}

public void setConfig(String config) {
	this.config = config;
}

}
