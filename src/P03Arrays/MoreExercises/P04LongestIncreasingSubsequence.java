package P03Arrays.MoreExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] lis;
        int[] len = new int[sequence.length];
        int[] prev = new int[sequence.length];
        int maxLength = 0;
        int lastIndex = -1;

        // обхождам поредицата
        for (int i = 0; i < sequence.length; i++)
        {
            // len && prev съответно = 1 && -1
            len[i] = 1;
            prev[i] = -1;

            // обхождам поредицата и сравнявам за най-добра дължина на поредица
            // if i == j -> цикъл j няма да се изпълни
            for (int j = 0; j < i; j++)
            {
                // ако текущата стойност j/в ляво/ е по-малка от i/в дясно/
                // && текущия брой елементи j >= броя елементи на i -> броя на елементите /поредицата/ ще нараства
                if (sequence[j] < sequence[i] && len[j] >= len[i])
                {
                    len[i] = 1 + len[j];
                    prev[i] = j; // запазваме индекса на най добрия елемент от поредицата
                }
            }
            // запазвам максималния брой елементи
            if (len[i] > maxLength)
            {
                maxLength = len[i];
                lastIndex = i;
            }
        }

        lis = new int[maxLength];
        for (int i = 0; i < maxLength; i++)
        {
            lis[i] = sequence[lastIndex];
            lastIndex = prev[lastIndex];
        }
        


        for (int i = lis.length-1; i >=0 ; i--) {
            System.out.print(lis[i]+" ");
        }

    }

}

