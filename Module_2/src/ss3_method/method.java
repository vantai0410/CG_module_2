package ss3_method;

public class method {
    // viêt method hiển thị lời chào, method đang dể void thì ko trả về cái gì cả
//    public static void displayMsg(){
//        System.out.println("hi");
//    }
    // viết method tính tổng 2 số truền vàovaf trả về kq tính dc
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
//        displayMsg();
        int result = sum(4,5);
        System.out.println(result);
    }
}
