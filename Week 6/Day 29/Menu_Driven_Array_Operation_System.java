//This program includes all the problems that were given in the assignment related to one dimensional array
import java.util.*;
public class Menu_Driven_Array_Operation_System {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("The given array is");
        for(int i=0;i<n;i++){
            if(i==0){  
                System.out.print("["+a[i]+",");
            }
            else if(i==n-1){
                System.out.println(a[i]+"]");
            }
            else{
                System.out.print(a[i]+",");
            }
        }
        System.out.println("Choose the operation you want to perform");
        System.out.println("1.Find sum and average of the array");
        System.out.println("2.Find largest and smallest element");
        System.out.println("3.Count even and odd numbers");
        System.out.println("4.Linear Search");
        System.out.println("5.Find frequency of an element");
        System.out.println("6.Find second largest element");
        System.out.println("7.To find duplicates in an array");
        System.out.println("8.Reverse Array");
        System.out.println("9.Rotate array left");
        System.out.println("10.Rotate array right");
        System.out.println("11.To move zeroes to the end");
        System.out.println("12.Find maximum frequnecy element");
        System.out.println("13.To find pair with a given sum");
        System.out.println("14.To remove duplicates from array");
        System.out.println("15.Merge two arrays");
        System.out.println("16.Union of two arrays");
        System.out.println("17.Intersection of two arrays");
        System.out.println("18.Bubble sort");
        System.out.println("19.Selection Sort");
        System.out.println("20.Binary Search");
        System.out.println("21.Sort array in descending order");
        int choice =in.nextInt();
        switch(choice){
            case 1:
                int sum=0;double avg=0;
                for(int i=0;i<n;i++){
                    sum+=a[i];
                }
                avg=(double)sum/n;
                System.out.println("The sum of the array is "+sum+" and the average is "+avg);
                break;
            case 2:
                int max=a[0],min=a[0];
                for(int i=0;i<n;i++) {
                    if(a[i]<min){
                    min=a[i];
                    }
                    if(a[i]>max){
                    max=a[i];
                    }
                }
                System.out.println("The largest number in the array is "+max);
                System.out.println("The smallest number in the array is "+min);
                break;
            case 3:
                int even=0,odd=0;
                for(int i=0;i<n;i++) {
                    if(a[i]%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                System.out.println("The number of even numbers in the array are "+even);
                System.out.println("The number of odd numbers in the array are "+odd);
                break;
            case 4:
                System.out.println("Enter the number you want to search");
                int x = in.nextInt();
                int flag = -1;
                for (int i = 0; i < n; i++) {
                    if (a[i] == x) {
                        flag = i;
                        break;
                    }
                }
                if (flag == -1) {
                    System.out.println(x + " is not present in the array");
                } else {
                    System.out.println(x + " is present in the array at postion " + (flag + 1));
                }
                break;
            case 5:
                System.out.println("Enter the number whose frequency is to be determined");
                int x1 = in.nextInt();
                int flag1 = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == x1) {
                        flag1++;
                    }
                }
                if (flag1 == 0) {
                    System.out.println("ERROR!!! The number " + x1 + " is not present in the array");
                } else {
                    System.out.println("The frequency of the number " + x1 + " is " + flag1);
                }
                break;
            case 6:
                int max1 = a[0], max2 = a[0];
                for (int i = 0; i < n; i++) {
                    if (a[i] > max1) {
                        max1 = a[i];
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] > max2 && a[i] != max1) {
                        max2 = a[i];
                    }
                }
                System.out.println("The second largest number in the array is " + max2);
                break;
            case 7:
                int c = 0;
                int flag2 = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[i] == a[j]) {
                            c++;
                        }
                    }
                    if (c > 1) {
                        System.out.print(a[i] + ",");
                        flag2 = 1;
                    }
                    c = 0;
                }
                if (flag2 == 1) {
                    System.out.println("are the duplicates in the array");
                } else {
                    System.out.println("There are no duplicates in the array");
                }
                break;
            case 8:
                int b[] = new int[n];
                for (int i = 0; i < n; i++) {
                    b[i] = a[n - 1 - i];
                }
                System.out.println("The reversed array is ");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(b[i] + ",");
                    else
                        System.out.println(b[i]);
                }
                break;
            case 9:
                System.out.println("How many steps to the left do you want to rotate the array");
                int r=in.nextInt();
                r=(r+n)%n;
                int b2[]=new int[n];
                int p=0;
                for(int i=0;i<n;i++){
                    p=(i-r+n)%n;
                    b2[p]=a[i];
                }
                System.out.println("The array after being shifted to the left by "+r+" steps is");
                for(int i=0;i<n;i++) {
                    if(i!=n-1)
                    System.out.print(b2[i]+",");
                    else
                    System.out.println(b2[i]);
                }
                break;
            case 10:
                System.out.println("How many steps to the right do you want to rotate the array");
                int r1 = in.nextInt();
                int b3[] = new int[n];
                int p1 = 0;
                r1 = (r1 + n) % n;
                for (int i = 0; i < n; i++) {
                    p1 = (i + r1 + n) % n;
                    b3[p1] = a[i];
                }
                System.out.println("The array after being rotated to the right by " + r1 + " steps is");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(b3[i] + ",");
                    else
                        System.out.println(b3[i]);
                }
                break;
            case 11:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (a[j] == 0 && a[j + 1] != 0) {
                            a[j] = a[j + 1];
                            a[j + 1] = 0;
                        }
                    }
                }
                System.out.println("The new array after moving all the zeroes to the end is");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + ",");
                    else
                        System.out.println(a[i]);
                }
                break;
            case 12:
                int f = 0;
                int hf = 0;
                int m = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i; j < n; j++) {
                        if (a[j] == a[i])
                            f++;
                    }
                    if (f > hf) {
                        hf = f;
                        m = a[i];
                    }
                    f = 0;
                }
                System.out.println("The number " + m + " has the highest frequency " + hf);
                break;
            case 13:
                System.out.println("Enter the sum");
                int s = in.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[i] + a[j] == s) {
                            System.out.println(a[i] + " and " + a[j] + " is a valid pair");
                        }
                    }
                }
                break;
            case 14:
                int c1 = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (a[j] == a[i]) {
                            if (a[j] != 0) {
                                a[j] = 0;
                                c1++;
                            }
                        }
                    }
                }
                int b4[] = new int[n - c1];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (a[j] == 0 && a[j + 1] != 0) {
                            a[j] = a[j + 1];
                            a[j + 1] = 0;
                        }
                    }
                }
                for (int i = 0; i < n - c1; i++) {
                    b4[i] = a[i];
                }
                System.out.println("New array without duplicates is");
                for (int i = 0; i < n - c1; i++) {
                    if (i != n - c1 - 1)
                        System.out.print(b4[i] + ",");
                    else
                        System.out.println(b4[i]);
                }
                break;
            case 15:
                System.out.println("Enter the size of the second array ");
                int n2=in.nextInt();
                int sec[]=new int[n2];
                System.out.println("Enter the elements in the second array ");
                for(int i=0;i<n2;i++){
                    sec[i]=in.nextInt();
                }
                System.out.println("The given array is");
                for(int i=0;i<n2;i++){
                    if(i==0){  
                        System.out.print("["+sec[i]+",");
                    }
                    else if(i==n2-1){
                        System.out.println(sec[i]+"]");
                    }
                    else{
                        System.out.print(sec[i]+",");
                    }
                }
                int c4[] = new int[n + n2];
                for (int i = 0; i < n; i++) {
                    c4[i] = a[i];
                }
                for (int i = 0; i < n2; i++) {
                    c4[n + i] = sec[i];
                }
                System.out.println("The array after merging the given arrays is");
                for (int i = 0; i < n2 + n; i++) {
                    if (i != n2 + n - 1)
                        System.out.print(c4[i] + ",");
                    else
                        System.out.println(c4[i]);
                }
                break;
            case 16:
                System.out.println("Enter the size of the second array ");
                int n3 = in.nextInt();
                int sec1[] = new int[n3];
                System.out.println("Enter the elements in the second array ");
                for (int i = 0; i < n3; i++) {
                    sec1[i] = in.nextInt();
                }
                System.out.println("The given array is");
                for (int i = 0; i < n3; i++) {
                    if (i == 0) {
                        System.out.print("[" + sec1[i] + ",");
                    } else if (i == n3 - 1) {
                        System.out.println(sec1[i] + "]");
                    } else {
                        System.out.print(sec1[i] + ",");
                    }
                }
                int c5[] = new int[n + n3];
                int k = n;
                for (int i = 0; i < n; i++) {
                    c5[i] = a[i];
                }
                for (int i = 0; i < n3; i++) {
                    boolean p2 = false;
                    for (int j = 0; j < k; j++) {
                        if (sec1[i] == c5[j]) {
                            p2 = true;
                            break;
                        }
                    }
                    if (!p2) {
                        c5[k] = sec1[i];
                        k++;
                    }
                }
                System.out.println("The array after union of the given arrays is");
                for (int i = 0; i < n3 + n; i++) {
                    System.out.print(c5[i] + " ");
                }
                break;
            case 17:
                System.out.println("Enter the size of the second array ");
                int n4 = in.nextInt();
                int sec2[] = new int[n4];
                System.out.println("Enter the elements in the second array ");
                for (int i = 0; i < n4; i++) {
                    sec2[i] = in.nextInt();
                }
                System.out.println("The given array is");
                for (int i = 0; i < n4; i++) {
                    if (i == 0) {
                        System.out.print("[" + sec2[i] + ",");
                    } else if (i == n4 - 1) {
                        System.out.println(sec2[i] + "]");
                    } else {
                        System.out.print(sec2[i] + ",");
                    }
                }
                int f1 = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n4; j++) {
                        if (a[i] == sec2[j]) {
                            f1++;
                        }
                    }
                }
                int k1 = 0;
                int c6[] = new int[f1];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n4; j++) {
                        if (a[i] == sec2[j]) {
                            boolean p3 = false;
                            for (int l = 0; l < k1; l++) {
                                if (c6[l] == a[i]) {
                                    p3 = true;
                                    break;
                                }
                            }
                            if (!p3) {
                                c6[k1++] = a[i];
                            }
                        }
                    }
                }
                System.out.println("The array after intersection of the given arrays is");
                for (int i = 0; i < f1; i++) {
                    System.out.print(c6[i] + " ");
                }
                break;
            case 18:
                int temp = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
                System.out.println("The sorted array is ");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + ",");
                    else
                        System.out.println(a[i]);
                }
                break;
            case 19:
                int temp1 = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (a[j] < a[i]) {
                            temp1 = a[j];
                            a[j] = a[i];
                            a[i] = temp1;
                        }
                    }
                }
                System.out.println("The sorted array is ");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + ",");
                    else
                        System.out.println(a[i]);
                }
                break;
            case 20:
                System.out.println("Enter the element you want to search");
                int x2 = in.nextInt();
                int temp2 = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            temp2 = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp2;
                        }
                    }
                }
                System.out.println("The sorted array is ");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + ",");
                    else
                        System.out.println(a[i]);
                }
                int beg = 0, end = n - 1, mid = 0;
                int flag3 = -1;
                while (beg <= end) {
                    mid = (beg + end) / 2;
                    if (a[mid] > x2) {
                        end = mid - 1;
                    } else if (a[mid] < x2) {
                        beg = mid + 1;
                    } else {
                        flag3 = mid;
                        break;
                    }
                }
                if (flag3 == -1) {
                    System.out.println("The given element is not present in the array ");
                } else {
                    System.out.println("The element is present in the array at position " + (flag3 + 1));
                }
                break;
            case 21:
                int temp3 = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (a[j + 1] > a[j]) {
                            temp3 = a[j + 1];
                            a[j + 1] = a[j];
                            a[j] = temp3;
                        }
                    }
                }
                System.out.println("The sorted array in desecending order is ");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + ",");
                    else
                        System.out.println(a[i]);
                }
                break;
            default:
                System.out.println("Choose carefully from the given options!!");
                break;

        }

    }
}
