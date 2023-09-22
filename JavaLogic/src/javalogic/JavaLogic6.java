package javalogic;

public class JavaLogic6 {


    public static void main(String[] args) {
        int n = 4;	// n個の文字の中で
        int r = 4;	// r個を選んで組み合わせ
        int[] arr = {1, 2, 3, 4};
        int[] output = new int[n];				// 順列を保存する配列
        boolean[] visited = new boolean[n];		//重複した値を選ばないためにチェックする値

        //順列の個数
        int count = 1;
        //もし4つの数字を組み合わせるとしたら可能な個数は'４＊３＊２＊１'だから4から1まで全部掛ける。
        for(int i=arr.length; i>0; i--) count = count * i;
        System.out.println("count: "+count);
        System.out.println("==============");
        
        perm(arr, output, visited, 0, n, r);
    }

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
    	//depthは数字が入る欄の番号
    	//depthが４なら全ての数字が入っているのだから、出力してリターン
    	if (depth == r) {
            print(output);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {		//空いている欄はflaseなのでif文を実行して
                visited[i] = true;			//if文を一度実行したらtrueに変える
                output[depth] = arr[i];		//output配列に値を入れる
                perm(arr, output, visited, depth + 1, n, r);	//depthを1個ずつ増やしながら繰り返し
                visited[i] = false;			//リターンされる前に溜まっている直近の関数のi値をfalseに変える
            }
        }
    }

    // 配列を出力
    static void print(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    	}
        System.out.println();
    }
		
 
	



}
