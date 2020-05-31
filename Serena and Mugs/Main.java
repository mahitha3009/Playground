#include<iostream>
using namespace std;
int printresult(int s,int n,int sum);
int main()
{
 int n,s,sum=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
    sum+=a[i];
  printresult(s,n,sum);
}
int printresult(int s,int n,int sum)
{
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}
    