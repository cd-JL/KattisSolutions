#include <iostream>
#include<iomanip>
#include <vector>
using namespace std;

int main() {
	int N;
	vector<int> unis;
	cin >> N;
	long long int sum = 0;
	for (int i = 0; i < N; ++i) {
		int pop;
		cin >> pop;
		unis.push_back(pop);
	}
	for (int i = 0; i < unis.size(); ++i) {
		if (unis[i] < i) {
			cout << 1;
			return 0;
		}
	}
	for (int i = unis.size() - 1; i >= 1; --i) {
		int dif = unis[i - 1] - unis[i];
		if (dif >= 0) {
			sum += dif + 1;
			unis[i - 1] -= dif + 1;
		}
	}
	cout << sum;
	return 0;
}

/*
3
5 2 3

*/
