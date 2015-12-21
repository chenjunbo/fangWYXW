package com.xiangmu.wyxw.Bean;

/**
 * Created by Administrator on 2015/12/18.
 */
public class NewsBean {
    String date;//日期
    String num;//数量
    String title;//标题
    String url;//地址
    String replaycount;//评论数量
    String lanMuType;//类型

    public String getDate() {
        return date;
    }

    public String getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getReplaycount() {
        return replaycount;
    }

    public String getLanMuType() {
        return lanMuType;
    }




    public NewsBean(String date, String num, String title, String url, String replaycount, String lanMuType) {
        this.date = date;
        this.num = num;
        this.title = title;
        this.url = url;
        this.replaycount = replaycount;
        this.lanMuType = lanMuType;
    }
}
