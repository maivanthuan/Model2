package Case_study.ReadAndWrite;
import Case_study.Model.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWriteEmployee {
        public List<Employee>readFileEmployee(String filePath){
            List<Employee>employeeList=new ArrayList<>();
              FileReader fileReader;
              BufferedReader br = null;
            try {
                 fileReader=new FileReader(filePath);
                 br=new BufferedReader(fileReader);
                String line;
                String[] temp;
                while ((line=br.readLine())!=null){
                    temp=line.split(",");
                    String id=temp[0];
                    String name=temp[1];
                    String dateOfBirth=temp[2];
                    String gender=temp[3];
                    String CMND=temp[4];
                    String phoneNumber=temp[5];
                    String email=temp[6];
                    String level=temp[7];
                    String location=temp[8];
                    String wage=temp[9];
                    Employee employee=new Employee(id,name,dateOfBirth,gender,CMND,phoneNumber,email,level,location,wage);
                    employeeList.add(employee);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return employeeList;
        }
        public void writeFileEmployee(String filePath, List<Employee>employeeList){
            FileWriter fileWriter;
            BufferedWriter brw=null;
            try {
                fileWriter=new FileWriter(filePath);
                brw=new BufferedWriter(fileWriter);
                StringBuilder str= new StringBuilder();
                for (Employee employee:employeeList){
                    str.append(employee.getId()).append(",").append(employee.getName()).append(",").append(employee.getDateOfBirth()).append(",").append(employee.getGender()).append(",").append(employee.getCMND()).append(",").append(employee.getPhoneNumber()).append(",")
                            .append(employee.getEmail()).append(",").append(employee.getLevel()).append(",").append(employee.getLocation()).append(",").append(employee.getWage()).append("\n");
                }
                if (str.length() > 0){
                    brw.write(str.toString());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    brw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
}
