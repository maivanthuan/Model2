package ss16_IO_file.thuc_hanh;

import java.util.List;

public class NumberMax {
    public static int FindMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max< numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWrite readAndWrite=new ReadAndWrite();
        List<Integer>number=readAndWrite.readFile("C:\\codegym\\Model2\\src\\ss16_IO_file\\thuc_hanh\\in.csv");
        int maxValue=FindMax(number);
        readAndWrite.WriteFile("C:\\codegym\\Model2\\src\\ss16_IO_file\\thuc_hanh\\out.csv", maxValue);
    }
}
