
public class Game {
Tile [][] grid;




public boolean isValidMove(int startX, int startY, int destX, int destY){
	Tile current = grid[startY][startX];
	Tile destination = grid[destY][destX];
	boolean moveable = current.isMovable();
	if(!moveable){
		return false;
	}
	Type destType = destination.getType();
	if(!destType.equals(Type.BLANK)){
		return false;
	}
	return true;
}
	public static void main(String[] args) {
		//System.out.println("─│┐└ ┌ ┘");
		//System.out.println("┐".equals("┐"));
	}

}
