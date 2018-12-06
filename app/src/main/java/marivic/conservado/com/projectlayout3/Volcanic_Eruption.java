package marivic.conservado.com.projectlayout3;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Volcanic_Eruption extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Philippine Institute of Volcanology and Seismology (PHIVOLCS)");
        listDataHeader.add("National Disaster Risk Reduction and Management Council (NDRRMC)");
        listDataHeader.add("Red Cross");

        // Adding child data
        List<String> PHIVOLCS = new ArrayList<String>();
        PHIVOLCS.add("Trunkline: (02) 426-1468 to 79, local 124/125 (Seismology)");

        List<String> NDRRMC = new ArrayList<String>();
        NDRRMC.add("Operations Center: (02)911-1406, (02)912-2665, (02)912-5668, (02) 911-1873");

        List<String> Red = new ArrayList<String>();
        NDRRMC.add("Hotline: 143, (02) 527-0000, (02) 527-8385 to 95");


        listDataChild.put(listDataHeader.get(0), PHIVOLCS); // Header, Child data
        listDataChild.put(listDataHeader.get(1), NDRRMC); // Header, Child data
        listDataChild.put(listDataHeader.get(2), Red); // Header, Child data
    }
}
