package com.atguigu.oop.senior._enum.after;

public enum Season implements Info{
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };;
    
    private String seasonName;
    private String seasonDesc;
    
    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public void show() {
        System.out.println("这是一个季节 : " + seasonName);
    }
}
