public class gpu extends Items{
    private String gpuName;
    private String gpuType; //GDDR5, GDDR6, GDDR6X
    private String gpuMemory;
    private int gpuBidwidth;

    public gpu(){

    }

    public gpu(String itemID, double price, String brand, int quantity, String itemType, String gpuName, String gpuType, String gpuMemory, int gpuBidwidth){
        super(itemID, price, brand, quantity, itemType);
        this.gpuName = gpuName;
        this.gpuType = gpuType;
        this.gpuMemory = gpuMemory;
        this.gpuBidwidth = gpuBidwidth;
    }

    public String getGpuName(){
        return gpuName;
    }

    public void setGpuName(String gpuName){
        this.gpuName = gpuName;
    }

    public String getGpuType(){
        return gpuType;
    }

    public void setGpuType(String gpuType){
        this.gpuType = gpuType;
    }

    public String getGpuMemory(){
        return gpuMemory;
    }

    public void setGpuMemory(String gpuMemory){
        this.gpuMemory = gpuMemory;
    }

    public int getGpuBidwidth(){
        return gpuBidwidth;
    }

    public void setGpuBidwidth(int gpuBidwidth){
        this.gpuBidwidth = gpuBidwidth;
    }


    public String toString(){
        return super.toString() +
                        "\nGPU Name: " + gpuName +
                        "\nGPU Type: " + gpuType +
                        "\nGPU BidWidth: " + gpuBidwidth + "bit" +
                        "\nGPU Memory: " + gpuMemory;
    }


}
