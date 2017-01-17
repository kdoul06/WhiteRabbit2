package com.ergasia.omada4.whiterabbit2.models;

/**
 * Created by USER on 17/1/2017.
 */

public class Poi {


        public String userId;
        public double lat;
        public double lon;
        public String catId;
        public String catDescr;


        public Poi(String userId, double lat, double lon, String catId, String catDescr) {
            this.userId = userId;
            this.lat = lat;
            this.lon = lon;
            this.catId = catId;
            this.catDescr = catDescr;
        }

        public Poi () {

        }

    }


