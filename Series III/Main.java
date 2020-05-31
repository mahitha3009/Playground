#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int j=6;
  int k=5;
  for(int i=1;i<=n;i++)
  {
    std::cout<<j<<" ";
    j=j+k;
    k=k+5;
  }
}