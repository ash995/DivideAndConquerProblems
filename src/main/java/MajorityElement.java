import java.util.List;

public class MajorityElement {

    public boolean isMajority(List<Integer> sortedIntegerList, int number) {
        int size = sortedIntegerList.size();
        int startingIndex;
        if (sortedIntegerList.isEmpty() || sortedIntegerList.get(size/2) != number) {
            return false;
        }
        else {
            startingIndex = findStartingIndexOfNumberInArray(sortedIntegerList, number, 0, size-1);
            int endingIndex = calculateEndingIndex(startingIndex, size);
            if (endingIndex < size -1 && sortedIntegerList.get(endingIndex) == number) {
                return true;
            }
            else {
                return false;
            }

        }
    }

    private int calculateEndingIndex(int startingIndex, int size) {
        int endingIndex;
        if (size%2 == 0) {
            endingIndex = startingIndex + size / 2;
        }
        else {
            endingIndex = startingIndex + size /2 + 1;
        }
        return endingIndex;
    }

    private int findStartingIndexOfNumberInArray(List<Integer> sortedIntegerList, int number, int low, int high) {
        if (high >= low) {
            int mid = (low + high)/2;
            /*
            ** mid is first index if
            * 1. if arr[mid] == x
            * 2. if mid == 0 || arr[mid -1] < x
            *
              */
            if (sortedIntegerList.get(mid) == number && (mid == 0 || sortedIntegerList.get(mid - 1) < number)) {
                return mid;
            }
            else if (sortedIntegerList.get(mid - 1) == number) {
                return findStartingIndexOfNumberInArray(sortedIntegerList, number, low, mid);
            }
            else {
                return findStartingIndexOfNumberInArray(sortedIntegerList, number, mid, high);
            }
        }
        else return -1;
    }
}
