package day31_Constructors;

public class Offer {


    public String location, compName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH,isFulltime;





    public void setInfo(String location, String compName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFulltime) {
        this.location = location;
        this.compName = compName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFulltime = isFulltime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", compName='" + compName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary="+ "$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFulltime=" + isFulltime +
                '}';
    }
}
