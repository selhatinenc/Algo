//
// Created by selhatin on 31.1.2023.
//
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;
using System.Numerics;
class Result
{

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

public static BigInteger fibonacciModified(int t1, int t2, int n)
    {
        BigInteger first=t1;
        BigInteger sec=t2;
        if(n==1)return first;
        if(n==2)return sec;
        BigInteger ans=BigInteger.Zero;
        while(n-->2){
            ans=first+sec*sec;
            first=sec;
            sec=ans;
        }
        return ans;

    }

}

class Solution
{
public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string[] firstMultipleInput = Console.ReadLine().TrimEnd().Split(' ');

        int t1 = Convert.ToInt32(firstMultipleInput[0]);

        int t2 = Convert.ToInt32(firstMultipleInput[1]);

        int n = Convert.ToInt32(firstMultipleInput[2]);

        var result = Result.fibonacciModified(t1, t2, n);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
