#include<iostream>
using namespace std;
int main()
{
  std::string s1;
  cin>>s1;
  for(int i=0;i<s1.size();i++)
  {
    if(s1[i]>=97 && s1[i]<=122 || s1[i]>=65 && s1[i]<=90)
      cout<<s1[i];
  }
}