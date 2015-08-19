package suanfa;

public class Cell {
    int row;
    int col;
    //drop one line
    public void drop(){
        row ++;
    }
    //move left
    public void moveLeft(int d){
        col -=d;
    }
    public String toString(){
        return row +","+col;
    }
    //重载的drop方法
    public void drop(int d){
        row +=d;
    }
    //重载的moveleft方法
    public void moveleft(){
        col--;
    }
	public void LeftMove() {
		col--;
	}
	public void RightMove() {
		col++;
	}
}





