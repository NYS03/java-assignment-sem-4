public class gpu extends Items{
    private String gpuName;
    private String gpuType; //GDDR5, GDDR6, GDDR6X
    private String gpuMemory;

    public gpu(){

    }

    public gpu(String itemID, double price, double brand, double quantity, double itemType, String gpuName, String gpuType, String gpuMemory){
        super(itemID, price, brand, quantity, itemType);
        this.gpuName = gpuName;
        this.gpuType = gpuType;
        this.gpuMemory = gpuMemory;
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

    public String toString(){
        return super.toString() +
                        "\nGPU Name: " + gpuName +
                        "\nGPU Type: " + gpuType +
                        "\nGPU Memory: " + gpuMemory;
    }


}
