import java.io.PipedWriter;

public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedWriter out;
    public ThreadWrite(WriteData writeData,PipedWriter out){
        super();
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}


