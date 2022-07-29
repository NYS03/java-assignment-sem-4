import java.text.SimpleDateFormat;

public class getDateTime(){
    public getDateTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
