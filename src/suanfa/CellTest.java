package suanfa;
import java.util.Scanner;
public class CellTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Cell cell = new Cell();
        //成员变量赋值
        cell.row = 6;
        cell.col = 5;
        printCell(cell);
        boolean flags = true;
    while(flags){
        System.out.println("1--下落，2--向左，3--向右，0--退出");
        int num = scan.nextInt(); 
        if(cell.row > 19){
            cell.row = 0;
        }
        switch (num){
        case 1:
        printCell(cell);
//    drop move
        cell.drop();
        System.out.println("Cell的位置为：（"+cell.row+"，"+cell.col+")");
        sleep(300000000l);
        printCell(cell);
        break;
        case 2:
//    left move
        cell.LeftMove();
        System.out.println("Cell的位置为：（"+cell.row+"，"+cell.col+")");
        sleep(300000000l);
        printCell(cell);
        break;
        
        
        case 3:
// right move 
        cell.RightMove();
        System.out.println("Cell的位置为：（"+cell.row+"，"+cell.col+")");
        sleep(300000000l);
        printCell(cell);
        break;
        case 0:
            flags = false;
            break;
        default:
            System.out.println("你输入错误！");
                
            
        }
    }
    scan.close();
    }
    private static void sleep(long num) {
        for(long i = 0; i < num;i++){
        }
        
    }
    public static void printCell(Cell cell){
        //总行数
        int totalRow = 20;
        //总列数
        int totalCol = 10;
         //双层循环画墙和格
        for(int row = 0; row < totalRow; row ++){
            for(int col = 0; col < totalCol; col++){
            if(cell.row == row && cell.col == col){
                    System.out.print("* ");
            }
            else {
                    System.out.print("- ");
              }
            }
            System.out.print(" "+row);
            System.out.println();
        }


        for(int col = 0;col < totalCol;col++){
            System.out.print(col+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}