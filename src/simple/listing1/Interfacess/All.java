package simple.listing1.Interfacess;

import java.util.ArrayList;
import java.util.List;

public class All {
    protected static List<Nums> list=new ArrayList<>();

    void method(Nums nums){
        nums.choose();
    }
    public static void main(String[] args) {
        Nums nums= new One();
        nums.choose();
        new All().method(new Two());


        System.out.println("----");
        list.add(new One());
        list.add(new Two());
        for(Nums o:list){
            o.choose();
        }
    }
}
