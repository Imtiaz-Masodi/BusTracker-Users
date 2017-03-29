package com.users;

import java.util.List;

/**
 * Created by MOHD IMTIAZ on 25-Mar-17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
