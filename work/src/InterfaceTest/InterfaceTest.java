package InterfaceTest;

//TODO test interface

interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}
//Using interface: by third user
class InterfaceTest{
    public static void main(String[] args){

        for(String arg:args){
            System.out.println(arg);
        }
        if (args.length > 0){
            if (args[0].equals("rec")){
                Drawable r = new Rectangle();
                r.draw();
            } else if (args[0].equals("circle")) {
                Drawable c=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
                c.draw();
            }

        }

    }}