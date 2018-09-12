package com.yogurtpowered.dash.baby.tracker;

import com.yogurtpowered.dash.Dash;
import com.yogurtpowered.dash.DashListener;
import com.yogurtpowered.dash.DashTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BabyTracker {
    private static final Logger LOG = LoggerFactory.getLogger(BabyTracker.class);

    public static void main(String[] args) throws Exception {
        final DashTracker tracker = (args.length == 1) ? new DashTracker(args[0]) : new DashTracker();

        final Dash dash = tracker.registerDash("Glad", "00:bb:3a:81:0d:67");

        final DashListener listener = d -> LOG.info("The baby is awake!");
        tracker.registerListener(dash, listener);

        tracker.listen();
    }
}
