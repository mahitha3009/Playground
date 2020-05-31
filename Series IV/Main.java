#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int j=1;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
      std::cout<<(j*j)-2<<" ";
    else
      std::cout<<(j*j)-1<<" ";
    j++;
  }
}