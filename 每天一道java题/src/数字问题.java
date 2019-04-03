public class 数字问题 {

    /**
     * 题目
     * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
     * @param arg
     *
     * 分析，三位数 也就是百位，十位，个位， 百位上能有四种选择 1，2，3，4 十位上也有四种选择 1，2，3，4
     * 各位上也有四位选择 1，2，3，4，所以这个题就是循环这个几个数放到百位 十位 个位 上,
     * 然后 再是不允许重复
     */
    public static  void main(String [] arg){

        int[] num = new int[]{1,2,3,4};
        for (int i = 0;i<3;i++){
            int baiwei = num[i];
            for (int j =0;j<num.length;j++){
                int shiwei = num[j];
                for (int k = 0;k<num.length;k++){
                    int gewei = num[k];
                    if(baiwei!=shiwei && shiwei != gewei && baiwei != gewei){
                        System.out.println("组成的数："+baiwei+shiwei+gewei);
                    }
                }
            }
        }

    }
}
