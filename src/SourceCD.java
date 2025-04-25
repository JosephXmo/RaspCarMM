/*
    RaspCarMM: A classic multimedia head unit system. Powered by Raspberry Pi 4B/5 and Java.
    Copyright (C) 2025  AriaNet

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

import java.util.List;

public class SourceCD implements Runnable {
    private final AudioEngine engine;
    private final List<CDTrack> tracks;
    private volatile boolean running = true;
    private volatile boolean paused = false;
    private volatile int currentTrackIndex = 0;

    public SourceCD(AudioEngine engine, List<CDTrack> tracks) {
        this.engine = engine;
        this.tracks = tracks;
    }

    public void stop() {
        running = false;
    }

    public void pause() {
        paused = true;
    }

    public void resume() {
        paused = false;
    }

    public void nextTrack() {
        currentTrackIndex++;
        if (currentTrackIndex >= tracks.size()) {
            currentTrackIndex = 0; // 回到第一首
        }
    }

    @Override
    public void run() {
        System.out.println("SourceCD 启动中...");
        while (running) {
            if (paused) {
                sleep(500);
                continue;
            }

            CDTrack track = tracks.get(currentTrackIndex);
            System.out.println("播放中: " + track.getTitle());

            for (int i = 0; i < track.getDurationSeconds(); i++) {
                if (!running || paused) break;
                byte[] audioData = new byte[1024]; // 模拟数据块
                engine.play(audioData);
                sleep(1000); // 每秒播放一个数据块
            }

            nextTrack();
        }
        System.out.println("SourceCD 已停止");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("SourceCD 中断");
            running = false;
        }
    }
}
