#include <iostream>

using namespace std;

void printUnique(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        bool isDuplicate = false;
        for (int j = 0; j < size; j++)
        {
            if (j != i && arr[j] == arr[i])
            {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate)
        {
            cout << arr[i] << " ";
        }
    }
}

int main()
{
    int arr[] = {1, 2, 2, 3, 4, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    printUnique(arr, size);

    return 0;
}