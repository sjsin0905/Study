#include <stdio.h>

        #define COUNT 20

        int main()
        {
        // 1~20의 숫자를 랜덤하게 가지는 배열
        int data[COUNT]
        = { 5 , 15 , 7 , 20 , 1 ,
        4 , 10 , 2 , 8  , 11,
        9 ,  6 , 13, 18 ,  3,
        16, 12 , 14, 17 , 19 };


        //정렬되지 않은 데이터 출력
        printf("랜덤하게 섞여있는 데이터 값 : ");
        for (int i = 0; i < COUNT; i++)
        {
        printf("%d ", data[i]);
        }

        return 0;
        }