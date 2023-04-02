#include <iostream>
#include <list>
using namespace std;

class Box{
private:
	double length;
	double with;
	double high;
	static int number;

public:
	Box(double le, double wi, double hi, int nu) : length(le), with(wi), high(hi) {this->number = nu;}
	~Box(){}
	double V(){
		double V = length * with * high;
		return V;
	}
	void print(){
		cout << length << endl;
		cout << with << endl;
		cout << high << endl;
	}

	static void printN(){
		cout << number << endl;
	}
};

int main()
{
	Box B1(1, 2, 3, 2);
	Box B2(2, 3, 3, 4);
	list<Box> values;
	values.push_back(B1);
	values.push_back(B2);
	list<Box>::iterator it; //声明一个迭代器
	for(it = values.begin(); it != values.end(); it++){
    	(*it).print();
		(*it).printN();
		cout << (*it).V() << endl;
}
	return 0;
}
