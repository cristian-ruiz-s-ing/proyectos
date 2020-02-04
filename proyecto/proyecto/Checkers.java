


import java.util.Scanner;
/**
 * Write a description of class Checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checkers{
    public static int width;
    private int squareWidth;
    private int xPosition;
    private int yPosition;
    private boolean color;
    private int referenceNumber;
    public Rectangle[][] gameBoard;
    //public Rectangle[][] configurationZone;
    public Circle[][] pieces;

    public Checkers(int lado){
        this.width=lado;
        referenceNumber=1;
        this.gameBoard=new Rectangle[8][8];
        this.pieces=new Circle[8][8];
        squareWidth=(int)this.width/8;
        this.xPosition=0;
        this.yPosition=0;
        color=false;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(color==true){
                    this.gameBoard[i][j]=new Rectangle(squareWidth,xPosition,yPosition,color,referenceNumber);
                    //this.configurationZone[i][j]=new Rectangle(squareWidth,xPosition,yPosition,color,referenceNumber);
                    referenceNumber++;
                }else{
                    this.gameBoard[i][j]=new Rectangle(squareWidth,xPosition,yPosition,color,0);
                    //this.configurationZone[i][j]=new Rectangle(squareWidth,xPosition,yPosition,color,0);
                }
                xPosition+=squareWidth;
                color=!color;
            }
            yPosition+=squareWidth;
            xPosition=0;
            color=!color;
        }
    }

    public void makeVisible(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                this.gameBoard[i][j].makeVisible();
                //this.configurationZone[i][j].makeVisible();
                System.out.println(this.gameBoard[i][j].referenceNumber);
            }
        }
    }
    
    public void makeInvisible(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                this.gameBoard[i][j].makeInvisible();
            }
        }
    }
    
    public void add(boolean king,int row,int col){
        if(king==true){
            if(this.gameBoard[row-1][col-1].color=="white"){
                System.out.println("Las coordenadas no son válidas");
            }else{
                this.pieces[row-1][col-1]=new Circle(squareWidth,this.gameBoard[row-1][col-1].xPosition,this.gameBoard[row-1][col-1].yPosition,"red");
                this.pieces[row-1][col-1].makeVisible();
            }
        }else{
            if(this.gameBoard[row-1][col-1].color=="white"){
                System.out.println("Las coordenadas no son válidas");
            }else{
                this.pieces[row-1][col-1]=new Circle(squareWidth,this.gameBoard[row-1][col-1].xPosition,this.gameBoard[row-1][col-1].yPosition,"yellow");
                this.pieces[row-1][col-1].makeVisible();
            }
        }
    }
    
    public void moveHorizontal(int distance){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                this.gameBoard[i][j].moveHorizontal(distance);
            }
        }
    }
    
    public void add(int men[][]){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
    }
}
