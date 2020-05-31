#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int tc=(c1+c2)%100;
  int td=d1+d2+(c1+c2)/100;
  std::cout<<td<<"\n";
  std::cout<<tc;
}