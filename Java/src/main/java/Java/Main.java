package Java;

public class Main {

    public static void main(String[] args) {
        int [] b = {10,20,30,40,50};
        int a = 0;
        a = calc(b);
        System.out.println(a);
    }

    static int calc(int [] ar) {
        var ret = 0;
        for (var i=0; i < ar.length; i++) {
            ret = ret + ar[i]*i;
        }
        return ret;
    }

}