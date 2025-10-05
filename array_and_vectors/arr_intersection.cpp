#include <iostream>

using namespace std;

void printIntersection(int arr1[], int size1, int arr2[], int size2)
{
    for (int i = 0; i < size1; i++)
    {
        for (int j = 0; j < size2; j++)
        {
            if (arr1[i] == arr2[j])
            {
                cout << arr1[i] << " ";
                break;
            }
        }
    }
}

int main()
{
    int arr1[] = {1, 2, 2, 3, 4, 4, 5};
    int arr2[] = {2, 4, 6, 8};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    printIntersection(arr1, size1, arr2, size2);

    return 0;
}