// 2차원 배열 - 리팩토링2
// 구조 개선 - 초기화, 배열의 길이
// 이 코드를 보니 2가지 개선할 부분이 있다.
// 1. 초기화: 기존 배열처럼 2차원 배열도 편리하게 초기화할 수 있다.
// 2. for 문에서 배열의 길이 활용: 배열의 길이가 달라지면 for 문에서 row < 2, column < 3 같은 부분을 같이 변경해야한다.
// 배열이 커지거나 줄어들어도 for 문의 코드를 변경하지 않고 그대로 유지할 수 있다.

// 코드를 개선해보자.

package javaStart.array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = { // 1차원때와 같이 앞에 new int[][] 생략 가능하다.
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

// 초기화
// 1차원 배열은 다음과 같이 초기화한다.
// {1, 2, 3}

// 2차원 배열은 다음과 같이 초기화한다. 밖이 행이 되고, 안이 열이 된다. 그런데 이렇게 하면 행열이 잘 안느껴진다.
// {{1, 2, 3}{4, 5, 6}}

// 이렇게 라인을 적절하게 넘겨주면 행과 열이 명확해진다. 따라서 코드를 더 쉽게 이해할 수 있다.
// {
//   {1, 2, 3}
//   {4, 5, 6}
// }

// 배열의 길이
// for 문에서 2차원 배열의 길이를 활용했다.
// - arr.length 는 행의 길이를 뜻한다. 여기서는 2가 출력된다.
//      - {{},{}}를 생각해보면 arr 배열은 {},{} 2개의 배열 요소를 가진다.
// - arr[row].length 는 열의 길이를 뜻한다. 여기서는 3이 출력된다.
//      - arr[0]은 {1, 2, 3} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
//      - arr[1]은 {4, 5, 6} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.

// 이제 배열의 초기화 부분만 다음과 같이 변경하면 바로 적용된 결과를 알 수 있다. 나머지 코드는 변경하지 않아도 된다.
