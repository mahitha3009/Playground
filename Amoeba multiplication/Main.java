#include<iostream>
using namespace std;
int main()
{
  int n,f1=0,f2=1,nt=0;
  std::cin>>n;
  if(n==0 || n==1)
    std::cout<<n;
  else
    nt=f1+f2;
  for(int i=3;i<=n;i++)
  {
    f1=f2;
    f2=nt;
    nt=f1+f2;
  }
  std::cout<<f2;
 }