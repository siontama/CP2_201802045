#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

class PageStrategy {
public:
	virtual void command_run() {
	};
	virtual void command_run(vector<string>& data, int page_count) {
	};
	virtual void command_run(vector<string>& data, int line_index, int str_index, string insert_str) {
	};
	virtual void command_run(vector<string>& data, int line_index, int str_index) {
	};
	virtual void command_run(vector<string>& data, string target_str, string trans_str) {
	};
	virtual void command_run(vector<string>& data, string target_str) {
	};
};

class PagePrint : public PageStrategy {
public:
	void command_run(vector<string>& data, int page_count) {
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
};

class PageInsert : public PageStrategy {
public:
	void command_run(vector<string>& data, int line_index, int str_index, string insert_str) {
		int line_count = 1;
		int str_count = 1;
		string line = "";
		if (insert_str.size() > 75) throw 1;
		for (int i = 0; i < data.size(); i++)
		{
			if (line_index == line_count && str_index == str_count) {
				data.insert(data.begin() + i + 1, insert_str);
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
};

class PageErase : public PageStrategy {
public:
	void command_run(vector<string>& data, int line_index, int str_index) {
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
};

class PageTransform : public PageStrategy {
public:
	void command_run(vector<string>& data, string target_str, string trans_str) {
		for (int i = 0; i < data.size(); i++)
		{
			if (data[i] == target_str) {
				data[i] = trans_str;
			}
		}
	}
};

class PageSearch : public PageStrategy {
public:
	void command_run(vector<string>& data, string target_str) {
		for (int i = 0; i < data.size(); i++)
		{
			if (data[0] == target_str) {
				break;
			}
			data.erase(data.begin());
		}
	}
};

class Editor {
public:
	Editor(PageStrategy* page, string _path) {
		pageStrategy = page;
		path = _path;
		myfile.open(path);
	}
	virtual void command_run() {
		pageStrategy->command_run(data, page_count);
	}
	virtual void command_run(int line_index, int str_index, string insert_str) {
		pageStrategy->command_run(data, line_index, str_index, insert_str);
	}
	virtual void command_run(int line_index, int str_index) {
		pageStrategy->command_run(data, line_index, str_index);
	}
	virtual void command_run(string target_str, string trans_str) {
		pageStrategy->command_run(data, target_str, trans_str);
	}
	virtual void command_run(string target_str) {
		pageStrategy->command_run(data, target_str, target_str);
	}
	void setPageStratege(PageStrategy* page) {
		pageStrategy = page;
	}
	int getPageCount() {
		return page_count;
	}
	void pagePlust() {
		page_count++;
	}
	void pageMinus() {
		page_count--;
	}
	string getConsoleMsg() {
		return console_msg;
	}
	void file_save() {
		myfile.open(path);
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

	void file_load() {
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
	void command_select(string command) {
		if (command == "n") {
			pagePlust();
		}
		else if (command == "p") {
			if (page_count == 0) {
				console_msg = "This is the first page!";
			}
			else {
				pageMinus();
			}
		}
		else if (command == "t") {
			file_save();
			exit(0);
		}
		else if (command[0] == 's') {
			string para1;
			for (int i = 2; i < command.size() - 1; i++) {
				para1 += command[i];
			}
			setPageStratege(pageSearch);
			command_run(para1);
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
				setPageStratege(pageInsert);
				if (page_count * 20 >= stoi(para1) || stoi(para1) > (page_count + 1) * 20)
					throw 1;
				command_run(stoi(para1), stoi(para2), para3);
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
				setPageStratege(pageErase);
				if (page_count * 20 >= stoi(para1) || stoi(para1) > (page_count + 1) * 20)
					throw 1;
				command_run(stoi(para1), stoi(para2));
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
			setPageStratege(pageErase);
			command_run(para1, para2);
		}
	}
protected:
	PageStrategy* pageStrategy;
	int page_count = 0;
	vector<string> data;
	string path;
	fstream myfile;
	string console_msg = "(콘솔메시지)";
	string command;
	PageStrategy *pagePrint = new PagePrint;
	PageStrategy *pageInsert = new PageInsert;
	PageStrategy *pageErase = new PageErase;
	PageStrategy *pageTrans = new PageTransform;
	PageStrategy *pageSearch = new PageSearch;
};

int main() {
	PageStrategy *pagePrint = new PagePrint;
	Editor *editor = new Editor(pagePrint, "test.txt");
	editor->file_load();

	while (1) {
		string cmd;
		editor->setPageStratege(pagePrint);
		editor->command_run();
		cout << "--------------------------------------------------------------------------------\n";
		cout << "n:다음페이지, p:이전페이지, i:삽입, d:삭제, c:변경, s:찾기, t:저장후종료\n";
		cout << "--------------------------------------------------------------------------------\n";
		cout << editor->getConsoleMsg() << "\n";
		cout << "--------------------------------------------------------------------------------\n";
		cout << "입력: ";
		cin >> cmd;
		cout << "--------------------------------------------------------------------------------\n";
		editor->command_select(cmd);
	}
	return 0;
}