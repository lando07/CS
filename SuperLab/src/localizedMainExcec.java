public class localizedMainExcec
{
    public localizedMainExcec(int os){
        switch(os){
            case 0:
            linux.main();
            case 1:
            win.main();
            case 2:
            bluej.main();
        }
    }
}
class linux
{
    static void main(){

    }
}
class win
{
    static void main(){

    }
}
class bluej
{
    static void main(){

    }
}