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


/**
 * returns location of last instance of target in v or -1 if not found
 */ 
int findLast(vector<int> v, int target){
   
   int position = -1;

   for (size_t i = 0; i < v.size(); i++){
            
      if (v[i] == target){
            position = i;
      }      
   }
   
   return position;
}


void testFindLast(vector<int> v, int target){
    
   printVals(v);
   cout << endl;
   cout << "The last instance of " << target << " is at position: " << findLast(v, target) << endl;
   cout << endl;
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

   int target = 7; 
   cout << "Find last position of target in the original vector: ";
   testFindLast(vec, target); 
   cout << "Find last position of target in the filtered vector: ";
   testFindLast(fvec, target); 
   cout << endl; 
    
   return 0;
}

