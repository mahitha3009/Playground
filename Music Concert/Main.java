#include<iostream>
int main(){
int t,count=0,count1=0;
  std::cin>>t;
  int *p=(int *)malloc(t * sizeof(int));
  for(int i=0;i<t;i++)
    std::cin>>*(p+i);
  for(int i=0;i<t;i++)
  {
    if(*(p+i)%2==0)
      count++;
    else 
      count1++;
  }
  std::cout<<count1<<"\n";
  std::cout<<count;
}
     