import java.util.Random;
import java.util.Scanner;

public class LotteryClass {
    public void run() {

        int countWin = 0;
        int[] luckyNums = new int[ConstantsClass.COUNT_SET_SIZE];
        int[] userNums = new int[ConstantsClass.COUNT_SET_SIZE];

        userNums = Utils.getUserArray();
        luckyNums = Utils.getLuckyArray();

        Utils.printArray(userNums);
        Utils.printArray(luckyNums);
        countWin = Utils.winNums(luckyNums, userNums);
        Utils.printWinResult(countWin);
    }

}

  //  }
     //       }

//        int userNum1 = 0;
//        int userNum2 = 0;
//        int userNum3 = 0;
//        int userNum4 = 0;
//        int userNum5 = 0;
//        int lucky1 = 0;
//        int lucky2 = 0;
//        int lucky3 = 0;
//        int lucky4 = 0;
//        int lucky5 = 0;

//                if (userCount == 1) {
//                    userNums[userCount-1] = userNum;
////                    userNum1 = userNum;
//                    userCount++;
//                } else if (userCount == 2 && Utils.isNumInArray(userNums, userNum)) {
//                    userNum2 = userNum;
//                    userCount++;
//                } else if (userCount == 3 && userNum1 != userNum && userNum2 != userNum) {
//                    userNum3 = userNum;
//                    userCount++;
//                } else if (userCount == 4 && userNum1 != userNum && userNum2 != userNum && userNum3 != userNum) {
//                    userNum4 = userNum;
//                    userCount++;
//                } else if (userCount == 5 && userNum1 != userNum && userNum2 != userNum && userNum3 != userNum && userNum4 != userNum) {
//                    userNum5 = userNum;
//                    userCount++;
//   }
//   }

//        System.out.println("Enter number 1 : ");
//        userNum1 = scan.nextInt();
//        if (userNum1 > 50 || userNum1 < 1) {
//            System.out.println("Number between 1 and 50");
//        }
//
//        System.out.println("Enter number 2 : ");
//        userNum2 = scan.nextInt();
//        if (userNum2 > 50 || userNum2 < 1) {
//            System.out.println("Number between 1 and 50");
//        }
//
//        System.out.println("Enter number 3 : ");
//        userNum3 = scan.nextInt();
//        if (userNum3 > 50 || userNum3 < 1) {
//            System.out.println("Number between 1 and 50");
//        }
//
//        System.out.println("Enter number 4 : ");
//        userNum4 = scan.nextInt();
//        if (userNum4 > 50 || userNum4 < 1) {
//            System.out.println("Number between 1 and 50");
//        }
//
//        System.out.println("Enter number 5 : ");
//        userNum5 = scan.nextInt();
//        if (userNum5 > 50 || userNum5 < 1) {
//            System.out.println("Number between 1 and 50");
//        }

//        lucky1 = random.nextInt(50) + 1;
//        lucky2 = random.nextInt(50) + 1;
//        lucky3 = random.nextInt(50) + 1;
//        lucky4 = random.nextInt(50) + 1;
//        lucky5 = random.nextInt(50) + 1;




//        while (luckyCount <= size) {
//            lucky = random.nextInt(50) + 1;
//
//            if (luckyCount == 1) {
//                lucky1 = lucky;
//                luckyCount++;
//            } else if (luckyCount == 2 && lucky1 != lucky) {
//                lucky2 = lucky;
//                luckyCount++;
//            } else if (luckyCount == 3 && lucky1 != lucky && lucky2 != lucky) {
//                lucky3 = lucky;
//                luckyCount++;
//            } else if (luckyCount == 4 && lucky1 != lucky && lucky2 != lucky && lucky3 != lucky) {
//                lucky4 = lucky;
//                luckyCount++;
//            } else if (luckyCount == 5 && lucky1 != lucky && lucky2 != lucky && lucky3 != lucky && lucky4 != lucky) {
//                lucky5 = lucky;
//                luckyCount++;
//            }


//            if (luckyCount == 1){
//                lucky1 = lucky;
//            } else if (luckyCount == 2) {
//                lucky2 = lucky;
//            } else if (luckyCount == 3) {
//                lucky3 = lucky;
//            } else if (luckyCount == 4) {
//                lucky4 = lucky;
//            } else if (luckyCount == 5) {
//                lucky5 = lucky;
//            }
//            luckyCount++;
//        }

//            switch (luckyCount) {
//                case 1:
//                    lucky1 = lucky;
//                    luckyCount++;
//                    break;
//                case 2:
//                    lucky2 = lucky;
//                    luckyCount++;
//                    break;
//                case 3:
//                    lucky3 = lucky;
//                    luckyCount++;
//                    break;
//                case 4:
//                    lucky4 = lucky;
//                    luckyCount++;
//                    break;
//                case 5:
//                    lucky5 = lucky;
//                    luckyCount++;
//                    break;
//            }
 //      System.out.println("User number: " + userNum1 + " " + userNum2 + " " + userNum3 + " " + userNum4 + " " + userNum5);
//        System.out.println("Lucky number: " + lucky1 + " " + lucky2 + " " + lucky3 + " " + lucky4 + " " + lucky5);
