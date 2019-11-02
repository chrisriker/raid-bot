import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

// Fun ideas for stuff:
// 1) Keep raid rosters and their classes; dump a report of all of the
//    members in the raid and the raids party protects/buffs etc.
// 2) Auto ping members 1h or 30m before raid

public class RaidBot {
    public void addRaid(Raid aRaid)
    {
        Raid raid = new Raid();
    }

    public static void main(String[] args) throws LoginException
    {
        JDABuilder builder  = new JDABuilder( AccountType.BOT );
        // TODO - Do this
        builder.setToken("");
        builder.buildAsync();

        System.out.println("Not yet implemented");
    }
}
