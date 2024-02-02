package stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class YearOfAgeCalc {

    public static void main(String[] args) throws ParseException {
        List<EmployeeName> list = new ArrayList<EmployeeName>();

        list.add(new EmployeeName(100, "Ranjith", "24/04/1994"));
        list.add(new EmployeeName(101, "Sujatha", "24/04/1992"));
        list.add(new EmployeeName(102, "Sravanth", "24/04/1993"));
        list.add(new EmployeeName(103, "Vijay", "24/04/2016"));

        System.out.println("print the list of employeeNames:" + list);

//        String s1= "24/04/1994";
//        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
//        Date parse = simpleDate.parse(s1);

        Calendar calendarInstance = Calendar.getInstance(TimeZone.getDefault());
       // calendar.setTime(parse);
        int currentYear=calendarInstance.get(Calendar.YEAR);
        System.out.println("-----------" + currentYear);


        List<EmployeeName> collect = list.stream().filter((f) -> {
            try {

                SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
                Date parse = simpleDate.parse(f.getDob());

                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                calendar.setTime(parse);
                int dobYear = calendar.get(Calendar.YEAR);
                int sub = currentYear - dobYear;
                System.out.println("-----------" + sub);
                return currentYear - dobYear > 25;
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());


        collect.forEach(System.out::println);
        }



    }




class EmployeeName {

    private long id;
    private String EmpName;
    private String dob;

    public EmployeeName() {

    }

    public EmployeeName(long id, String empName, String dob) {
        this.id = id;
        EmpName = empName;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "EmployeeName{" +
                "id=" + id +
                ", EmpName='" + EmpName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}