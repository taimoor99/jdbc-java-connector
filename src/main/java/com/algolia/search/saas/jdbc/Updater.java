package com.algolia.search.saas.jdbc;

import java.sql.SQLException;

import org.json.JSONException;
import org.json.simple.JSONObject;

public class Updater extends Worker {
    public Updater(JSONObject configuration) throws SQLException, org.apache.commons.cli.ParseException, JSONException {
        super(configuration);
        this.currentTime = 0;
    }
    
    @Override
    public void run() {
    }

//    public boolean fetchDataBase() throws SQLException, AlgoliaException, JSONException {
//        List<org.json.JSONObject> json = null;
//        JSONArray attributes = null;
//        if (configuration_ != null && configuration_.get("attributes") != null)
//            attributes = (JSONArray)configuration_.get("attributes");
//        
//        String sql = settings_.query.replaceAll("_\\$", currentTime_);
//        SQLQuery query = dataBase_.listTableContent(sql);
//        
//        if (configuration_ != null && configuration_.get("track") != null)
//            query.trackAttribute((String)configuration_.get("track"));
//        
//        while (!(json = query.toJson(1000, attributes)).isEmpty()) {
//            index_.addObjects(json);
//        }
//        currentTime_ = query.lastUpdate;
//        return true;
//    }
    
    private long currentTime;
}
