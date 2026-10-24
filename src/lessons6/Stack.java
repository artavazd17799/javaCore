package lessons6;

public class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack(){
        tos = -1;
    }
   // разместить элемент в стеке
    void push(int item) {
        if(tos==9)
            System.out.println(" stek zapolen.");
        else;
        stck[++tos] =item;
    }
    //izvlech element iz steka
    int pop(){
        if(tos< 0){
            System.out.println("stek ne zagrujon");
            return 0;
        }
        else;
        return stck [tos--];
    }
}
