import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// 1 заповнити довільними значеннями. getList 50шт
// 2 вивести на екран

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> list = getList(50);
        ArrayList<Integer> list1 = new ArrayList<>();

      printListOneRow(list);



        printListOneRow(list);
    }
    public static LinkedList<Integer> getList(int n){
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < n ; i++) {
            list1.add((int) (Math.random()*100+1));

        } return list1;
    }

    public static void printListOneRow(LinkedList<Integer> list){
        for (int i = 0; i <list.size() ; i++) {

                System.out.print(list.get(i) + " ");
            }


    }

}
