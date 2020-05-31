#include<iostream>
int main()
{
  int n1,n2;
  int j,sum;
  std::cin>>n1>>n2;
  for(int i=n1;i<n2;i++)
  {
    j=1;sum=0;
    while(j<i)
    {
      if(i%j==0)
        sum+=j;
      j++;
    }
    if(sum==i)
      std::cout<<i<<" ";
  }
}