package ee.annjakubel.cars;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NumberController {
    List<Integer> integers = new ArrayList<>(Arrays.asList(31, 52));

    @GetMapping("integers")
    public List<Integer> getIntegers() {
        return integers;
    }

    @PostMapping("integers/{newInteger}")
    public void addInteger(@PathVariable int newInteger) {
        integers.add(newInteger);
    }

    @DeleteMapping("integers/{index}")
    public void deleteInteger(@PathVariable  int index) {
        integers.remove(index);
    }

    @PutMapping("integers/{index}/{integer}")
    public void editInteger(@PathVariable  int index, @PathVariable int integer) {
        integers.set(index, integer);
    }

    @DeleteMapping("integers")
    public void deleteAllIntegers() {
        integers.clear();
    }

    @GetMapping("integers/sum") //OK
    public int sumOfIntegers() {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        return sum;
    }

    @GetMapping("integers/average")
    public double averageOfIntegers() {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        return 1.0 * sum / integers.size();
    }

    @GetMapping("integers/amount")
    public int amountOfIntegers() {
        return integers.size();
    }
}
