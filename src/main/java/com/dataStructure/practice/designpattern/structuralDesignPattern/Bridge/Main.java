package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public class Main {
    public static void main(String[] args) {
        YoutubeVideo youtubeVideo=new YoutubeVideo(new UHDProcessor());
        youtubeVideo.play("hhhhh");
        NetflixVideo netflixVideo= new NetflixVideo(new HdProcessor());
        netflixVideo.play("jsjsjsj");


    }
}
