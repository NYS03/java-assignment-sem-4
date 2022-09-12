public class cpu extends Items{
    private String cpuName;
    private int totalCores;
    private int totalThreads;
    private String ClockSpeed;


    public cpu(){

    }

    public cpu(String itemID, double price, String brand, int quantity, String itemType, String cpuName, int totalCores, int totalThreads, String ClockSpeed){
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

    public int getTotalCores(){
        return totalCores;
    }

    public void setTotalCores(int totalCores){
        this.totalCores = totalCores;
    }

    public int getTotalThreads(){
        return totalThreads;
    }

    public void setTotalThreads(int totalThreads){
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
