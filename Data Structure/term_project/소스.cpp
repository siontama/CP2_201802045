#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

void file_save(vector<string>& data, fstream& myfile) {
	myfile.open("test.txt");
	if (myfile.is_open())
	{
		for (int i = 0; i < data.size(); i++)
		{
			myfile << data[i] + " ";
		}
		myfile.close();
	}
	else cout << "Unable to open file";
}

void file_load(vector<string>& data, fstream& myfile) {
	if (myfile.is_open())
	{
		string str;
		while (myfile >> str)
		{
			data.push_back(str);
		}
		myfile.close();
	}
	else cout << "Unable to open file";
}

void page_print(vector<string>& data, int page_count) {
	int line_count = 1;
	system("cls");
	string line = "";
	for (int i = 0; i < data.size(); i++)
	{
		line += data[i] + " ";
		if (line.size() + data[i].size() > 75) {
			if (page_count * 20 < line_count && line_count <= (page_count + 1) * 20)
			{
				cout << setw(2) << line_count << "| " << line << "\n";
			}
			line_count++;
			line = "";
		}
	}
}

void page_insert(vector<string>& data, int line_index, int str_index, string insert_str) {
	int line_count = 1;
	int str_count = 1;
	string line = "";
	if (insert_str.size() > 75) throw 1;
	for (int i = 0; i < data.size(); i++)
	{
		if (line_index == line_count && str_index == str_count) {
			data.insert(data.begin()+ i + 1, insert_str);
			return;
		}
		line += data[i] + " ";
		if (line.size() + data[i].size() > 75) {
			line_count++;
			line = "";
			str_count = 1;
		}
		else {
			str_count++;
		}
	}
	throw 1;
}

void page_erase(vector<string>& data, int line_index, int str_index) {
	int line_count = 1;
	int str_count = 1;
	string line = "";
	for (int i = 0; i < data.size(); i++)
	{
		if (line_index == line_count && str_index == str_count) {
			data.erase(data.begin() + i);
			return;
		}
		line += data[i] + " ";
		if (line.size() + data[i].size() > 75) {
			line_count++;
			line = "";
			str_count = 1;
		}
		else {
			str_count++;
		}
	}
	throw 1;
}

void transform(vector<string>& data, string target_str, string trans_str) {
	for (int i = 0; i < data.size(); i++)
	{
		if (data[i] == target_str) {
			data[i] = trans_str;
		}
	}
}

void search(vector<string>& data, string target_str) {
	for (int i = 0; i < data.size(); i++)
	{
		if (data[0] == target_str) {
			break;
		}
		data.erase(data.begin());
	}
}

int main() {
	int page_count = 0;
	string command;
	string console_msg = "(콘솔메시지)";
	vector<string> data;
	fstream myfile("test.txt");

	file_load(data, myfile);

	while (1) {
		page_print(data, page_count);

		cout << "--------------------------------------------------------------------------------\n";
		cout << "n:다음페이지, p:이전페이지, i:삽입, d:삭제, c:변경, s:찾기, t:저장후종료\n";
		cout << "--------------------------------------------------------------------------------\n";
		cout << console_msg << "\n";
		cout << "--------------------------------------------------------------------------------\n";
		cout << "입력: ";
		cin >> command;
		cout << "--------------------------------------------------------------------------------\n";
		if (command == "n") {
			page_count++;
		}
		else if (command == "p") {
			if (page_count == 0) {
				console_msg = "This is the first page!";
			}
			else {
				page_count--;
			}
		}
		else if (command == "t") {
			file_save(data, myfile);
			exit(0);
		}
		else if (command[0] == 's') {
			string para1;
			for (int i = 2; i < command.size()-1; i++) {
				para1 += command[i];
			}
			search(data, para1);
		}
		else if (command[0] == 'i') {
			string para1;
			string para2;
			string para3;
			int i;
			for (i = 2; i < command.size() - 1; i++) {
				if (command[i] == ',')break;
				para1 += command[i];
			}
			for (i += 1; i < command.size() - 1; i++) {
				if (command[i] == ',')break;
				para2 += command[i];
			}
			for (i += 1; i < command.size() - 1; i++) {
				para3 += command[i];
			}
			try {
				page_insert(data, stoi(para1), stoi(para2), para3);
			}
			catch (...) {
				console_msg = "잘못된 인자 입력입니다.";
			}
		}
		else if (command[0] == 'd') {
			string para1;
			string para2;
			int i;
			for (i = 2; i < command.size() - 1; i++) {
				if (command[i] == ',')break;
				para1 += command[i];
			}
			for (i += 1; i < command.size() - 1; i++) {
				para2 += command[i];
			}
			try {
				page_erase(data, stoi(para1), stoi(para2));
			}
			catch (...) {
				console_msg = "잘못된 인자 입력입니다.";
			}
		}
		else if (command[0] == 'c') {
			string para1;
			string para2;
			int i;
			for (i = 2; i < command.size() - 1; i++) {
				if (command[i] == ',')break;
				para1 += command[i];
			}
			for (i += 1; i < command.size() - 1; i++) {
				para2 += command[i];
			}
			transform(data, para1, para2);
		}
	}
	return 0;
}