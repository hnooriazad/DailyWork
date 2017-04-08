package hna.pro.dailywork;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {

	 private TableLayout tableLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		  tableLayout=(TableLayout)findViewById(R.id.tableLayout);

	        for (int i=0;i<5;i++){
	            View tableRow = LayoutInflater.from(this).inflate(R.layout.table_item,null,false);
	            TextView history_display_no  = (TextView) tableRow.findViewById(R.id.history_display_no);
	            TextView history_display_date  = (TextView) tableRow.findViewById(R.id.history_display_date);
	            TextView history_display_orderid  = (TextView) tableRow.findViewById(R.id.history_display_orderid);
	            TextView history_display_quantity  = (TextView) tableRow.findViewById(R.id.history_display_quantity);

	            history_display_no.setText(""+(i+1));
	            history_display_date.setText("2014-02-05");
	            history_display_orderid.setText("S0"+(i+1));
	            history_display_quantity.setText(""+(20+(i+1)));
	            tableLayout.addView(tableRow);
	        }

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
