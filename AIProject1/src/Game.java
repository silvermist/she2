import java.util.ArrayList;
import java.util.Random;


public class Game {
Tile [][] grid;




public boolean isValidMove(int startX, int startY, int destX, int destY){
	if(destX < 0 || destX >= grid.length || destY < 0 || destY >= grid.length){
		return false;
	}
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

public  ArrayList<String> possibleMoves(int startX, int startY){   //y,x
	ArrayList<String> res = new ArrayList<>();
	int northY = startY-1;
	int northX = startX;
	if(isValidMove(startX, startY, northX, northY)){
		res.add(northY+","+northX);
	}
	int southY = startY+1;
	int southX = startX;
	if(isValidMove(startX, startY, southX, southY)){
		res.add(southY+","+southX);
	}
	int eastY = startY;
	int eastX = startY+1;
	if(isValidMove(startX, startY, eastX, eastY)){
		res.add(eastY+","+eastX);
	}
	int westY = startY;
	int westX = startY-1;
	if(isValidMove(startX, startY, westX, westY)){
		res.add(westY+","+westX);
	}
	return res;
}
public void move(int startX, int startY){
	ArrayList<String> moves = possibleMoves(startX, startY);
	if(moves.size() > 0){
		Random r = new Random();
		int rand = r.nextInt(moves.size());
		String [] newLoc = moves.get(rand).split(",");
		int newY = Integer.parseInt(newLoc[0]);
		int newX = Integer.parseInt(newLoc[1]);
		Tile current = grid[startY][startX];
		grid[startY][startX] = new Tile(false,Type.BLANK);
		grid[newY][newX] = current;
	}
}
	public static void main(String[] args) {
		//System.out.println("─│┐└ ┌ ┘");
		//System.out.println("┐".equals("┐"));
	}

}
