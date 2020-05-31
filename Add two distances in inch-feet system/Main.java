#include<iostream>
using namespace std;
struct dist
{
  float inch;
  float feet;
}d1,d2;
int main()
{
  cin>>d1.inch>>d1.feet;
  cin>>d2.inch>>d2.feet;
  float sf=d1.feet+d2.feet;
  float si=d1.inch+d2.inch;
  if(sf>12)
  {
    si++;
    sf=sf-12;
}
  cout<<si<<"'-"<<sf<<"\"";
}