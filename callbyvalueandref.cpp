#include <iostream>
using namespace std;

int add1(int arr[]) {
arr[1]=100;
 cout<<"call by value"<<endl;  
for(int i=0;i<5;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int add2(int (*arr)[5]) {
*arr[1]=100;
cout<<endl;
cout<<"call by reference"<<endl;
for(int i=0;i<5;i++){
        cout<<*arr[i]<<" ";
    }
}
int change(int a){
   a=20;
   cout<<a<<endl;
}

int main() {
    int *a=new int;
    *a=10;

   
cout<<endl;
change(*a);
   
    cout<<a<<endl;
}