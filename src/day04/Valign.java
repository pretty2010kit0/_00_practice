package day04;
/**
* 实现文字竖排
* 输入: abcdefghijk
* 输出:
* jgda
* kheb
*  ifc
*/
public class Valign{
public static void main(String[] args){
String str = "abcdefghijklmn";
int size = str.length();
int rows = 3; //行数
int cols =
size%rows==0?size/rows:size/rows+1; //列数
char[][] t = new char[rows][cols];
int index=0;
for(int j=cols-1; j>=0; j--){
	for(int i=0; i<rows; i++){
		if(index<size){
			t[i][j] = str.charAt(index++);
		}else{
			t[i][j]=' ';
		}
		}
	}
String txt = "";
for(int i=0; i<t.length; i++){
    for(int j=0; j<t[i].length; j++){
        txt+=t[i][j];
    }
    txt+="\n";
}
System.out.println(txt);
}
}