class SuperObj {
    public void show(){
        print();
    }
    public void print(){
        print();
        System.out.print("Super");
    }
}
class SubObj extends SuperObj{
    public void show(){
        super.print();
    }
    public void print(){
        System.out.print("Sub");
    }
}
public class 수제비_파이널_1회_20번 {
    public static void main(String[] args){
        SuperObj s = new SubObj();
        s.show();
    }
}