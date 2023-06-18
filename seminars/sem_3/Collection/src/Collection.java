import java.util.*;

public class Collection {

    public static List ListGenerate(int size, int upBound){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(new Random().nextInt(upBound));
        }
        return list;
    }

    public static List <Integer> DeleteElem (List <Integer> list){
       List<Integer> tmpList = new ArrayList<>();
       tmpList.addAll(list);
        for (int i=0; i < list.size(); i++){

            int elem = list.get(i);
            if (elem % 2 == 0){
                int index = tmpList.indexOf(elem);
                tmpList.remove(index);
            }
        };
        return tmpList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кол-во элементов: ");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Верхняя граница: ");
        int up = sc1.nextInt();
        System.out.println(n + " кол-во эл-ов");
        System.out.println(up + " верхняя граница");
        List listNum = ListGenerate(n, up);
        List delList = DeleteElem(listNum);

        System.out.println(listNum + " - listNum");
        System.out.println(delList + " - delList");
        int average  = 0;

        for (int j = 0; j<delList.size(); j++){
            average = average + (Integer)delList.get(j);
        }
        average = average/delList.size();
        System.out.println(Collections.max(delList) + " - это MAX значение");
        System.out.println(Collections.min(delList) + " - это MIN значение");
        System.out.println(average + " - это СРЕДНЕЕ значение");
    }
}