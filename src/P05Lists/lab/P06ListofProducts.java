package P05Lists.lab;

import java.util.*;

public class P06ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<String> inputProducts=new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String input=scanner.nextLine();
            inputProducts.add(i,input);
        }

        Collections.sort(inputProducts);
        for (int i = 0; i < inputProducts.size(); i++) {
            String currentProduct=inputProducts.get(i);
            System.out.println(i+1+"."+currentProduct);
        }
    }
}
