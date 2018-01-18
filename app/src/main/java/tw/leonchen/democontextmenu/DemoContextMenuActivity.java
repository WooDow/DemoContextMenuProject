package tw.leonchen.democontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DemoContextMenuActivity extends AppCompatActivity {

    private LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_context_menu);

        linear = (LinearLayout)findViewById(R.id.linear);
        registerForContextMenu(linear);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //getMenuInflater().inflate(R.menu.mymenu, menu);
        menu.add(0,0,0,"Kitty");
        menu.add(0,1,0,"SuperMan");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(DemoContextMenuActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
        return true;
    }
}
