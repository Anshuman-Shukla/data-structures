package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessor processor){
        super(processor);
    }

    @Override
    public void play(String videFile) {
        processor.process(videFile);
    }
}
