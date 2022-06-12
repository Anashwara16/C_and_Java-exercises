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

// returns a vector of values from v that are greater than 0
// these values are in the same relative order as they are in v.
vector<int> valsGT0(vector<int> v){
   
   vector<int> positiveNumbers;
   
   for (size_t i = 0; i < v.size(); i++){
      
        if (v[i] > 0){
            positiveNumbers.push_back(v[i]);
        }
    }

    return positiveNumbers;
}


int main(){
   
   vector<int> vec = readVals();
   cout << endl;
   cout << "Original vector: "; 
   printVals(vec); 
   cout << endl;
   
   vector<int> fvec = valsGT0(vec);
   cout << "Filtered vector: ";
   printVals(fvec); 
   cout << endl;
   
   return 0;
}

