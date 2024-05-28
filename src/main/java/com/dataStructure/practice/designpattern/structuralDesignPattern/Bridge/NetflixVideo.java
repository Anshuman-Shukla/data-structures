package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public class NetflixVideo extends Video {
    public NetflixVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videFile) {
        processor.process(videFile);
    }
}
