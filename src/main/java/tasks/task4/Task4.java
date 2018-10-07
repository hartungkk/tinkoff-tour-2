package tasks.task4;

import org.assertj.core.api.SoftAssertions;

import java.util.*;


public class Task4 {
    public static void main(String[] args) {

        List<ObjectA> expectedList = new ArrayList<>();
        List<ObjectA> actualList = new ArrayList<>();

        expectedList.add(new ObjectA(1, "field1", "value1"));
        expectedList.add(new ObjectA(2, "field2", "value2"));
        expectedList.add(new ObjectA(3, "field3", "value3"));
        expectedList.add(new ObjectA(4, "field4", "value4"));

        actualList.add(new ObjectA(1, "field1", "value2"));
        actualList.add(new ObjectA(2, "otherField", "value4"));
        actualList.add(new ObjectA(3, "field6", "otherValue"));
        actualList.add(new ObjectA(4, "otherField", "otherValue"));

   //с гитхаба , но что то не работает(
//        SoftAssertions soft = new SoftAssertions();
//        for (ObjectA act : actualList) {
//
//            Optional<ObjectA> optExp = actualList.stream().filter(exp -> exp.getId() == act.getId()).findFirst();
//
//                soft.assertThat(act).isEqualToComparingFieldByField(optExp.get());
//
//             }     soft.assertAll();
//
    }

}



