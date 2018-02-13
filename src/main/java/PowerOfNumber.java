import java.util.ArrayList;
import java.util.List;

public class PowerOfNumber {

    private List<Long> exponentialsOfNumber = new ArrayList<>();

    public long calculatePower(int number, int exponential) {
        if (exponential == 0) return 1;
        else if (exponential == 1) return number;
        else return calculatePower(number, exponential/2) * calculatePower(number, exponential/2);
    }
}
