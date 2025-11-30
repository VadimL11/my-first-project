package homework_34;

import java.util.List;

public class Main {

    void main(){

        List<Integer> numbers = List.of(1,2,3,5,6);

        NumberUtils utils = new NumberUtils();
        int sum = utils.getSum(numbers);

        System.out.println(sum);

        List<Integer> oddList = utils.multiplyOddNumber(numbers);

        System.out.println(oddList);

    }
}
