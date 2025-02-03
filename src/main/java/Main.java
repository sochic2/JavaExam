import item.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private String str;
    //접근제한자, 타입

    // if __name__== 'main'

    // psvm
    public static void main(String[] args) {

//        Item item = new Item(); // 생성자를 통한 인스턴스
//
//        item.setName("new item name");
//        System.out.println(item.getName());

        List list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {  // for loop 전체 순회
            System.out.println(list.get(i));
        }

        for(Object obj : list) { //forEach
            System.out.println(obj);

        }

        System.out.println("hello world"); //print()
    }
}
