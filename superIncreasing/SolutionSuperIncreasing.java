/*
    Q) 수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴

    input args_1 : int 타입을 요소로 갖는 배열 arr. arr[i]는 정수
    output : boolean 타입 리턴

    [caution]
    arr[i]는 arr[0]부터 arr[i-1]까지의 합보다 커야한다
*/


package superIncreasing;

public class SolutionSuperIncreasing {
    public boolean superIncreasing(int[] arr){

        // 빈 배열이면 false 리턴
        if(arr.length == 0) return false;

        // 요소의 합 변수 선언, 할당
        // 배열 첫번째 요소로 초기화해둔다
        int sum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= sum){
                return false;
            }
            sum += arr[i];
        }
        return true;
    }
}
/*
   초기화한 sum이 순회할 arr[i]보다 크거나 같으면 false

   이전 요소들의 합이 sum으로 나타나게 된다
   처음 sum은 배열 0번째 요소만 할당 되어 있었는데
   반복문을 i가 1번째부터 돌면서 0번째와 대수 비교를 하며
   0번째보다 i번째가 더 커야하니까 만족하지 않는 조건에 한해서 전부 false를 주고
   sum에 sum + 배열 i번째 요소를 더해준다

   그러면 이전 요소들의 합보다 뒤에있는 i번째 요소가 큰 구조가 나타나게되고
   그건 true를 반환한다

 */
