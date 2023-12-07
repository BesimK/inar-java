package QA.week_10.assignments;

import QA.week_10.additionalClasses.MyStringBuilder2;

public class Question_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 = new MyStringBuilder2("1907");
        MyStringBuilder2 s2 = new MyStringBuilder2("Fenerbahce");
        System.out.println("Insert s2 into s1 at index 2 --------> " + s1.insert(2, s2));
        System.out.println("Reverse s2 --------------------------> " + s2.reverse());
        MyStringBuilder2 s3 = new MyStringBuilder2("0123456789bahce07");
        System.out.println("Substring of s3 beginning index 10---> " + s3.substring(10));
        s2.reverse();
        System.out.println("S2 to upper case --------------------> " + s2.toUpperCase());
    }
}