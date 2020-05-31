#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int i=0,nw=0;
	char a[100][100];
  for(i=0;i<100;i++)
  {
    cin.getline(a[i],100);
    
    nw++;
    if(!strcmp(a[i],"####"))
      break;
  }
  cout<<a[0]<<endl;
  for(i=0;i<nw;i++)
  {
    int k=strlen(a[i])-1;
    if(a[i][k]==a[i+1][0])
      cout<<a[i+1]<<endl;
  }
  
  
}