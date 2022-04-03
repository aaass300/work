
#include<iostream>
using namespace std;
 
class first
{
public:
    virtual void it()
    {
        cout<<"first::it() is called"<<endl;
    }
};
 
class second:public first
{
public:
    void it()
    {
        cout<<"second::it() is called"<<endl;
    }
};
 
int main(void)
{
    first*a = new second();
    a->it();   
    return 0;
}
