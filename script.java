import java.util.ArrayList;


public class script {

    static String[] names = new String[4];

    int a;
    int b;

    public static void main (String[] args){
        System.out.println("Hello World");
        System.out.println(test(343,23));

        namesList();
        // Now executing the command to fill the array, add parameters if needed
        System.out.println("Members of the family are :");
        for(int i = 0; i < 4; i++){
            System.out.println(names[i]);
        }

    }

    public static int test(int a, int b){
        return a + b;
    }

    public static void namesList(){

    String name1 = "Jordan";
    String name2 = "Margot";
    String name3 = "Gabriel";
    String name4 = "Rose";

    names[0] = name1;
    names[1] = name2;
    names[2] = name3;
    names[3] = name4;

    }


}