package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public abstract class Video {

    protected  VideoProcessor processor;

    public Video(VideoProcessor processor) {
        this.processor = processor;
    }
    public abstract  void play(String videFile);
}
