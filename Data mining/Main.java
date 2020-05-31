#include<iostream>
using namespace std;
int main()
{
  int n,esum=0,osum=0;
  std::cin>>n;
  while(n>0)
  {
    int r=n%10;
    if(r%2==0)
      esum+=r;
    else 
      osum+=r;
     n=n/10;
    }
    if(esum==osum)
      std::cout<<"Yes";
    else
      std::cout<<"No";
}