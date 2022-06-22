package com.example.bpgh;

/**
 * Created by songmho on 2014-08-03.
 */
public class item {

    private int profile; // 친구 정보
        private String info; // 친구 정보


        public String getInfo() {
            return info;
        }
        public int getProfile() {
        return profile;
        }



        public item(int profile, String info) {
            this.profile = profile;
            this.info = info;


        }
    }