#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  for(int r=1;r<=4;r++)
  {
    for(int c=1;c<=r;c++)
        {
          std::cout<<n;
        }
    n++;
        std::cout<<"\n";
        }
for(int r=4;r>=1;r--)
{
  for(int c=1;c<=r;c++)
  {
    std::cout<<n-1;
  }
  n--;
  std::cout<<"\n";
}
}
    