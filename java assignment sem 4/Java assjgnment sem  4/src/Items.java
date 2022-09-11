public class Items {
    private String cpu;
    private double cpuPrice;
    private String ram;
    private double ramPrice;
    private String hdd;
    private double hddPrice;
    private String psu;
    private double psuPrice;
    private String Case;
    private double CasePrice;
    private String gpu;
    private double gpuPrice;
    private String ssd;
    private double ssdPrice;

    public Items(){

    }
    public Items(String cpu, double cpuPrice, String ram, double ramPrice, String hdd, double hddPrice, String psu, double psuPrice, String Case, double CasePrice, String gpu, double gpuPrice, String ssd, double ssdPrice) {
        this.cpu = cpu;
        this.cpuPrice = cpuPrice;
        this.ram = ram;
        this.ramPrice = ramPrice;
        this.hdd = hdd;
        this.hddPrice = hddPrice;
        this.psu = psu;
        this.psuPrice = psuPrice;
        this.Case = Case;
        this.CasePrice = CasePrice;
        this.gpu = gpu;
        this.gpuPrice = gpuPrice;
        this.ssd = ssd;
        this.ssdPrice = ssdPrice;
    }


    public String getCpu() {
            return cpu;
    }

    public void setCpu(String cpu) {
            this.cpu = cpu;
    }

    public double getCpuPrice() {
            return cpuPrice;
    }


    public void setCpuPrice(double cpuPrice) {
            this.cpuPrice = cpuPrice;
    }


    public String getRam() {
            return ram;
    }


    public void setRam(String ram) {
            this.ram = ram;
    }


    public double getRamPrice() {
            return ramPrice;
    }


    public void setRamPrice(double ramPrice) {
            this.ramPrice = ramPrice;
    }


    public String getHdd() {
            return hdd;
    }


    public void setHdd(String hdd) {
                this.hdd = hdd;
    }


    public double getHddPrice() {
            return hddPrice;
    }


    public void setHddPrice(double hddPrice) {
            this.hddPrice = hddPrice;
    }


    public String getPsu() {
            return psu;
    }


    public void setPsu(String psu) {
            this.psu = psu;
    }


    public double getPsuPrice() {
            return psuPrice;
    }


    public void setPsuPrice(double psuPrice) {
            this.psuPrice = psuPrice;
    }


    public String getCase() {
            return Case;
    }


    public void setCase(String Case) {
                this.Case = Case;
    }


    public double getCasePrice() {
            return CasePrice;
    }


    public void setCasePrice(double CasePrice) {
            this.CasePrice = CasePrice;
    }


    public String getGpu() {
            return gpu;
    }


    public void setGpu(String gpu) {
            this.gpu = gpu;
    }


    public double getGpuPrice() {
            return gpuPrice;
    }


    public void setGpuPrice(double gpuPrice) {
            this.gpuPrice = gpuPrice;
    }


    public String getSsd() {
            return ssd;
    }

    public void setSsd(String ssd) {
            this.ssd = ssd;
    }


    public double getSsdPrice() {
            return ssdPrice;
    }


    public void setSsdPrice(double ssdPrice) {
            this.ssdPrice = ssdPrice;
    }

    @Override
    public String toString() {
            return "Items{" + "cpu=" + cpu + ", cpuPrice=" + cpuPrice + ", ram=" + ram + ", ramPrice=" + ramPrice + ", hdd=" + hdd + ", hddPrice=" + hddPrice + ", psu=" + psu + ", psuPrice=" + psuPrice + ", Case=" + Case + ", CasePrice=" + CasePrice + ", gpu=" + gpu + ", gpuPrice=" + gpuPrice + ", ssd=" + ssd + ", ssdPrice=" + ssdPrice + '}';
    }
}
