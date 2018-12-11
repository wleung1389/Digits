import java.util.ArrayList;
import java.util.List;

public class Digits {
    public ArrayList<Integer> digitList;
    public Digits(int num)
    {
        String[] arr = String.valueOf(num).split("");
        digitList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            digitList.add(Integer.parseInt(arr[i]));
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size() - 1; i++)
        {
            if(digitList.get(i) >= digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
