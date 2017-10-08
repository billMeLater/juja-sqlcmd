package ua.com.juja.vadim.sqlcmd.controller.command;


import ua.com.juja.vadim.sqlcmd.controller.Command;
import ua.com.juja.vadim.sqlcmd.model.DatabaseManager;

import java.util.List;

public class Connect extends Command {

    public Connect() {
        name = "connect";
        info = "\tConnect to DB. All parameters mandatory";
        defaultParam = "|dbName|dbUser|password";
    }

    @Override
    public CommandOutput execute(DatabaseManager databaseManager, List params) {
        if (this.validatedParams(params, defaultParam)) {
            return databaseManager.connect(databaseManager, params);
        } else {
            return this._usage();
        }
    }

}
