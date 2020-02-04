public class Board{
    public Checkers board;
    public int width=Checkers.width;
    public Board(){
        this.board=new Checkers(width);
        this.board.moveHorizontal(width+100);
    }

    public void makeVisible(){
        this.board.makeVisible();
    }
}
