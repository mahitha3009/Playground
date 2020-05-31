#include<iostream>
#include<string.h>
using namespace std;
int main()
{
   char s1[50];
  char s2[50];
  std::cin>>s1;
  std::cin>>s2;
  int res=strcmp(s1,s2);
    if(res==0)
      cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}