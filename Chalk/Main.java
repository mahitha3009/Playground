#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,s;
  std::cin>>n;
  s=(1/sqrt(n))*n;
  int days=n+s+1;
  std::cout<<days;
}