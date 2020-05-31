#include<iostream>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int eyear;
  float pp;
}c[10];
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].eyear;
    cout<<"\nEnter pass percentage";
    cin>>c[i].pp;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].eyear;
    cout<<"\nPass percentage:"<<c[i].pp;
  }
  }