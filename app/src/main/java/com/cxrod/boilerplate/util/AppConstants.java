package com.cxrod.boilerplate.util;

/**
 * Created by crodriguez on 6/14/17.
 */

public class AppConstants {

    public static final String STATUS_CODE_SUCCESS = "success";
    public static final String STATUS_CODE_FAILED = "failed";

    public static final int API_STATUS_CODE_LOCAL_ERROR = 0;

    //TODO: Rename whit you own DB an Pref names
    public static final String DB_NAME = "cxrod_boilerplate.db";
    public static final String PREF_NAME = "cxrod_pref";

    public static final long NULL_INDEX = -1L;

    public static final String SEED_DATABASE_OPTIONS = "seed/users.json";

    public static final String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}
