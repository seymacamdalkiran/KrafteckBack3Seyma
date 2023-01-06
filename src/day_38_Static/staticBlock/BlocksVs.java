package day_38_Static.staticBlock;

public class BlocksVs {

    static int i;
    public BlocksVs() {
        System.out.println("no argument constructor yurudu");
    }
    public BlocksVs(int i) {
        System.out.println(this.i+i);
        System.out.println("one argument constructor yurudu");
    }

    static {
        System.out.println("static init");  //run first and once time
        BlocksVs blocksVs=new BlocksVs(5);
        i=10;
    }
    {
        System.out.println("instance init");   //run again before constructor
    }


}
