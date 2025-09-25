#include<iostream>
using namespace std;    
int add(int a,int b){

    return a+b;
}


int compare(int a,int b){
    if(a>b) return cout<<"a is greater than b"<<endl, a;
    else return cout<<"b is greater than a " <<endl, b;
}

int main(){
    int *ptr = (int*)malloc(2*sizeof(int));
    
    cin>>*ptr ;
    *(ptr+1) = 20;
    cout<<add(*ptr,*(ptr+1))<<endl;
   

    cout<<compare(*ptr,*(ptr+1))<<endl;
    

}