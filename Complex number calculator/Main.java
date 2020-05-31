#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a,b,c,d;
  cin>>a>>b;
  cin>>c>>d;
  if(n>3)
    cout<<"Invalid choice";
  else if(n==3)
  {
    int x=(a*c)-(b*d);
    int y=(a*d)+(b*c);
    cout<<x<<y<<"i";
  }
  else if(n==2)
  {
    int x=a-c;
    int y=b-d;
    cout<<x<<"+"<<y<<"i";
}
}