#include <stdio.h> 
#include <iostream> 
#include <vector> 
#include <sstream> 
#include <string> 
using namespace std; 

vector<int> readVals(){
 
   vector<int> vec;
   int val;
      
   while(cin >> val){
       vec.push_back(val);
   }
     
   return vec;
}

void printVals(vector<int> v){
   
   for(size_t i = 0; i < v.size(); i++){
       cout << v[i] << " ";
   }
   
   cout << endl;
}

int main(){
   
   vector<int> vec = readVals();
   cout << endl; 
   
   printVals(vec); 
   cout << endl;
   return 0;
}

