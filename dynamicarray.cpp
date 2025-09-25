#include<iostream>
using namespace std;

int main(){
    int *ptr = (int*)malloc(5*sizeof(int));
    cout<<"Enter the elements of array"<<endl;
    for(int i=0; i<5;i++){
    cin>>ptr[i];
    }
    cout<<"The elements of array are"<<endl;
    for(int i=0; i<5;i++){
    cout<<ptr[i]<<" ";
    }
}