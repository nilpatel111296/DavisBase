package com.davidbase.model.impl;

import com.davidbase.model.DavidBaseError;
import com.davidbase.model.QueryBase;
import com.davidbase.model.QueryResult;
import com.davidbase.utils.DavidBaseFileHandler;

import java.util.List;

/**
 * This class represents a Select Query
 * supports a single table.
 */
public class SelectFrom implements QueryBase {

    private String tableName;
    private List<String> columns;

    @Override
    public QueryResult execute() {
        try {
            DavidBaseFileHandler.readFromFile(tableName);
        }catch(Exception e){
            e.printStackTrace();
            throw new DavidBaseError("Error while creating new table");
        }
        return null;
    }
}
