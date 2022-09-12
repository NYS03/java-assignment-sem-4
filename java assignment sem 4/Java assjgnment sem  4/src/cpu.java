public class cpu extends Items{
    private String cpuName;
    private String totalCores;
    private String totalThreads;
    private String ClockSpeed;


    public cpu(){

    }

    public cpu(String itemID, double price, double brand, double quantity, double itemType, String cpuName, String totalCores, String totalThreads, String ClockSpeed){
        super(itemID, price, brand, quantity, itemType);
        this.cpuName = cpuName;
        this.totalCores = totalCores;
        this.totalThreads = totalThreads;
        this.ClockSpeed = ClockSpeed;
    }

    public String getCpuName(){
        return cpuName;
    }

    public void setCpuName(String cpuName){
        this.cpuName = cpuName;
    }

    public String getTotalCores(){
        return totalCores;
    }

    public void setTotalCores(String totalCores){
        this.totalCores = totalCores;
    }

    public String getTotalThreads(){
        return totalThreads;
    }

    public void setTotalThreads(String totalThreads){
        this.totalThreads = totalThreads;
    }

    public String getClockSpeed(){
        return ClockSpeed;
    }

    public void setClockSpeed(String ClockSpeed){
        this.ClockSpeed = ClockSpeed;
    }

    public String toString(){
        return super.toString() +
                        "\nCPU Name: " + cpuName +
                        "\nTotal Cores: " + totalCores +
                        "\nTotal Threads: " + totalThreads +
                        "\nClock Speed: " + ClockSpeed;
    }



}
