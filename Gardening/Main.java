#include<iostream>
using namespace std;
int main()
{
  int r,c,tn;
  cin>>r>>c>>tn;
  if((tn>c && tn<=c*2) || (tn>3*c && tn<=4*c))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}