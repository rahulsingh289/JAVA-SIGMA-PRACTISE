public class GETTERSSETTERS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(50);
        System.out.println(p1.tip);

    }
}
class Pen{
    private
String color;
int tip;
String getcolor(){
return this.color;
}
int gettip(){
   return this.tip;
}


void setcolor(String newcolor){
this.color = newcolor;
}
void settip(int newtip){
   this.tip = newtip;
}
}
