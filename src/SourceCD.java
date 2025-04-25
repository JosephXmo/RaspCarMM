public class SourceCD implements Runnable {
    private final AudioEngine engine;
    private volatile boolean running = true;

    public SourceCD(AudioEngine engine) {
        this.engine = engine;
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        System.out.println("SourceCD 启动中...");
        while (running) {
            try {
                // 模拟从CD读取音频数据
                byte[] dummyAudio = new byte[1024]; // 假数据
                engine.play(dummyAudio);
                Thread.sleep(1000); // 每秒播放一次
            } catch (InterruptedException e) {
                System.out.println("SourceCD 被中断");
                running = false;
            }
        }
        System.out.println("SourceCD 已停止");
    }
}