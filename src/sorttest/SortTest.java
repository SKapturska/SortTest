package sorttest;

public class SortTest {

    public static void main(String[] args) {
       
       Sort sort = new Sort();
       sort.fillTable();
       sort.quicksort(sort.numbers, 0, 9999999);
    }
    
}
