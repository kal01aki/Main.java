public class Main {
    static int[] input = {4, 5, 6, 7, 8};


    public static void main(String[] args) {
        greaterThanZeroChecker();

    }

    // An array is said to be complete Return 1 if it is complete Return 0 unless
    // 1. if there is no elements less than Zero
    // 2. the highest number must be an even number
    // 3. the sum of the high even number and the highest odd number must be less than 50


    static void greaterThanZeroChecker() {
        int highestNumber = 1;
        int highestEvenNumber = 2;
        int highestOddNumber = 1;
        int sum = 0;
        int greaterThanZero;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0)
                    highestNumberChecker();
                else
                    System.out.println(0);
            }
        }


    static void highestNumberChecker() {

        int highestNumber = input[0];
        for (int i = 0; i < input.length; i++) {

            if (highestNumber < input[i])
                highestNumber = input[i];
        }

        if (highestNumber % 2 == 0)
            sumOfEvenAndSum();
        else
            System.out.println(0);
    }

    static void sumOfEvenAndSum() {
        int highestNumber = input[0];
        int evenHighestNumber = input[0];
        int oddHighestNumber = input[0];

        for (int i = 0; i < input.length; i++) {

            if (highestNumber < input[i]){
                highestNumber = input[i];}
            if (highestNumber % 2 == 0)
            evenHighestNumber = highestNumber;
            else if (highestNumber % 2 != 0)
            oddHighestNumber = highestNumber;
        }
        int sum = evenHighestNumber + oddHighestNumber;

        if (sum < 50)
            System.out.print(1);
        else
            System.out.print(0);
    }
//{4, 5, 6, 7, 8}
            }




//            if ( input[i] % 2 = 0)
//                return ();
//
//            }
//        }
//
//    }


//        static int sumOfEvenAndSum(){
//
//
//           if (sum < 50)
//            return (0);
//           else;
//            return (1);
//        }
//
//
//    }
//}