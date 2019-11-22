public class Practice11Test {

    public Practice11Test(){
        System.out.println("\nStarting test: ");
    }

    private void printPairs(int[][] table){
        System.out.print("[");
        for(int i=0; i<table.length; i++){
            System.out.print(" [" + table[i][0] + "," + table[i][1] + "]");
        }
        System.out.print(" ]");
    }

    public static void main(String[] args){
        Practice11Test test = new Practice11Test();
        Judge judge = new Judge();
        int[][] tester1 = { {1, 2} };
        int[][] tester2 = { {1, 3}, {2, 3} };
        int[][] tester3 = { {1, 3}, {2, 3}, {3, 1} };
        int[][] tester4 = { {1, 2}, {2, 3} };
        int[][] tester5 = { {1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3} };
        int[][][] allTests = {tester1, tester2, tester3, tester4, tester5};
        int[] allN = {2, 3, 3, 3, 4};

        //printing the table:
        System.out.println("\t\t\tN\tOutput\tTrust");
        for(int i=0; i<5; i++){
            System.out.print("Example " + (i+1) + ":\t");
            System.out.print(allN[i] + "\t");
            System.out.print(judge.findJudge(allN[i], allTests[i])); // prints the output from findJudge()
            System.out.print("\t\t");
            test.printPairs(allTests[i]); // prints the formatted pairs for each test array
            System.out.println();
        }
    }
}
