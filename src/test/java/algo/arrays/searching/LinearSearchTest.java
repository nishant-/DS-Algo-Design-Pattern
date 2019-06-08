package algo.arrays.searching;


import algo.arrays.searching.LinearSearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinearSearchTest {

    private  static LinearSearch<Integer> linearSearch;
    static Integer integerArray[];
    private static LinearSearch<Box> linearSearchBox;
    static Box boxArr[];
    private static LinearSearch<EqualsBox> linearSearchEqualsBox;
    static EqualsBox equalsBoxArr[];
    private static LinearSearch<String> stringLinearSearch;
    static String strArr[];

    static class Box {
        String name;
        Box(String name) {
            this.name=name;
        }
    }

    static class EqualsBox {
        String name;
        EqualsBox(String name) {
            this.name=name;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null || !(obj instanceof EqualsBox))
                return false;
            return this.name.equals(((EqualsBox)obj).name);
        }
    }

    @BeforeAll
    public static void setUp() {
         linearSearch = new LinearSearch<>();
         integerArray = new Integer[]{1,2,3,4,5};
        linearSearchBox = new LinearSearch<>();
        boxArr = new Box[] {new Box("Box1"),new Box("Box2")};
        linearSearchEqualsBox= new LinearSearch<>();
        equalsBoxArr = new EqualsBox[] {new EqualsBox("Box1"),new EqualsBox("Box2")};
        stringLinearSearch = new LinearSearch<>();
        strArr = new String[]{"abc","def","abc","abc"};
    }


    @Test
    public void onlyFirstOccurrenceOfMatchedItemIsReturned() {
        assertTrue(stringLinearSearch.find(strArr,"abc")==0);
    }

    @Test
    public void secondMatchedItemIsNotReturned() {
        assertFalse(stringLinearSearch.find(strArr,"abc")==2);
    }

    @Test
    public void indexOfFirstOccurenceOfIntegerArrayIsFound() {

        assertTrue(linearSearch.find(integerArray,2)==1);
    }

    @Test
    public void minusOneIsReturnedIfSearchKeyIsNotFoundInArray() {

        assertTrue(linearSearch.find(integerArray,8)==-1);
    }


    @Test
    public void objectWithoutImplementationOfEqualsMethodCannotBeSearched(){
        assertTrue(linearSearchBox.find(boxArr,new Box("name1"))==-1);
    }

    @Test
    public void objectWithEqualsMethodImplementedCanBeSearched() {
        assertTrue(linearSearchEqualsBox.find(equalsBoxArr,new EqualsBox("Box2"))==1);
    }
}