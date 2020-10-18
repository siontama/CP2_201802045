#include <iostream>
#include <stdexcept>
class Test {
public:
	Test(char id) : id_(id) {}
	~Test() {
		std::cout << "Destructor execution: "
			<< id_ << std::endl;
	}
private:
	char id_;
};
int funcB() {
	Test r('B');
	throw std::runtime_error("Exception from funcB!\n");
	std::cout << "Executed in B" << std::endl;
	return 0;
}
int funcA() {
	Test r('A');
	funcB();
	std::cout << "Executed in A" << std::endl;
	return 0;
}
int main() {
	try {
		funcA();
	}
	catch (std::exception& e) {
		std::cout << "Exception : " << e.what();
	}
}
/* (실습 1-1) 분석결과 : 
예외가 발생하지 않았으므로 정상적으로 main함수에서 funcA함수 funcB함수를 진입하고
스택에 쌓여진 순서대로 funcB의 결과부터 출력이 되고 소멸자도 실행이 된다.
*/

/* (실습 1-2) 분석결과 : funcB 에서 throw를 던져 스택 되감기가 실행돼 main함수의 catch가 그 예외를 잡아 함수의 끝까지 도달하지 못하므로 함수들에 있는 cout문을 실행되지 못하고 main문의 catch가 실행되었다.*/