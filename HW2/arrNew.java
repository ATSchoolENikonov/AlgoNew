import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrNew {
    int[] arr;
    int size;

    public arrNew(int size) {
        this.size = 900;
        this.arr = new int[size];
        for (int i = 0; i < this.size; i++){
            arr[i]= (int)(Math.random()*1000);
        }
    }

    public void delete(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (i == value)
                break;
        }
        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }

    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public void add(int value) {
        this.arr[this.size] = value;
        this.size++;

    }

    public void check() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }
    public void sortBubble(){
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    private void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }
    public void sortSelect(){
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.arr[in]< this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }
    public void sortInsert(){
        int in, out;
        for(out = 1;out < this.size; out++){
            int temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >=temp){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }
    }


}
