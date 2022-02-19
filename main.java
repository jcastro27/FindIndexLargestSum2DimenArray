public class FindIndexWithLargestSumInA2DimenArray {

    public static int indexOfHighestRowSum(int [][] A)
    {
        int highestSum = -999;
        int sum = 0;
        int index = 0;

        for(int i = 0; i < A.length; i++)
        {
            sum = 0;
            for(int j = 0; j < A[i].length; j++)
            {
                sum = sum + A[i][j];

            }
            if(sum > highestSum)
            {
                highestSum = sum;
                index = i;
            }

        }





        return index;
    }


}
