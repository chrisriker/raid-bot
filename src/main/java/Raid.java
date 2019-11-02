import java.util.ArrayList;
import java.util.Date;

public class Raid {
    // A list of all of the members in the raid
    private ArrayList<String> members = new ArrayList<>();
    // A list of all of the sale prices made in a given raid
    private ArrayList<Double> sales = new ArrayList<>();
    // The date that the raid took place
    private Date date = new Date();

    public Raid() {}

    public ArrayList<String> getMembers () {
        return members;
    }

    public void addMember( String member )
    {
        members.add( member );
    }

    public void addMembers( ArrayList<String> members )
    {
        // Note that there is no error checking on the size of the incoming members
        // Since this could theoretically be a cross-game bot, restricting the size of members
        // to the size oe BnS raids is not a good idea.
        // TODO - Reevaluate this conclusion; dealing with people's money correctly is important
        members.addAll( members );
    }

    public void itemSold( double price )
    {
        sales.add( price );
    }

    public double totalEarnings()
    {
        // Iterate over all of the sales and sum them up
        // The sum is not just maintained directly because there may be
        // use in the future for individual sale prices being used for something
        // Performance is not really a huge concern since this is just a discord bot
        // so we can take the computational hit.
        double sum = 0;
        for( int i = 0; i < sales.size(); ++i )
        {
            sum += sales.get( i );
        }

        return sum;
    }

    //@ Calculate the split of the raid
    public double calculateSplit()
    {
        // Avoid division by zero
        if( members.isEmpty())
        {
            return -1;
        }
        return totalEarnings() / members.size();
    }
}
