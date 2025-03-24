package Project1.pkg.basic;

import java.util.Scanner;

public class VerifyCode {
    public static void main(String[] args)
    {
        try(Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Please input the length of the verification code : ");
            int codeLen = myScanner.nextInt();

            PrintCode(codeLen);
        }
    }

    public static void PrintCode(int codeLen) {

        String code = "";
        for(int i = 0; i < codeLen; i++)
        {
            //the verification can have numbers, lowercase char and uppercase char
            int type = (int)(Math.random() * 3);

            switch (type) {
                case 0: //number 
                    char num = (char)('0' + (int)(Math.random()*10));
                    code += num;
                    break;
                case 1:
                    char lowCh = (char)('a' + (int)(Math.random()*26));
                    code += lowCh;
                    break;
                case 2:
                    char uppCh = (char)('A' + (int)(Math.random()*26));
                    code += uppCh;
                    break;
                default:
                    break;
            }
        }

        System.out.println("The verification code is ");
        System.out.println(code);
    }
}
