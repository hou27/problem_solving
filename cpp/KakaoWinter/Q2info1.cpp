#include<iostream>
#include<string> //need this
using namespace std;
int main(void) {
    //mixed string
    string str1 = "33BlockDMask";
 
    //test1
    int num1 = stoi(str1);
    cout << "test1. stoi(str1);" << endl;
    cout << " - str1 : " << str1 << endl;
    cout << " - num1 : " << num1 << endl;
    cout << endl;
 
    //test2
    size_t sz;
    int num2 = stoi(str1, &sz);
    cout << "test2. stoi(str1, &sz);" << endl;
    cout << " - str1 : " << str1 << endl;
    cout << " - num2 : " << num2 << endl;
    cout << " - sz : " << sz << endl;
    cout << " - str1[sz] : " << str1[sz] << endl;
    cout << " - str1.substr(sz) : " << str1.substr(sz) << endl;
 
    cout << endl;
    //test3
    string str2 = "";
    cout << "test3. stoi(str2, nullptr, base);" << endl;
    
    //string binary -> int
    str2 = "1110";
    cout << " - stoi(1110, nullptr, 2) : " << stoi(str2, nullptr, 2) << endl;
    
    //string oct -> int
    str2 = "014";
    cout << " - stoi(014 , nullptr, 8) : " << stoi(str2, nullptr, 8) << endl;
 
    //string hex -> int
    str2 = "0x14";
    cout << " - stoi(0x14, nullptr, 16) : " << stoi(str2, nullptr, 16) << endl;
    
    cout << endl;
    system("pause");
    return 0;
}


//출처: https://blockdmask.tistory.com/333 [개발자 지망생]