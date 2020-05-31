#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string name;
  std::cin>>name;
  int n=name.size();
  std::cout<<"The number of letters in the name is "<<n;
  return 0;
}