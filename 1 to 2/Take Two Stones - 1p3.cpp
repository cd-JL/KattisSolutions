#include <iostream>
using namespace std;

int main() {
	int N;
	std::cin >> N;
	if (N % 2 == 1) {
		cout << "Alice\n";
	}
	else {
		cout << "Bob\n";
	}
}