class bike{
    public void brand(){
        System.out.println("honda");
        System.out.println("shine");
    }
}
class car extends bike{
    public void brand(){
        super.brand();
        System.out.println("bmw");
        System.out.println("swift");
    }
}
class ship extends car{
    public void brand(){
        super.brand();
        System.out.println("titanic");
        System.out.println("vikrant");
    }
}
class classmethod{
    public static void main(String[] args) {
        ship s1 = new ship();
        s1.brand();
    }
}