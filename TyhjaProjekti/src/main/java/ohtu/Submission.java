package ohtu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Submission {
    private String student_number;
    private String week;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
    private int hours;

    public String getStudent_number() {
        return student_number;
    }

    public String getWeek() {
        return week;
    }

    public int getHours() {
        return hours;
    }
    
    public String getDone() throws Exception {
        String x = "";
        
        for (int i = 1; i <= 21; i++) {
            if (Submission.class.getDeclaredField("a"+i).getBoolean(this)) {
                x += " " + i;
            }
        }
        
        return x;
    }
    
    public int countDone() throws Exception {
        int x = 0;
        
        for (int i = 1; i <= 21; i++) {
            if (Submission.class.getDeclaredField("a"+i).getBoolean(this)) {
                x++;
            }
        }
        
        return x;
    }

    @Override
    public String toString() {
        try {
            return " viikko " + week
                    + ": tehtyjä tehtäviä yhteensä: " + countDone()
                    + ", aikaa kului " + getHours()
                    + ", tehdyt tehtävät:" + getDone();
        } catch (Exception ex) {
            Logger.getLogger(Submission.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
}