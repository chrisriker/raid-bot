import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

import java.util.Set;
import java.util.ArrayList;
import java.util.Date;

public class Raid
{
    // A list of all of the members in the raid
    ArrayList<String> members = new ArrayList<>();
    // A list of all of the sale prices made in a given raid
    ArrayList<Double> sales = new ArrayList<>();
    // The date that the raid took place
    Date date = new Date();

    //@ Calculate the split of the raid
    public double calculateSplit()
    {
        double sum = 0;
        for( int i = 0; i < sales.size(); ++i )
        {
            sum += sales.get( i );
        }

        return sum / members.size();
    }
}

public class RaidBot {
    public void addRaid(Raid aRaid)
    {
        Raid raid = new Raid();
    }

    public static void main(String[] args)
    {
        JDABuilder builder  = new JDABuilder( AccountType.BOT );
        // TODO - Do this
        builder.setToken("");
        builder.buildAsync();
        System.out.println("Not yet implemented");
    }
}
