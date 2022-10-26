package ss4_class_obiect.bai_tap;

import java.time.LocalTime;

public class main {
    public static class stopwatch {
        private LocalTime startTime, endTime;
        public stopwatch() {
            startTime=LocalTime.now();
        }
        public stopwatch(LocalTime startTime, LocalTime endTime) {
            this.startTime=startTime;
            this.endTime=endTime;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }
        public void start() {
            startTime = LocalTime.now();
        }
        public void end() {
            endTime = LocalTime.now();
        }
        public int getElapseTime() {
            int milisecond =(((endTime.getHour()-startTime.getHour())*3600)+(endTime.getMinute()*60-startTime.getMinute())*3600+
                    (endTime.getSecond()-startTime.getSecond())*1000);
            return milisecond;
        }

        public static void main(String[] args) {
            LocalTime start=LocalTime.now();
            LocalTime end= LocalTime.now();
            stopwatch stw= new stopwatch(start, end);
            System.out.println("Thời gian: "+stw.getElapseTime()+" Millisecond");
        }
    }
}
