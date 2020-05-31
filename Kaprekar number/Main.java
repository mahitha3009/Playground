#include <iostream>
#include<cmath>
using namespace std;
int main()
{
   int n,count_n=0,count_s=0;
   cin>>n;
   int temp=n;
   while(temp!=0)
   {
       count_n++;
       temp=temp/10;
   }
   int sq=n*n;
    while(sq!=0)
   {
       count_s++;
       sq=sq/10;
   }
  sq=n*n;
   if(n==1)
   cout<<"Kaprekar Number";
   else
   {
       int b=pow(10,count_n);
       int sum=(sq/b)+(sq%b);
       if(n==sum)
       cout<<"Kaprekar Number";
       else
       cout<<"Not a Kaprekar Number";
   }
}