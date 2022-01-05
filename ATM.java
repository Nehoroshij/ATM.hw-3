public class ATM 
{
  public int countBanknotes(int sum)
  {
    int [] banknotes = new int []{500, 200, 100, 50, 20, 10, 5, 2, 1};
    int result = 0;
    int i = 0;
 
        while (i < banknotes.length)
        {
            while(sum >= banknotes[i])
            {
                sum -= banknotes[i];
                result++;
            }

            i++;
        }

        return result;
  }
}
