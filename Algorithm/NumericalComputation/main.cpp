#include "task.h"

int main()
{
	int input;
	int precision = 4;
	cout.setf(ios_base::fixed);
	cout.precision(precision);

	while (1)
	{
		menu();
		
		cout << "����������ѡ��:> ";
		cin >> input;
		while (cin.get() != '\n')
		{
			continue;
		}
		cout << endl;
		switch (input)
		{
		case SETGAUSS:
			cout << "�������µľ���:> ";
			cin >> precision;
			cout.precision(precision);
			break;
		case MAGAUSS:
			magauss();
			break;
		case MANETON:
			double x;
			cout << "����x:> ";
			cin >> x;
			manewton(x, precision);
			break;
		case 5:
			system("type ..\\NumericalComputation\\example.txt");
		}
	}

	system("pause");
	return 0;
}